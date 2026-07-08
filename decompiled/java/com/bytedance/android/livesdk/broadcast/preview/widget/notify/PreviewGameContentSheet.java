package com.bytedance.android.livesdk.broadcast.preview.widget.notify;

import X.C01GW;
import X.C0IJT;
import X.C0IPN;
import X.C1143680frq;
import X.C2188811AlT;
import X.C452501pT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C786410Ut5;
import X.C960203pA;
import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.model.GameLiveConvertInfo;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class PreviewGameContentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTHELIOSMlLDh9PywoLionZisjPSY1MWscOyolISA7Di4+LQYjJzs2JjEfISo2PA==";
    public DataChannel LLJLLL;
    public GameLiveConvertInfo LLJZ;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(86));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 174));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 173));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJLLL = C475510Ikn.LJ(this);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        GameLiveConvertInfo gameLiveConvertInfo;
        boolean z;
        String str;
        String strLIZIZ;
        super.onViewCreated(view, bundle);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.yov);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS165S0100000_31(this, 42));
        }
        View viewFindViewById = view.findViewById(R.id.yqm);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 43), viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.yqn);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 44), viewFindViewById2);
        }
        Bundle arguments = getArguments();
        if (arguments != null && (gameLiveConvertInfo = (GameLiveConvertInfo) arguments.getParcelable("key_convert_info")) != null) {
            this.LLJZ = gameLiveConvertInfo;
            TextView textView = (TextView) view.findViewById(R.id.yqq);
            if (textView != null) {
                textView.setText(gameLiveConvertInfo.title);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.yqo);
            if (textView2 != null) {
                textView2.setText(gameLiveConvertInfo.text);
            }
            Context context = view.getContext();
            if (context != null && C960203pA.LIZIZ(context)) {
                z = true;
            } else {
                z = false;
            }
            if (gameLiveConvertInfo.convertType == 1) {
                str = "studio";
            } else {
                str = "phone";
            }
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ttlive_preview_game_content_");
                sbLIZ.append(str);
                sbLIZ.append("_v2_dark.png");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ttlive_preview_game_content_");
                sbLIZ2.append(str);
                sbLIZ2.append("_v2.png");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            View viewFindViewById3 = view.findViewById(R.id.yqp);
            if (viewFindViewById3 != null) {
                C1143680frq.LJ(viewFindViewById3, C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_game_demand_1"), strLIZIZ, ImageView.ScaleType.CENTER_INSIDE);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_takepage_video_convertion_guide_show");
            c474500IjALIZ.LJJII(this.LLJZIJLIL.getValue(), "anchor_id");
            c474500IjALIZ.LJJII("video_live", "live_type");
            if (!TextUtils.isEmpty((String) this.LLL.getValue())) {
                c474500IjALIZ.LJJII(this.LLL.getValue(), "target_live_type");
            }
            if (!TextUtils.isEmpty((String) this.LLLF.getValue())) {
                c474500IjALIZ.LJJII(this.LLLF.getValue(), "guide_content");
            }
            c474500IjALIZ.LIZ();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hm7, viewGroup, false);
    }
}
