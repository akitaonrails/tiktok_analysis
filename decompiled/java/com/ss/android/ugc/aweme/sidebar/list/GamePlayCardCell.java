package com.ss.android.ugc.aweme.sidebar.list;

import X.C01U6;
import X.C1582460rHY;
import X.C20684815ws;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS126S0200000_24;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.scene.Scene;
import com.bytedance.touchpoint.api.model.ButtonContent;
import com.bytedance.touchpoint.api.model.SideBarButton;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class GamePlayCardCell extends PowerCell<C1582460rHY> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fa0;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        ButtonContent buttonContent;
        C1582460rHY c1582460rHY = (C1582460rHY) interfaceC1891350zJl;
        super.onBindItemView(c1582460rHY);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.lx8);
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_task_title);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.tv_task_description);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.tv_task_go);
        C01U6.LIZIZ(new AwS425S0200000_24(c1582460rHY, imageView, 84));
        textView.setText(c1582460rHY.LL.title);
        textView2.setText(c1582460rHY.LL.description);
        SideBarButton sideBarButton = c1582460rHY.LL.button;
        if (sideBarButton != null && (buttonContent = sideBarButton.content) != null) {
            str = buttonContent.text;
        } else {
            str = null;
        }
        tuxTextView.setText(str);
        C786410Ut5.h9(tuxTextView, new ACListenerS126S0200000_24(this, c1582460rHY, 29));
        C786410Ut5.I7(new ACListenerS126S0200000_24(this, c1582460rHY, 30), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.fa0, false, 4, null);
    }

    public static void I5(String str, String str2, Map map) {
        if (Intrinsics.LJFF(str2, "button")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_button");
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        map.put(Scene.SCENE_SERVICE, str);
        C20684815ws.LJIILLIIL("sidebar_entrance_click", map);
    }
}
