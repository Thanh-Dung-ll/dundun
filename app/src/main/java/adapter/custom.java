package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.tab_frag_bottomna.R;

import java.util.ArrayList;
import java.util.List;

public class custom extends ArrayAdapter<lienhe> {
private Context context;
private int resour;
private List<lienhe> arrlienhe;
    public custom(@NonNull Context context, int resource, ArrayList<lienhe> arr) {
        super(context, resource);
        this.context = context;
        this.resour= resource;
        this.arrlienhe= arr;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.fragment_user, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tvName);
            viewHolder.tvNumberPhone = (TextView) convertView.findViewById(R.id.tvMaSinhVien);
            viewHolder.tvAvatar = (TextView) convertView.findViewById(R.id.tvAvatar);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        lienhe CContact = arrlienhe.get(position);
        viewHolder.tvAvatar.setBackgroundColor(CContact.getColor());
        viewHolder.tvAvatar.setText(String.valueOf(position + 1));
        viewHolder.tvName.setText(CContact.getName());
        viewHolder.tvNumberPhone.setText(CContact.getIdStudent());
        return convertView;
    }

    public class ViewHolder {
        TextView tvName, tvNumberPhone, tvAvatar;
    }
}
