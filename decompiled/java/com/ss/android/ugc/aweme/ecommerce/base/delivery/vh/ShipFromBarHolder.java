package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh;

import X.C03DZ;
import X.C03IT;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C688502mR;
import X.C786410Ut5;
import X.C806503Db;
import X.C811603Fa;
import X.EnumC1338240kve;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchFrom;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class ShipFromBarHolder extends ECJediViewHolder<DispatchFrom> {
    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public ShipFromBarHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.alw, viewGroup, false));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        C03IT thumbFirstImageUrlModel;
        C03IT thumbFirstImageUrlModel2;
        View viewFindViewById;
        C03IT thumbFirstImageUrlModel3;
        View viewFindViewById2;
        DispatchFrom dispatchFrom = (DispatchFrom) obj;
        if (C811603Fa.LIZ()) {
            C03DZ.LIZ(this.itemView.findViewById(R.id.lkw));
            C03DZ.LIZJ(this.itemView.findViewById(R.id.kob));
            ((TextView) this.itemView.findViewById(R.id.tv_ship_from_title)).setText(dispatchFrom.title);
            C03DZ.LIZJ(this.itemView.findViewById(R.id.tv_ship_from_title));
            C03DZ.LIZJ(this.itemView.findViewById(R.id.lnz));
            C03DZ.LIZ(this.itemView.findViewById(R.id.l8u));
        }
        C03DZ.LIZJ(this.itemView.findViewById(R.id.p76));
        View view = this.itemView;
        WarehouseTag warehouseTag = dispatchFrom.warehouseTag;
        if (warehouseTag == null) {
            C03DZ.LIZ(view.findViewById(R.id.warehouse_tag_group));
        } else {
            C03DZ.LIZJ(view.findViewById(R.id.warehouse_tag_group));
            TextView textView = (TextView) view.findViewById(R.id.tv_warehouse_name);
            RichTextUtil richTextUtil = RichTextUtil.LIZ;
            String str = warehouseTag.template;
            Map<String, String> map = warehouseTag.arguments;
            Boolean bool = Boolean.TRUE;
            richTextUtil.getClass();
            if (str != null && map != null) {
                StringBuilder sb = new StringBuilder(str);
                ArrayList<String> arrayList = new ArrayList();
                for (String str2 : map.keySet()) {
                    String str3 = map.get(str2);
                    if (str3 != null) {
                        arrayList.add(str3);
                        C806503Db.LIZ(sb, str2, str3);
                    }
                }
                spannableStringBuilder = new SpannableStringBuilder(sb);
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    for (String str4 : arrayList) {
                        int iIndexOf = sb.indexOf(str4);
                        int length = str4.length() + iIndexOf;
                        if (iIndexOf >= 0 && length <= sb.length()) {
                            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iIndexOf, length, 17);
                        }
                    }
                }
            } else {
                spannableStringBuilder = null;
            }
            textView.setText(spannableStringBuilder);
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            Image imageLIZ = C688502mR.LIZ(view.getContext(), warehouseTag.icon);
            if (imageLIZ != null) {
                thumbFirstImageUrlModel = imageLIZ.toThumbFirstImageUrlModel();
            } else {
                thumbFirstImageUrlModel = null;
            }
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
            c1331670kl3LIZLLL.LJJIIZ(R.drawable.b5n);
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_XY;
            c1331670kl3LIZLLL.LJJI((ImageView) view.findViewById(R.id.jxb));
            C786410Ut5.h3(c1331670kl3LIZLLL);
        }
        ((TextView) this.itemView.findViewById(R.id.tv_ship_from)).setText(dispatchFrom.text);
        Image imageLIZ2 = C688502mR.LIZ(this.itemView.getContext(), dispatchFrom.icon);
        if (imageLIZ2 != null && (thumbFirstImageUrlModel3 = imageLIZ2.toThumbFirstImageUrlModel()) != null) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(thumbFirstImageUrlModel3);
            c1331670kl3LIZLLL2.LJJIIZ(R.drawable.b5n);
            c1331670kl3LIZLLL2.LJJ = EnumC1338240kve.FIT_XY;
            if (C811603Fa.LIZ()) {
                viewFindViewById2 = this.itemView.findViewById(R.id.kob);
            } else {
                viewFindViewById2 = this.itemView.findViewById(R.id.lkw);
            }
            c1331670kl3LIZLLL2.LJJI((ImageView) viewFindViewById2);
            C786410Ut5.h3(c1331670kl3LIZLLL2);
        }
        Image imageLIZ3 = C688502mR.LIZ(this.itemView.getContext(), dispatchFrom.arrow);
        if (imageLIZ3 != null && (thumbFirstImageUrlModel2 = imageLIZ3.toThumbFirstImageUrlModel()) != null) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL3 = C1326790kdB.LIZLLL(thumbFirstImageUrlModel2);
            c1331670kl3LIZLLL3.LJJIIZ(R.drawable.b5n);
            c1331670kl3LIZLLL3.LJJ = EnumC1338240kve.FIT_XY;
            if (C811603Fa.LIZ()) {
                viewFindViewById = this.itemView.findViewById(R.id.lnz);
            } else {
                viewFindViewById = this.itemView.findViewById(R.id.l8u);
            }
            c1331670kl3LIZLLL3.LJJI((ImageView) viewFindViewById);
            C786410Ut5.h3(c1331670kl3LIZLLL3);
        }
    }
}
