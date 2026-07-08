package com.ss.android.ugc.aweme.feed.assem.tns.mask.photosensitive;

import X.AbstractC20660815t0;
import X.C10IT;
import X.C1668306g5;
import X.C19EG;
import X.C20656615sK;
import X.C2217381BqS;
import X.C634060Otw;
import X.C688120Qyw;
import X.C716540S8u;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C736680Sv4;
import X.InterfaceC20660615sy;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.mask.photosensitive.TUCPhotosensitiveMaskAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.tuc.service.ITUCBizService;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TUCPhotosensitiveMaskAssem extends TUCBaseMaskAssem<TUCPhotosensitiveMaskAssem> implements InterfaceC20660615sy {
    public Integer LLJLL;
    public C20656615sK LLJLLIL;

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final boolean Ap() {
        C10IT c10it = C10IT.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        c10it.getClass();
        return C10IT.LJIILIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final void Ep() {
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("photosensitive_mask", "tryHide");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final void Fp() {
        PopupManager.LJIJ(new AbstractC20660815t0() { // from class: X.0S8w
            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return 0;
            }

            {
                super(this.LL);
            }

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                Object obj;
                ViewGroup viewGroup;
                TUCPhotosensitiveMaskAssem tUCPhotosensitiveMaskAssem = this.LL;
                tUCPhotosensitiveMaskAssem.LLJLLIL = c20656615sK;
                C716540S8u.LIZ.getClass();
                C716540S8u.LIZ("photosensitive_mask", "tryShow");
                Integer num = tUCPhotosensitiveMaskAssem.LLJLL;
                int iLJIJ = ComplianceServiceProvider.LJI().LJIJ();
                tUCPhotosensitiveMaskAssem.LLJLL = Integer.valueOf(iLJIJ);
                if (num != null && iLJIJ == num.intValue() && tUCPhotosensitiveMaskAssem.getContentView().getVisibility() == 0) {
                    C716540S8u.LIZ("photosensitive_mask", "tryShowReturn");
                    return;
                }
                View contentView = tUCPhotosensitiveMaskAssem.getContentView();
                Object obj2 = null;
                if ((contentView instanceof ViewGroup) && (viewGroup = (ViewGroup) contentView) != null) {
                    C786410Ut5.LJJJJI(viewGroup);
                }
                Context context = tUCPhotosensitiveMaskAssem.getContentView().getContext();
                ITUCBizService iTUCBizService = (ITUCBizService) ServiceManager.get().getService(ITUCBizService.class);
                C724270Sb3 c724270Sb3 = tUCPhotosensitiveMaskAssem.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                Aweme aweme = ((VideoItemParams) obj).getAweme();
                C724270Sb3 c724270Sb32 = tUCPhotosensitiveMaskAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                C101O c101oLJIIL = iTUCBizService.LJIIL(context, aweme, ((VideoItemParams) obj2).mEventType, AFwS198S0000000_11.get$arr$(295), new AwS555S0100000_11(tUCPhotosensitiveMaskAssem, 1334), new AwS555S0100000_11(tUCPhotosensitiveMaskAssem, 1335));
                C716540S8u.LIZ("photosensitive_mask", "callTUCShow");
                C722420SVk.LIZ(C722420SVk.LIZ, c101oLJIIL, tUCPhotosensitiveMaskAssem.getContentView());
                C786410Ut5.LJLLLLLL(0, tUCPhotosensitiveMaskAssem.getContentView());
            }
        }, "disturbing_sticker_warning_popup", new C1668306g5("disturbing_sticker_warning_feed_trigger"));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem
    public final void up() {
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("photosensitive_mask", "triggerShow");
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        if (C724240Sb0.LIZ(this) != null) {
            return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
        }
        return false;
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return C634060Otw.LIZ(this);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        Fragment fragmentLJI;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (fragmentLJI = C724240Sb0.LJI(this)) == null) {
            return null;
        }
        return new C688120Qyw(c19egLIZ, fragmentLJI, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.tns.mask.TUCBaseMaskAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(), new C2217381BqS() { // from class: X.0S8x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(59), 6);
        C716540S8u.LIZ.getClass();
        C716540S8u.LIZ("photosensitive_mask", "onViewCreated");
    }
}
