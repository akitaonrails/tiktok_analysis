package com.bytedance.android.livesdk.viewerwishestmp.guidance;

import X.AbstractC1132980faa;
import X.C1129650fVD;
import X.C1143680frq;
import X.C1143920fsE;
import X.C1322110kVd;
import X.C19GT;
import X.C1AI0;
import X.C1AI1;
import X.C1AI2;
import X.C1AI6;
import X.C1AIP;
import X.C20337914i1;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1094160eZy;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftStrategyData;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.viewerwishestmp.guidance.ViewerWishesGuidePage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import wh6.AbS698S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class ViewerWishesGuidePage extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9PiwpPiohPyw/HELIOSISogPCg8ZygmISEtJyw2ZhMlLDg2OhIlOic2OwI5ICs2GCQrLA==";
    public DataChannel LLJLLL;
    public C1AIP LLJZ;
    public List<Gift> LLJZIJLIL;
    public C1AI6 LLL = new C1AI6(false, null, null, null, null, null, null, null, 2046);
    public final long LLLF = System.currentTimeMillis();

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1AI2 c1ai2 = new C1AI2("close", null, C1AI1.LIZIZ(this.LLL), null, null, null, null, this.LLLF, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -134, 2097151);
        C1AI1.LIZ(c1ai2, this.LLJLLL, true);
        C1AI0.LJIILLIIL(c1ai2);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C20337914i1<Boolean> c20337914i1 = InterfaceC1094160eZy.o1;
        if (c20337914i1.LIZIZ().booleanValue()) {
            this.LLL.LJ = true;
        }
        c20337914i1.LJFF(Boolean.FALSE);
        C1AI2 c1ai2 = new C1AI2("show", null, C1AI1.LIZIZ(this.LLL), null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 0, null, 0L, -6, 2097151);
        C1AI1.LIZ(c1ai2, this.LLJLLL, true);
        C1AI0.LJIILLIIL(c1ai2);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C497740JfY.LIZLLL(R.attr.ezk, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long jLJJLIIIJ;
        super.onViewCreated(view, bundle);
        C1322110kVd c1322110kVd = (C1322110kVd) view.findViewById(R.id.viewer_wishes_intro_img);
        C1143920fsE c1143920fsE = new C1143920fsE();
        if (c1322110kVd != null) {
            c1143920fsE.LIZ = c1322110kVd;
        }
        c1143920fsE.LIZIZ = "tiktok_live_interaction_demand_11";
        c1143920fsE.LJFF = true;
        if (C19GT.LLILLJJLI == 1) {
            c1143920fsE.LIZJ = "ttlive_viewer_wishes_guide_animation_day.webp";
        } else {
            c1143920fsE.LIZJ = "ttlive_viewer_wishes_guide_animation_night.webp";
        }
        C1143680frq.LJIIIIZZ(c1143920fsE);
        View viewFindViewById = view.findViewById(R.id.ywe);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS698S0100000_17(this, 6), viewFindViewById);
        }
        AbstractC1132980faa abstractC1132980faa = new AbstractC1132980faa() { // from class: X.0faz
            @Override // X.AbstractC1132980faa
            public final void LIZ(int i, String str) {
            }

            @Override // X.AbstractC1132980faa
            public final void LIZIZ(List<Gift> list) {
            }

            @Override // X.AbstractC1132980faa
            public final void LIZJ(List list, GiftsInfo giftsInfo, GiftStrategyData giftStrategyData, long j, int i) {
                List<Gift> list2;
                GiftPage giftPage;
                ViewerWishesGuidePage viewerWishesGuidePage = this.LIZ;
                if (list != null && (giftPage = (GiftPage) C13LP.LJJJLZIJ(0, list)) != null) {
                    list2 = giftPage.gifts;
                } else {
                    list2 = null;
                }
                viewerWishesGuidePage.LLJZIJLIL = list2;
            }
        };
        C1129650fVD giftRepository = GiftManager.inst().getGiftRepository();
        DataChannel dataChannel = this.LLJLLL;
        if (dataChannel != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
        } else {
            jLJJLIIIJ = 0;
        }
        giftRepository.LJFF(24, jLJJLIIIJ, true, abstractC1132980faa, "");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hwt, viewGroup, false);
    }
}
