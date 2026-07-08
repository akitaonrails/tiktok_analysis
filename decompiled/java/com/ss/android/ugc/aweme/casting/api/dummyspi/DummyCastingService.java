package com.ss.android.ugc.aweme.casting.api.dummyspi;

import X.InterfaceC1370310llN;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.casting.api.ICastingAbility;
import com.ss.android.ugc.aweme.casting.api.ICastingPlayerService;
import com.ss.android.ugc.aweme.casting.api.ICastingSeekListener;
import com.ss.android.ugc.aweme.casting.api.ICastingService;
import com.ss.android.ugc.aweme.casting.api.IPlaybackControlService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class DummyCastingService implements ICastingService {
    public final String LIZ = "";
    public final String LIZIZ = "";
    public final boolean LIZJ = false;
    public final boolean LIZLLL = false;

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final String LIZJ() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean LJI(Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJIIJJI(String str, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJIIL() {
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJIILIIL(String str, String str2, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJIILJJIL() {
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean isConnected() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final IPlaybackControlService LJIIIZ() {
        return new IPlaybackControlService() { // from class: X.0RQk
            @Override // com.ss.android.ugc.aweme.casting.api.IPlaybackControlService
            public final void LIZ(ViewGroup viewGroup) {
            }

            @Override // com.ss.android.ugc.aweme.casting.api.IPlaybackControlService
            public final void LIZIZ(AwS590S0100000_11 awS590S0100000_11) {
            }

            @Override // com.ss.android.ugc.aweme.casting.api.IPlaybackControlService
            public final void LIZJ(ViewGroup viewGroup) {
            }

            @Override // com.ss.android.ugc.aweme.casting.api.IPlaybackControlService
            public final void LIZLLL(MainPageFragment mainPageFragment, boolean z) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final ICastingPlayerService LJIIJ() {
        return new ICastingPlayerService() { // from class: X.0RMd
            @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
            public final void addSeekListener(ICastingSeekListener iCastingSeekListener) {
            }

            @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
            public final boolean blockByCasting(Aweme aweme) {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
            public final ICastingAbility getCastingAbility(InterfaceC665370Q7z interfaceC665370Q7z) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
            public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> getCastingCellComponent() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.casting.api.ICastingPlayerService
            public final C13IQ<? extends AbstractC738140SxQ> getCastingPanelComponent() {
                return null;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean LJ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean LJIIIIZZ() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final InterfaceC1370310llN LIZLLL(Aweme aweme, String str, String str2) {
        return new InterfaceC1370310llN() { // from class: X.0M7c
            @Override // X.InterfaceC1370310llN
            public final float LIZLLL() {
                return -1.0f;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJI() {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJII() {
                return R.raw.icon_chromecast_bold;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIIIZZ() {
                return R.raw.icon_chromecast_bold;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIJJI() {
                return 1;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJIILJJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIJJLI() {
                return 0;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIJ(ImageView imageView, View view, int i) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJIJIIJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJIL() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String LJJIZ() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJI(BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJJJIZL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJJL() {
                return false;
            }

            @Override // X.InterfaceC1370450llb
            public final int LJJJJLI() {
                return 100;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJLZIJ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJLIIIJJIZ() {
                return 2131857288;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJLIIIJL() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean enable() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final String key() {
                return "casting";
            }

            @Override // X.InterfaceC1370310llN
            public final String label() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final C0M7Z LJIIJ() {
                return C0M7Z.ShareButton;
            }

            @Override // X.InterfaceC1370310llN
            public final EnumC1216710hld LJJJZ() {
                return EnumC1216710hld.NORMAL;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIJJ(TextView textView) {
                C1370320llO.LJ(this, textView);
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                return C1370320llO.LIZJ(enumC1369720lkQ);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZLLL(context, baseSharePackage, this);
            }
        };
    }
}
