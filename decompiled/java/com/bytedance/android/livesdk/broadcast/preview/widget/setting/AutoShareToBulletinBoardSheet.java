package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C0UF5;
import X.C1119170fEJ;
import X.C1143680frq;
import X.C1324720kZq;
import X.C1834150xpV;
import X.C20743716Ff;
import X.C497740JfY;
import X.C500260Jjc;
import X.C513200KAs;
import X.C758170Tod;
import X.C786410Ut5;
import X.InterfaceC1142670fqD;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.AutoShareToBulletinBoardSheet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.data.AutoShareLiveCardToBulletinBoard;

/* JADX INFO: loaded from: classes13.dex */
public final class AutoShareToBulletinBoardSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDHELIOSh9PywoLionZjYpPTs6JiJiCDonJxYkKD02HCoOPCM/LTElJw08KTcoGic2LTE=";
    public C1324720kZq LLJLLL;
    public C20743716Ff LLJZ;
    public int LLJZIJLIL = -1;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131851472));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodWR = WR(new View.OnClickListener() { // from class: X.0Tgr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        if (c758170TodWR != null) {
            arrayList.add(c758170TodWR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C497740JfY.LIZLLL(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String str;
        super.onViewCreated(view, bundle);
        C513200KAs.LIZIZ(this, getContext());
        AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard = C0UF5.LJFF;
        if (autoShareLiveCardToBulletinBoard != null) {
            i = autoShareLiveCardToBulletinBoard.switchStatus;
        } else {
            i = 0;
        }
        this.LLJZIJLIL = i;
        C20743716Ff c20743716Ff = (C20743716Ff) view.findViewById(R.id.ben);
        this.LLJZ = c20743716Ff;
        if (c20743716Ff != null) {
            c20743716Ff.setToggleEnabled(false);
        }
        C20743716Ff c20743716Ff2 = this.LLJZ;
        if (c20743716Ff2 != null) {
            c20743716Ff2.setDebounceClickEnabled(true);
        }
        C20743716Ff c20743716Ff3 = this.LLJZ;
        if (c20743716Ff3 != null) {
            c20743716Ff3.setDelayInterval(500L);
        }
        C20743716Ff c20743716Ff4 = this.LLJZ;
        if (c20743716Ff4 != null) {
            c20743716Ff4.setEnabled(false);
        }
        C20743716Ff c20743716Ff5 = this.LLJZ;
        if (c20743716Ff5 != null) {
            c20743716Ff5.setDisabledAlpha(1.0f);
        }
        C1834150xpV.LJIIJ(this.LLJZ, true);
        if (this.LLJZIJLIL == 1) {
            C20743716Ff c20743716Ff6 = this.LLJZ;
            if (c20743716Ff6 != null) {
                c20743716Ff6.setChecked(true);
            }
        } else {
            C20743716Ff c20743716Ff7 = this.LLJZ;
            if (c20743716Ff7 != null) {
                c20743716Ff7.setChecked(false);
            }
        }
        C20743716Ff c20743716Ff8 = this.LLJZ;
        if (c20743716Ff8 != null) {
            C500260Jjc.LJLIIIL(500L, c20743716Ff8, new AwS591S0100000_12(this, 396));
        }
        this.LLJLLL = (C1324720kZq) view.findViewById(R.id.bgd);
        C1324720kZq c1324720kZq = this.LLJLLL;
        if (c1324720kZq != null) {
            if (C513200KAs.LIZIZ(this, getContext())) {
                str = "ttlive_autoshare_to_bb_guide_light.png";
            } else {
                str = "ttlive_autoshare_to_bb_guide_dark.png";
            }
            C1143680frq.LJFF(c1324720kZq, "tiktok_live_broadcast_demand_2", str, ImageView.ScaleType.FIT_XY, new InterfaceC1142670fqD() { // from class: X.0Tgq
                @Override // X.InterfaceC1142670fqD
                public final void LIZ() {
                    String str2 = AutoShareToBulletinBoardSheet._pnsPageId;
                    C20441214yg.LIZIZ("AutoShareToBulletinBoardSheet", "onLoadStarted");
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZIZ(Animatable animatable) {
                    String str2 = AutoShareToBulletinBoardSheet._pnsPageId;
                    C20441214yg.LIZIZ("AutoShareToBulletinBoardSheet", "handleAnimatable");
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZLLL(String str2, Exception exc) {
                    String str3 = AutoShareToBulletinBoardSheet._pnsPageId;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onLoadFail: ");
                    sbLIZ.append(str2);
                    C20441214yg.LIZIZ("AutoShareToBulletinBoardSheet", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZJ(int i2, int i3, String str2) {
                    String str3 = AutoShareToBulletinBoardSheet._pnsPageId;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onLoadSuc: ");
                    sbLIZ.append(str2);
                    C20441214yg.LIZIZ("AutoShareToBulletinBoardSheet", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.fze, viewGroup, false);
    }
}
