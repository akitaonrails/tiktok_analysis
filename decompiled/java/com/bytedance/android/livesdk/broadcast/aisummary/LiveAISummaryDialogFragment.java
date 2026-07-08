package com.bytedance.android.livesdk.broadcast.aisummary;

import X.C011Z;
import X.C01GW;
import X.C09JN;
import X.C0IJT;
import X.C0OM1;
import X.C0TZE;
import X.C0UF5;
import X.C0UO0;
import X.C1119920fFW;
import X.C1143680frq;
import X.C1143780fs0;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LP;
import X.C1954807lC;
import X.C20736316Cj;
import X.C20743716Ff;
import X.C292401Bi;
import X.C418440Gaw;
import X.C474500IjA;
import X.C475510Ikn;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C513200KAs;
import X.C758130ToZ;
import X.C785780Us4;
import X.C786410Ut5;
import X.C814420VxA;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAiSummaryDesignStyleSetting;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAISummaryDialogFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4HELIOSZy46OzAhJC4hMWsAIDk2CQwfPCI+KTc1DSYyJCorDz0yLygpJzs=";
    public final int LL;
    public C20743716Ff LLILLL;
    public long LLILLJJLI = -1;
    public final C01GW LLILZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 154));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        int iLIZIZ;
        boolean zBooleanValue = ((Boolean) this.LLILZ.getValue()).booleanValue();
        int iLIZIZ2 = -1;
        if (zBooleanValue) {
            iLIZIZ = -1;
        } else {
            if (zBooleanValue) {
                throw new C1954807lC();
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(490.0f)));
        }
        boolean zBooleanValue2 = ((Boolean) this.LLILZ.getValue()).booleanValue();
        if (zBooleanValue2) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(500.0f)));
        } else if (zBooleanValue2) {
            throw new C1954807lC();
        }
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.fxs);
        c500980Jkm.LIZIZ = 0;
        c500980Jkm.LIZJ = R.style.ahh;
        c500980Jkm.LJIILIIL = 18;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = iLIZIZ;
        c500980Jkm.LJIIJ = iLIZIZ2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean requireE2EAdaption() {
        return true;
    }

    public LiveAISummaryDialogFragment(int i) {
        this.LL = i;
    }

    public final void MR(boolean z) {
        String str;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_summary_set");
        c474500IjALIZ.LJIIIIZZ();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "click_status");
        if (this.LL == 1) {
            str2 = "capsule_in_room";
        } else {
            str2 = "live_take_detail";
        }
        c474500IjALIZ.LJJII(str2, "show_page");
        c474500IjALIZ.LIZ();
    }

    public final void NR(boolean z) {
        long j;
        C758130ToZ c758130ToZLJ = C0UF5.LJ();
        if (c758130ToZLJ != null) {
            c758130ToZLJ.LIZ = z;
        }
        C480460Ism.LIZ().getClass();
        UserApi userApi = (UserApi) C480460Ism.LIZLLL(UserApi.class);
        if (z) {
            j = 1;
        } else {
            j = 2;
        }
        userApi.updateSwitch(16L, j).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0TXi
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LiveAISummaryDialogFragment@bff1.updateSwitch$1");
                C1C7U.LIZIZ("LiveAISummaryDialogFragment@bff1.updateSwitch$1");
            }
        }, new AfS181S0100000_12(this, 51));
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, X.InterfaceC513210KAt
    public final int getThemeOverlay(Context context) {
        if (this.LL != 0) {
            return C011Z.LIZ.LJIIIZ();
        }
        return C513200KAs.LIZ(context);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        List list;
        boolean z;
        super.onViewCreated(view, bundle);
        C20743716Ff c20743716Ff = (C20743716Ff) view.findViewById(R.id.wtt);
        this.LLILLL = c20743716Ff;
        if (c20743716Ff != null) {
            C758130ToZ c758130ToZLJ = C0UF5.LJ();
            if (c758130ToZLJ != null && c758130ToZLJ.LIZ) {
                z = true;
            } else {
                z = false;
            }
            c20743716Ff.setChecked(z);
        }
        if (this.LL == 1) {
            C500260Jjc.LLFFF(view.findViewById(R.id.ip1));
            C20743716Ff c20743716Ff2 = this.LLILLL;
            if (c20743716Ff2 == null || !c20743716Ff2.isChecked()) {
                MR(true);
                C20743716Ff c20743716Ff3 = this.LLILLL;
                if (c20743716Ff3 != null) {
                    c20743716Ff3.setChecked(true);
                }
                NR(true);
            }
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            String str2 = null;
            if (dataChannelLJ != null) {
                list = (List) dataChannelLJ.gg0(C0TZE.class);
                if (list != null) {
                    str2 = (String) C13LP.LJJJLL(list);
                }
            } else {
                list = null;
            }
            if (C500260Jjc.LJJIIZ(str2)) {
                C500260Jjc.LLFFF(view.findViewById(R.id.m6_));
                TextView textView = (TextView) view.findViewById(R.id.m6a);
                if (textView != null) {
                    textView.setText(str2);
                }
                String strLJIJI = C497740JfY.LJIJI(2131851020);
                String strLJIJJ = C497740JfY.LJIJJ(2131851019, strLJIJI);
                SpannableString spannableString = new SpannableString(strLJIJJ);
                int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
                int length = strLJIJI.length() + iLJJJ;
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezq, getContext())), iLJJJ, length, 33);
                C1119920fFW.LJ(getContext(), spannableString, iLJJJ, length, 33, 6, 500);
                C786410Ut5.p2(spannableString, new C785780Us4(list, this, 2), iLJJJ, length, 33);
                TextView textView2 = (TextView) view.findViewById(R.id.t95);
                textView2.setText(spannableString);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                C500260Jjc.LLFFF(textView2);
            }
        }
        LiveAiSummaryDesignStyleSetting liveAiSummaryDesignStyleSetting = LiveAiSummaryDesignStyleSetting.INSTANCE;
        if (liveAiSummaryDesignStyleSetting.style1()) {
            if (C011Z.LIZ.LJIJ(getContext())) {
                str = "ttlive_ai_summary_example_picture_style1_dark.png";
            } else {
                str = "ttlive_ai_summary_example_picture_style1.png";
            }
        } else if (liveAiSummaryDesignStyleSetting.style2()) {
            if (C011Z.LIZ.LJIJ(getContext())) {
                str = "ttlive_ai_summary_example_picture_style2_dark.png";
            } else {
                str = "ttlive_ai_summary_example_picture_style2.png";
            }
        } else {
            str = "ttlive_ai_summary_example_picture.png";
        }
        C1143680frq.LJIIJ(view.findViewById(R.id.tyz), C1143780fs0.LJIIJJI("tiktok_live_broadcast_normal_1", str), ImageView.ScaleType.FIT_CENTER, null, false, null, 48);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.arx);
        if (tuxNavBar != null) {
            tuxNavBar.LJIIZILJ(false);
            C0OM1 c0om1 = new C0OM1();
            if (this.LL != 1) {
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
                c1251150ifB.LIZLLL = true;
                c1251150ifB.LIZJ(new AwS556S0100000_12(this, 155));
                c0om1.LJ(c1251150ifB);
            }
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = C497740JfY.LJIJI(2131851014);
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZJ(0);
            tuxNavBar.setNavActions(c0om1);
        }
        C20743716Ff c20743716Ff4 = this.LLILLL;
        if (c20743716Ff4 != null) {
            C500260Jjc.LJLIIIL(500L, c20743716Ff4, new AwS591S0100000_12(this, 163));
        }
    }
}
