package kotlin.jvm.internal;

import X.C09AY;
import X.C0IDP;
import X.C0T45;
import X.C19252910Tv;
import X.C19677511yn;
import X.C21613419iG;
import X.C21613519iH;
import X.C21613619iI;
import X.C339190DRl;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.album.AlbumPreviewFragment;
import com.ss.android.ugc.aweme.tablet.impl.business.split.split.DrawerLayout;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AwS13S0120000_33 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS13S0120000_33 awS13S0120000_33, Object obj) {
        float f;
        C21613519iH c21613519iH;
        View view = (View) obj;
        if (!((C21613419iG) awS13S0120000_33.l0).LJIIJJI()) {
            return Boolean.TRUE;
        }
        if (((C21613419iG) awS13S0120000_33.l0).LLILZIL.isEmpty()) {
            return Boolean.TRUE;
        }
        view.getWidth();
        Iterator<Map.Entry<String, C21613619iI>> it2 = ((C21613419iG) awS13S0120000_33.l0).LLILZIL.entrySet().iterator();
        while (it2.hasNext()) {
            C21613619iI value = it2.next().getValue();
            value.getClass();
            C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ();
            value.LIZJ = C0T45.LIZJ();
            value.LIZ.my();
        }
        C21613419iG c21613419iG = (C21613419iG) awS13S0120000_33.l0;
        FrameLayout frameLayout = c21613419iG.LLJI;
        if (frameLayout != null) {
            boolean z = awS13S0120000_33.z1;
            boolean z2 = awS13S0120000_33.z2;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            int iLJIIZILJ = c21613419iG.LJIIZILJ(true);
            if (layoutParams.width != iLJIIZILJ) {
                layoutParams.width = iLJIIZILJ;
            }
            FrameLayout frameLayout2 = c21613419iG.LLJI;
            if (frameLayout2 != null) {
                C786410Ut5.a6(frameLayout2, layoutParams);
            }
            if (z) {
                DrawerLayout drawerLayout = c21613419iG.LLIZLLLIL;
                if (drawerLayout != null) {
                    drawerLayout.addOnLayoutChangeListener(new C0IDP(new AwS612S0100000_33(c21613419iG, 93), 6));
                }
            } else {
                DrawerLayout drawerLayout2 = c21613419iG.LLIZLLLIL;
                if (drawerLayout2 != null && drawerLayout2.LJIIJ()) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                c21613419iG.LJIILLIIL(f);
                if (z2 && c21613419iG.LLIZLLLIL != null && (c21613519iH = c21613419iG.LLJJIJI) != null) {
                    c21613519iH.S0();
                }
            }
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$1(AwS13S0120000_33 awS13S0120000_33, Object obj) {
        AlbumPreviewFragment albumPreviewFragment;
        C19677511yn c19677511yn;
        if (awS13S0120000_33.z1 && awS13S0120000_33.z2 && (c19677511yn = (albumPreviewFragment = (AlbumPreviewFragment) awS13S0120000_33.l0).LLJJI) != null && c19677511yn.LLILZ) {
            c19677511yn.LLILZ = false;
            C339190DRl.LIZIZ(albumPreviewFragment.LLILZLL);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0120000_33(C21613419iG c21613419iG, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c21613419iG;
        this.z1 = z;
        this.z2 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0120000_33(boolean z, boolean z2, AlbumPreviewFragment albumPreviewFragment, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.z2 = z2;
        this.l0 = albumPreviewFragment;
    }
}
