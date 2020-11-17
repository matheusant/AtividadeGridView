package br.com.local.cardview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private Context mContext;
    private List<Jogos> mData;

    public RecyclerAdapter(Context mContext, List<Jogos> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_jogos, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        //passando valores para o RecyclerView
        holder.tvTituloJogo.setText(mData.get(position).getTitulo());
        holder.tvDescricaoJogo.setText(mData.get(position).getDescricao());
        holder.tvRankingJogo.setText(mData.get(position).getRanking());
        holder.imgJogo.setImageResource(mData.get(position).getMiniatura());
        //Evento de clique no cardView
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, Jogo_Activity.class);

                intent.putExtra("Titulo", mData.get(position).getTitulo());
                intent.putExtra("Descricao", mData.get(position).getDescricao());
                intent.putExtra("Ranking", mData.get(position).getRanking());
                intent.putExtra("Miniatura", mData.get(position).getMiniatura());

                mContext.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }

    @Override
    public int getItemCount() {
        //tamanho da lista de livros
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvTituloJogo, tvDescricaoJogo, tvRankingJogo;
        ImageView imgJogo;
        CardView cardView;


        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            tvTituloJogo = itemView.findViewById(R.id.id_lblTituloJogo);
            tvDescricaoJogo = itemView.findViewById(R.id.id_lblDescricaoJogo);
            tvRankingJogo = itemView.findViewById(R.id.id_lblRankigJogo);
            imgJogo = itemView.findViewById(R.id.id_imgJogo);
            cardView = itemView.findViewById(R.id.idCardView);


        }
    }
}
