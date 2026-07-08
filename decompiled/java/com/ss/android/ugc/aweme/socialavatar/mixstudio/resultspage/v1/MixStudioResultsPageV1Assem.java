package com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v1;

import X.AbstractC1335900krs;
import X.AbstractC1387200mCc;
import X.C01GW;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C1906580ziK;
import X.C20600815jK;
import X.C23250099c;
import X.C435650H6l;
import X.C438700HIe;
import X.C440830HQj;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioResultsPageV1Assem extends MixStudioResultsBaseAssem {
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(292));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(291));
    public final C01GW LLLIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(294));
    public final C01GW LLLIILIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(293));
    public final C01GW LLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(295));
    public SmartImageView LLLILZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLLILZJ;

    public final int Ip() {
        return ((Number) this.LLLIL.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem
    public final void Gp() {
        AbstractC1387200mCc abstractC1387200mCcLJFF;
        Fragment fragmentLIZLLL;
        LifecycleCoroutineScope lifecycleScope;
        MixStudioStatusRepository mixStudioStatusRepositoryUp = up();
        if (mixStudioStatusRepositoryUp == null || !mixStudioStatusRepositoryUp.LIZJ() || (abstractC1387200mCcLJFF = C1906580ziK.LJFF()) == null || (fragmentLIZLLL = abstractC1387200mCcLJFF.LIZLLL()) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentLIZLLL)) == null) {
            return;
        }
        C23250099c.LIZLLL(lifecycleScope, null, null, new C438700HIe(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem, com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final void onPagePause() {
        C20600815jK<InterfaceC1891350zJl> state;
        super.onPagePause();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLLILZJ;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null) {
            return;
        }
        state.LJFF(null);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem, com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem, com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getContext();
        if (context == null) {
            super.xo();
            return;
        }
        yp().addView(zp(context), C435650H6l.LIZ(-1, ((Number) this.LLLIILIL.getValue()).intValue(), 0, 0, 0, 252));
        SmartImageView smartImageView = new SmartImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Ip(), Ip());
        layoutParams.gravity = 17;
        layoutParams.topMargin = ((Number) this.LLLIIIIL.getValue()).intValue();
        layoutParams.bottomMargin = ((Number) this.LLLIIIL.getValue()).intValue();
        C786410Ut5.G6(smartImageView, layoutParams);
        this.LLLILZ = smartImageView;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.bottomMargin = ((Number) this.LLLIIL.getValue()).intValue();
        C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv, layoutParams2);
        this.LLLILZJ = viewOnAttachStateChangeListenerC20604515jv;
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(ResultV1Cell.class, LoadingCell.class);
        yp().addView(this.LLLILZ);
        yp().addView(this.LLLILZJ);
        yp().addView(Fp(context));
        super.xo();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem
    public final void Ap(int i, List list) {
        StickerItem stickerItem;
        StickerBase stickerBase;
        StickerImage stickerImage;
        List<String> list2;
        String str;
        super.Ap(i, list);
        if (i < list.size() && i >= 0) {
            C440830HQj c440830HQj = (C440830HQj) C13LP.LJJJLZIJ(i, list);
            if (c440830HQj != null) {
                stickerItem = c440830HQj.LIZ;
            } else {
                stickerItem = null;
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (stickerItem != null && (stickerBase = stickerItem.stickerBase) != null && (stickerImage = stickerBase.image) != null && (list2 = stickerImage.urlList) != null && (str = (String) ListProtector.get(list2, 0)) != null) {
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
                int iIp = Ip();
                int iIp2 = Ip();
                c1331670kl3LJI.LJIIIIZZ = iIp;
                c1331670kl3LJI.LJIIIZ = iIp2;
                c1331670kl3LJI.LJJ(this.LLLILZ);
                c1331670kl3LJI.LIZLLL = false;
                c1331670kl3LJI.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJI.LJIIJ(new AbstractC1335900krs() { // from class: X.0HQS
                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view, Throwable th) {
                        C0HQR c0hqr = MixStudioResultsBaseAssem.LLLFZ;
                        c0hqr.getClass();
                        C1910890zpH c1910890zpH = MixStudioResultsBaseAssem.LLLII;
                        c0hqr.getClass();
                        String str2 = MixStudioResultsBaseAssem.LLLIIII;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("failed to load image, ,error: ");
                        sbLIZ.append(th);
                        c1910890zpH.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                        MixStudioResultsBaseAssem.LLLFZ.getClass();
                        MixStudioResultsBaseAssem.LLLII.LIZ(MixStudioResultsBaseAssem.LLLIIII, "success load image");
                        C0HQT c0hqt = C0HQT.LIZ;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        c0hqt.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZLLL(jCurrentTimeMillis2, "time_ms");
                        C20684815ws.LJIILLIIL("mix_studio_preload_render", c2344009Gk.LIZ);
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x015d A[Catch: all -> 0x019a, TryCatch #0 {all -> 0x019a, blocks: (B:4:0x0003, B:6:0x000c, B:8:0x0010, B:10:0x0016, B:11:0x0019, B:13:0x001d, B:15:0x0023, B:16:0x002c, B:18:0x0032, B:20:0x0038, B:22:0x0045, B:24:0x004b, B:25:0x005c, B:27:0x0060, B:29:0x006f, B:31:0x0075, B:32:0x008a, B:34:0x0090, B:36:0x009a, B:38:0x009e, B:39:0x00a4, B:41:0x00aa, B:43:0x00b6, B:44:0x00b8, B:46:0x00be, B:48:0x00c4, B:49:0x00cd, B:51:0x00d3, B:53:0x00e9, B:54:0x00eb, B:56:0x00f1, B:58:0x00f5, B:62:0x0101, B:64:0x011e, B:65:0x0121, B:68:0x0131, B:70:0x0135, B:72:0x013b, B:74:0x014b, B:76:0x014f, B:78:0x0155, B:79:0x015d, B:82:0x016d, B:84:0x0171, B:86:0x0177, B:88:0x0187, B:90:0x018b, B:92:0x0191), top: B:99:0x0003 }] */
    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bp(java.util.List<X.C440830HQj> r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v1.MixStudioResultsPageV1Assem.Bp(java.util.List, boolean):void");
    }
}
