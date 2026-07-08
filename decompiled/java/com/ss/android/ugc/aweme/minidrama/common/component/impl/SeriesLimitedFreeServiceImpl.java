package com.ss.android.ugc.aweme.minidrama.common.component.impl;

import X.C01GW;
import X.C0C0V;
import X.C1573890r3j;
import X.C1577840rA6;
import X.C1578660rBQ;
import X.C19EH;
import X.C2188811AlT;
import X.C259800zU;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1578650rBP;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.minidrama.common.component.limitedfree.BlockingLimitedFreeFragment;
import com.ss.android.ugc.aweme.minidrama.common.component.limitedfree.LimitedFreeFragment;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService;
import com.ss.android.ugc.aweme.minidrama.common.component.service.MiniDramaLimitedFreePopUpConfig;
import com.ss.android.ugc.aweme.service.MiniDramaAccountService;
import com.ss.android.ugc.aweme.service.MiniDramaHostService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS119S0400000_24;
import kotlin.jvm.internal.AwS233S0300000_24;
import kotlin.jvm.internal.AwS248S0300000_4;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesLimitedFreeServiceImpl implements ISeriesLimitedFreeService {
    public boolean LIZJ;
    public boolean LJ;
    public boolean LJFF;
    public final CopyOnWriteArraySet<String> LIZ = new CopyOnWriteArraySet<>();
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(587));
    public final CopyOnWriteArraySet<InterfaceC1578650rBP> LIZLLL = new CopyOnWriteArraySet<>();

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService
    public final void LJIIL() {
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService
    public final void LIZ() {
        Keva keva = (Keva) this.LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        MiniDramaAccountService.LIZ.getClass();
        MiniDramaAccountService miniDramaAccountServiceLIZ = C1578660rBQ.LIZ();
        sbLIZ.append(miniDramaAccountServiceLIZ != null ? miniDramaAccountServiceLIZ.getCurUserId() : null);
        sbLIZ.append("_KEY_SHOW_RECORD");
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), 1);
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService
    public final boolean LJFF() {
        Keva keva = (Keva) this.LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        MiniDramaAccountService.LIZ.getClass();
        MiniDramaAccountService miniDramaAccountServiceLIZ = C1578660rBQ.LIZ();
        sbLIZ.append(miniDramaAccountServiceLIZ != null ? miniDramaAccountServiceLIZ.getCurUserId() : null);
        sbLIZ.append("_KEY_SHOW_RECORD");
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0) > 0;
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService
    public final void LJIIIZ() {
        if (this.LJFF) {
            this.LJ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService
    public final boolean LJII() {
        return C0C0V.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService
    public final boolean LJI() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService
    public final void LIZIZ(String str) {
        if (str.length() == 0) {
            return;
        }
        this.LIZ.add(str);
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService
    public final void LIZLLL(List<String> list) {
        this.LIZ.addAll(list);
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService
    public final boolean LJIIIIZZ(String str) {
        return this.LIZ.contains(str);
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService
    public final void LJIIJJI(boolean z) {
        this.LIZJ = z;
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService
    public final void LIZJ(String str, AwS425S0200000_24 awS425S0200000_24, AwS568S0100000_24 awS568S0100000_24, AwS119S0400000_24 awS119S0400000_24) {
        if (str != null && str.length() != 0) {
            this.LJFF = true;
            MiniDramaHostService.LIZ.getClass();
            MiniDramaHostService miniDramaHostServiceLIZ = C1573890r3j.LIZ();
            if (miniDramaHostServiceLIZ != null) {
                miniDramaHostServiceLIZ.LJI(str, new AwS425S0200000_24(this, awS425S0200000_24, 67), new AwS425S0200000_24(this, awS568S0100000_24, 68), new AwS233S0300000_24(this, awS568S0100000_24, awS119S0400000_24, 14));
                return;
            }
            return;
        }
        awS425S0200000_24.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.minidrama.common.component.limitedfree.BlockingLimitedFreeFragment] */
    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService
    public final void LJIIJ(FragmentManager fragmentManager, int i, boolean z, Function0 function0) {
        C259800zU c259800zU = new C259800zU();
        ?? blockingLimitedFreeFragment = new BlockingLimitedFreeFragment(new AwS248S0300000_4(c259800zU, (C259800zU<BlockingLimitedFreeFragment>) function0, (Function0<Unit>) fragmentManager, (FragmentManager) 10), z, false);
        c259800zU.element = blockingLimitedFreeFragment;
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        c19ehLJIIJ.LIZIZ(i, blockingLimitedFreeFragment);
        c19ehLJIIJ.LJIIJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.minidrama.common.component.limitedfree.LimitedFreeFragment] */
    @Override // com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService
    public final void LJ(FragmentManager fragmentManager, int i, C1577840rA6 c1577840rA6, MiniDramaLimitedFreePopUpConfig miniDramaLimitedFreePopUpConfig, AwS390S0200000_24 awS390S0200000_24, Function0 function0) {
        String str;
        String str2 = miniDramaLimitedFreePopUpConfig.title;
        boolean z = false;
        if (str2 == null || str2.length() == 0 || (str = miniDramaLimitedFreePopUpConfig.buttonText) == null || str.length() == 0) {
            z = true;
        }
        if (!LJFF() && !z) {
            C259800zU c259800zU = new C259800zU();
            ?? limitedFreeFragment = new LimitedFreeFragment(new AwS119S0400000_24(c259800zU, awS390S0200000_24, this, fragmentManager, 3));
            limitedFreeFragment.LLILLJJLI = c1577840rA6.LIZ;
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("limited_free_title", miniDramaLimitedFreePopUpConfig.title, bundle);
            C786410Ut5.LJJJI("limited_free_sub_title", miniDramaLimitedFreePopUpConfig.subTitle, bundle);
            C786410Ut5.LJJJI("limited_free_image_cta", miniDramaLimitedFreePopUpConfig.buttonText, bundle);
            C786410Ut5.LJJJI("highlight_text", miniDramaLimitedFreePopUpConfig.highlightText, bundle);
            C786410Ut5.LJJJI("highlight_color", miniDramaLimitedFreePopUpConfig.highlightColor, bundle);
            limitedFreeFragment.setArguments(bundle);
            c259800zU.element = limitedFreeFragment;
            Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI("limit_free");
            if (fragmentLJJJJZI != null) {
                C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
                c19ehLJIIJ.LJIIJ();
            }
            C19EH c19ehLJIIJ2 = fragmentManager.LJIIJ();
            c19ehLJIIJ2.LIZJ(i, limitedFreeFragment, "limit_free");
            c19ehLJIIJ2.LJIIJ();
            Iterator<InterfaceC1578650rBP> it2 = this.LIZLLL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
    }
}
