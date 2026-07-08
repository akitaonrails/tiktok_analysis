package com.ss.android.ugc.aweme.music.v2.assem;

import X.C960203pA;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class MusicLicenseAssem extends DynamicAssem {
    public static final /* synthetic */ int LLJJI = 0;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dpp;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        CharSequence text;
        mo127do();
        Context context = getContext();
        if (context != null) {
            int iLIZ = C960203pA.LIZ(R.attr.zs, context);
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.jxe);
            tuxIconView.setIconRes(R.raw.icon_exclamation_mark_circle_fill);
            tuxIconView.setTintColor(iLIZ);
            TextView textView = (TextView) view.findViewById(R.id.text);
            Context context2 = getContext();
            if (context2 != null) {
                text = context2.getText(2131837781);
            } else {
                text = null;
            }
            textView.setText(text);
            textView.setTextColor(iLIZ);
        }
    }
}
