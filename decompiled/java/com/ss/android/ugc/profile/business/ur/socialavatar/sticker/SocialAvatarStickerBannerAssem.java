package com.ss.android.ugc.profile.business.ur.socialavatar.sticker;

import X.C019F;
import X.C01GW;
import X.C0DXR;
import X.C0HK0;
import X.C1360440lVS;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1910890zpH;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C453560HqU;
import X.C453740Hqm;
import X.C454640HsE;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC454380Hro;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import com.ss.android.ugc.ur.socialavatar.repost.SocialAvatarRepostSettings;
import com.ss.android.ugc.ur.socialavatar.sticker.SocialAvatarStickerBannerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class SocialAvatarStickerBannerAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1360440lVS.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialAvatarStickerBannerAssem.class, "vm", "getVm()Lcom/ss/android/ugc/ur/socialavatar/sticker/SocialAvatarStickerBannerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SocialAvatarStickerBannerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialAvatarStickerBannerViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 888), AFwS259S0000000_21.get$arr$(305), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1165));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1164));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(428));
        this.LLJJJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(743));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 887));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.eiq;
    }

    public final C1360440lVS ip() {
        return (C1360440lVS) this.LLJJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable, java.util.List, java.util.List<X.0Hqm>] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final List<C453740Hqm> hp() throws Exception {
        ?? arrayList;
        C0HK0 c0hk0;
        List<StickerItem> stickers;
        List<StickerItem> stickers2;
        C0HK0 c0hk02;
        if (SocialAvatarRepostSettings.LIZ().enableSorting) {
            C454640HsE c454640HsE = IMStickerApi.LIZ;
            IMSocialAvatarStatus value = c454640HsE.LIZIZ().getImSocialAvatarService().LJJLI(null, false).getValue();
            if (!(value instanceof C0HK0) || (c0hk02 = (C0HK0) value) == null || (stickers2 = c0hk02.getStickers()) == null) {
                stickers2 = C13BV.INSTANCE;
            }
            List<StickerItem> listLJIIJ = c454640HsE.LIZIZ().getImSocialAvatarService().LJIIJ(stickers2, EnumC454380Hro.REPOST_BANNER);
            arrayList = new ArrayList();
            Iterator<StickerItem> it2 = listLJIIJ.iterator();
            while (it2.hasNext()) {
                C453740Hqm c453740HqmLIZLLL = C453560HqU.LIZLLL(it2.next());
                if (c453740HqmLIZLLL != null) {
                    arrayList.add(c453740HqmLIZLLL);
                }
            }
        } else {
            IMSocialAvatarStatus value2 = IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJLI(null, false).getValue();
            if (!(value2 instanceof C0HK0) || (c0hk0 = (C0HK0) value2) == null || (stickers = c0hk0.getStickers()) == null) {
                arrayList = C13BV.INSTANCE;
            } else {
                arrayList = new ArrayList();
                Iterator<StickerItem> it3 = stickers.iterator();
                while (it3.hasNext()) {
                    C453740Hqm c453740HqmLIZLLL2 = C453560HqU.LIZLLL(it3.next());
                    if (c453740HqmLIZLLL2 != null) {
                        arrayList.add(c453740HqmLIZLLL2);
                    }
                }
            }
        }
        ?? LL = arrayList;
        if (ip().LLILLL > 0) {
            LL = C13LP.LL(arrayList, ip().LLILLL);
        }
        if (LL.size() < 5) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Sticker count ");
            sbLIZ.append(LL.size());
            sbLIZ.append(" < 5");
            throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1910890zpH c1910890zpH = (C1910890zpH) this.LLJJIJIL.getValue();
        StringBuilder sb = new StringBuilder("Load stickers: ");
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(LL, 10));
        Iterator it4 = LL.iterator();
        while (it4.hasNext()) {
            Object objLJJJLIIL = C13LP.LJJJLIIL(((C453740Hqm) it4.next()).LLILZIL);
            if (objLJJJLIIL == null) {
                objLJJJLIIL = "";
            }
            arrayList2.add(objLJJJLIIL);
        }
        sb.append(arrayList2);
        c1910890zpH.LIZ("SocialAvatarStickerBannerAssem", sb.toString());
        return LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp(java.util.List<X.C453740Hqm> r14) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.socialavatar.sticker.SocialAvatarStickerBannerAssem.kp(java.util.List):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIJI.getValue()).setOrientation(0);
        ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIJI.getValue()).LJIILJJIL(SocialAvatarStickerPowerCell.class);
        ((RecyclerView) this.LLJJIJI.getValue()).addItemDecoration((C0DXR) this.LLJJJIL.getValue());
        try {
            kp(hp());
            if (ip().LLILZIL) {
                C786410Ut5.LLLLZLL((TuxTextView) this.LLJJIJIIJIL.getValue(), 0);
                Function0<Unit> function0 = ip().LLIZ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1910890zpH c1910890zpH = (C1910890zpH) this.LLJJIJIL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Load stickers failed: ");
            sbLIZ.append(e.getMessage());
            c1910890zpH.LIZ("SocialAvatarStickerBannerAssem", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
