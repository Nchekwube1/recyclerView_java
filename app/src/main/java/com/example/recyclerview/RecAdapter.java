package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecAdapter  extends RecyclerView.Adapter<RecAdapter.ViewHolder> {
    private String data1[],data2[];
    private  int dataImg[];
    private Context dataCtx;

public  RecAdapter(Context ctx,  String programming[],String desc[],int images[]){
dataCtx = ctx;
 data1 = programming;
  data2 = desc;
 dataImg = images;
}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(dataCtx);
        View view =   inflater.inflate(R.layout.custom,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
holder.myText1.setText(data1[position]);
holder.myText2.setText(data2[position]);
holder.myImg.setImageResource(dataImg[position]);
    }

    @Override
    public int getItemCount() {
        return  dataImg.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
    TextView myText1,myText2;
    ImageView myImg;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.prog_text);
            myText2 = itemView.findViewById(R.id.desc_text);
            myImg = itemView.findViewById(R.id.prog_img);
        }
    }
}
