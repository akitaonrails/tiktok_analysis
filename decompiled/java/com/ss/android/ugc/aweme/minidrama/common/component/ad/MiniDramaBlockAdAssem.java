package com.ss.android.ugc.aweme.minidrama.common.component.ad;

import X.AbstractC21150017pi;
import X.C1389890mGx;
import X.C13LP;
import X.C1573020r2K;
import X.C1612970s4l;
import X.C19LK;
import X.C21149917ph;
import X.C21150117pj;
import X.C21150217pk;
import X.C21171517tB;
import X.C21177317u7;
import X.C21177417u8;
import X.C2188811AlT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1613270s5F;
import X.InterfaceC21171617tC;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.AObserverS221S0100000_17;
import Y.AObserverS234S0100000_32;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesAdService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class MiniDramaBlockAdAssem extends UISlotAssem implements InterfaceC1613270s5F, InterfaceC737790Swr, InterfaceC1146704e9 {
    public TuxTextView LLJJI;
    public TuxIconView LLJJIII;
    public C21177417u8 LLJJIJI;
    public C21171517tB LLJJIJIIJIL;
    public final Set<String> LLJJIJIL = new LinkedHashSet();
    public final MutableLiveData<AbstractC21150017pi> LLJJJ = new MutableLiveData<>();
    public final MiniDramaBlockAdAssem LLJJJIL = this;
    public boolean LLJJJJ;
    public InterfaceC21171617tC LLJJJJJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bbv;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{DetailFeedFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DetailFeedFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1613270s5F
    public final void Wg() {
        C21171517tB c21171517tB;
        String str;
        Aweme aweme;
        C21149917ph c21149917ph;
        if (!(this.LLJJJ.getValue() instanceof C21149917ph) || this.LLJJJJ || (c21171517tB = this.LLJJIJIIJIL) == null || (str = c21171517tB.LIZIZ) == null) {
            return;
        }
        int i = 0;
        if (str.length() <= 0 || 1 == 0) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(getContentView());
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
        AbstractC21150017pi value = this.LLJJJ.getValue();
        if ((value instanceof C21149917ph) && (c21149917ph = (C21149917ph) value) != null) {
            i = c21149917ph.LIZ;
        }
        C21171517tB c21171517tB2 = this.LLJJIJIIJIL;
        if (c21171517tB2 == null || (aweme = c21171517tB2.LIZ) == null) {
            return;
        }
        ISeriesAdService.LIZ.getClass();
        ISeriesAdService iSeriesAdService = (ISeriesAdService) PluggableExtentionKt.pluggableSpi$default(ISeriesAdService.class, false, false, false, 14, null);
        if (iSeriesAdService != null) {
            iSeriesAdService.LJI(i, aweme);
        }
    }

    @Override // X.InterfaceC1613270s5F
    public final void c2() {
        this.LLJJIJIL.clear();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C21177417u8 c21177417u8 = this.LLJJIJI;
        if (c21177417u8 != null) {
            CountDownTimer countDownTimer = c21177417u8.LJFF;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            c21177417u8.LJFF = null;
            c21177417u8.LJ = c21177417u8.LIZ;
        }
        this.LLJJIJI = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C21177417u8 c21177417u8 = this.LLJJIJI;
        if (c21177417u8 != null) {
            CountDownTimer countDownTimer = c21177417u8.LJFF;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            c21177417u8.LJFF = null;
            c21177417u8.LJ = c21177417u8.LIZLLL - SystemClock.elapsedRealtime();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C21177417u8 c21177417u8 = this.LLJJIJI;
        if (c21177417u8 == null || c21177417u8.LJ <= 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = c21177417u8.LJ;
        c21177417u8.LIZLLL = jElapsedRealtime + j;
        CountDownTimer countDownTimer = c21177417u8.LJFF;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c21177417u8.LJFF = new C19LK(j, c21177417u8, 1000L, 0).start();
    }

    @Override // X.InterfaceC1613270s5F
    public final void Rk(C1612970s4l c1612970s4l) {
        this.LLJJJJJIL = c1612970s4l;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DetailFeedFragmentScope.class}).unbindAbility(this.LLJJJIL, InterfaceC1613270s5F.class);
    }

    @Override // X.InterfaceC1613270s5F
    public final void kb(Aweme aweme) {
        ISeriesAdService iSeriesAdService;
        C21171517tB c21171517tBLIZIZ;
        Aweme aweme2;
        String aid;
        ISeriesAdService iSeriesAdService2;
        boolean zLJJJJ;
        ISeriesAdService iSeriesAdService3;
        C21171517tB c21171517tBLIZIZ2;
        String aid2;
        View contentView = getContentView();
        ISeriesAdService.LIZ.getClass();
        C1573020r2K.LIZIZ(contentView, C21177317u7.LIZ(aweme));
        InterfaceC21171617tC interfaceC21171617tC = this.LLJJJJJIL;
        if (interfaceC21171617tC != null) {
            if (C21177317u7.LIZ(aweme) && (iSeriesAdService3 = (ISeriesAdService) PluggableExtentionKt.pluggableSpi$default(ISeriesAdService.class, false, false, false, 14, null)) != null && (c21171517tBLIZIZ2 = iSeriesAdService3.LIZIZ(aweme)) != null) {
                Set<String> set = this.LLJJIJIL;
                Aweme aweme3 = c21171517tBLIZIZ2.LIZ;
                if (aweme3 != null) {
                    aid2 = aweme3.getAid();
                } else {
                    aid2 = null;
                }
                zLJJJJ = C13LP.LJJJJ(aid2, set);
            } else {
                zLJJJJ = true;
            }
            interfaceC21171617tC.Em(!zLJJJJ);
        }
        if (C21177317u7.LIZ(aweme) && (iSeriesAdService = (ISeriesAdService) PluggableExtentionKt.pluggableSpi$default(ISeriesAdService.class, false, false, false, 14, null)) != null && (c21171517tBLIZIZ = iSeriesAdService.LIZIZ(aweme)) != null && (aweme2 = c21171517tBLIZIZ.LIZ) != null) {
            this.LLJJIJIIJIL = c21171517tBLIZIZ;
            boolean zLJJJJ2 = C13LP.LJJJJ(aweme2.getAid(), this.LLJJIJIL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[bindDramaBlockAdConfig] adId=");
            Aweme aweme4 = c21171517tBLIZIZ.LIZ;
            if (aweme4 != null) {
                aid = aweme4.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append(" isFinished=");
            sbLIZ.append(zLJJJJ2);
            C2188811AlT.LIZIZ(sbLIZ);
            if (zLJJJJ2) {
                this.LLJJJ.setValue(C21150117pj.LIZ);
                return;
            }
            this.LLJJJ.setValue(C21150217pk.LIZ);
            C21177417u8 c21177417u8 = this.LLJJIJI;
            if (c21177417u8 != null) {
                CountDownTimer countDownTimer = c21177417u8.LJFF;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                c21177417u8.LJFF = null;
                c21177417u8.LJ = c21177417u8.LIZ;
            }
            C21177417u8 c21177417u82 = new C21177417u8(((long) c21171517tBLIZIZ.LJ) * 1000, new AwS611S0100000_32(this, 78), new AwS433S0200000_32(this, c21171517tBLIZIZ, 16));
            this.LLJJIJI = c21177417u82;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = c21177417u82.LJ;
            c21177417u82.LIZLLL = jElapsedRealtime + j;
            CountDownTimer countDownTimer2 = c21177417u82.LJFF;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
            }
            c21177417u82.LJFF = new C19LK(j, c21177417u82, 1000L, 0).start();
            Aweme aweme5 = c21171517tBLIZIZ.LIZ;
            if (aweme5 == null || (iSeriesAdService2 = (ISeriesAdService) PluggableExtentionKt.pluggableSpi$default(ISeriesAdService.class, false, false, false, 14, null)) == null) {
                return;
            }
            iSeriesAdService2.LJII(aweme5);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.17tD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        }, view);
        this.LLJJI = (TuxTextView) view.findViewById(R.id.ur_);
        this.LLJJIII = (TuxIconView) view.findViewById(R.id.uqt);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            this.LLJJJ.observe(fragmentLJI, new AObserverS221S0100000_17(new AObserverS234S0100000_32(this, 21), 56));
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{DetailFeedFragmentScope.class}).bindAbility(this.LLJJJIL, InterfaceC1613270s5F.class);
    }

    @Override // X.InterfaceC1613270s5F
    public final void setUserVisibleHint(boolean z) {
        if (z) {
            this.LLJJJJ = false;
        } else {
            this.LLJJJJ = true;
        }
    }
}
