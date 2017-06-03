package br.com.jeancarlos.beerlist.dagger;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * @author Jean Carlos
 * @since 03/06/17
 */

@SuppressWarnings("SpellCheckingInspection")
class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private final Context mContext;
    private List<Pessoa> listPesoas;


    public RecyclerAdapter(Context context) {
        this.mContext = context;
    }

    public void setupItems(List<Pessoa> pessoas) {
        this.listPesoas = pessoas;
        notifyDataSetChanged();
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_pessoa, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pessoa pessoa = listPesoas.get(position);

        holder.textViewNome.setText(pessoa.getName());
        holder.textViewCar.setText(pessoa.getCar().getPlaca());
    }


    @Override
    public int getItemCount() {
        return listPesoas == null ? 0 : listPesoas.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewNome;
        TextView textViewCar;

        public MyViewHolder(View itemView) {
            super(itemView);

            textViewNome = (TextView) itemView.findViewById(R.id.text_nome);
            textViewCar = (TextView) itemView.findViewById(R.id.text_car);
        }
    }
}
