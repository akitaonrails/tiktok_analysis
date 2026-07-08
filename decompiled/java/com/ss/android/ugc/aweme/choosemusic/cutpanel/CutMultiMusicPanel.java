package com.ss.android.ugc.aweme.choosemusic.cutpanel;

import X.C01GW;
import X.C0FU0;
import X.C12ES;
import X.C1361400lX0;
import X.C1390920mIc;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C15JF;
import X.C15JK;
import X.C15JN;
import X.C15KF;
import X.C1697810uHb;
import X.C16HF;
import X.C16HJ;
import X.C19EG;
import X.C20502815Ko;
import X.C20503015Kq;
import X.C20503415Ku;
import X.C2188811AlT;
import X.C2409809cO;
import X.C389650FPn;
import X.C418440Gaw;
import X.C452501pT;
import X.C717610SCx;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC19381710sB;
import X.InterfaceC1631620sYq;
import X.InterfaceC20503215Ks;
import X.InterfaceC20503815Ky;
import Y.ACListenerS165S0100000_31;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMultiMusicPanel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CutMultiMusicPanel extends Fragment implements C15JN {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5HELIOSOiYwZiY5PT8yJiAgZwwmPAg5JTs6BTA/ICwDKSspJQ==";
    public HorizontalScrollView LL;
    public LinearLayout LLILLJJLI;
    public C1361400lX0 LLILLL;
    public TuxSheet LLILZ;
    public C1390920mIc LLILZIL;
    public View LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public View LLJILLL;
    public int LLJJ;
    public InterfaceC20503815Ky LLJJI;
    public InterfaceC1631620sYq<? super Integer, ? super Integer, ? super List<C15JF>, Unit> LLJJIII;
    public boolean LLJJIJI;
    public long LLJJIJIIJIL;
    public final List<C20503015Kq> LLILZLL = new ArrayList();
    public List<MusicWaveBean> LLIZ = C13BV.INSTANCE;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 331));

    @Override // X.C15JN
    public final void Au(boolean z, boolean z2) {
    }

    @Override // X.C15JN
    public final void C6(C20502815Ko c20502815Ko) {
    }

    @Override // X.C15JN
    public final void Df() {
    }

    @Override // X.C15JN
    public final boolean Et() {
        return false;
    }

    @Override // X.C15JN
    public final void GI() {
    }

    @Override // X.C15JN
    public final void JI() {
    }

    @Override // X.C15JN
    public final void LLLIIII(List<Integer> list) {
    }

    @Override // X.C15JN
    public final void Na(String str) {
    }

    @Override // X.C15JN
    public final void OJ(C15JK c15jk) {
    }

    @Override // X.C15JN
    public final void Of() {
    }

    @Override // X.C15JN
    public final void Qw(Function1<? super Boolean, Unit> function1) {
    }

    @Override // X.C15JN
    public final void TM(Function1<? super Boolean, Unit> function1) {
    }

    @Override // X.C15JN
    public final void ec(float f) {
    }

    @Override // X.C15JN
    public final void fC(float f, int i) {
    }

    @Override // X.C15JN
    public final void h5(boolean z) {
    }

    @Override // X.C15JN
    public final void mL(String str) {
    }

    @Override // X.C15JN
    public final void o4(int i) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
    }

    @Override // X.C15JN
    public final boolean rw(MusicWaveBean musicWaveBean, int i, int i2, int i3, int i4) {
        return true;
    }

    @Override // X.C15JN
    public final void xi() {
    }

    @Override // X.C15JN
    public final void z3(Function1<? super Boolean, Unit> function1) {
    }

    @Override // X.C15JN
    public final int Aw() {
        C20503015Kq c20503015Kq = (C20503015Kq) C13LP.LJJJLL(this.LLILZLL);
        if (c20503015Kq != null) {
            return c20503015Kq.getMaxCntOnScreen();
        }
        return 60;
    }

    public final List<C15JF> NR() {
        List<C20503015Kq> list = this.LLILZLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C20503015Kq> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getAudioData());
        }
        return arrayList;
    }

    public final HorizontalScrollView OR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u3e) : null;
            this.LL = (HorizontalScrollView) viewFindViewById;
        }
        return (HorizontalScrollView) viewFindViewById;
    }

    public final boolean PR() {
        return ((Boolean) this.LLJJIJIL.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void SR() {
        Iterator it2 = C13LP.LLIIL(this.LLILZLL).iterator();
        int iLIZIZ = 0;
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (!c717610SCx.hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
            iLIZIZ += indexedValue.LIZ < this.LLJJ ? C814420VxA.LIZIZ(((C20503015Kq) indexedValue.LIZIZ).getSelectFrameEndTime()) : 0;
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(iLIZIZ / 1000.0f);
        int i = iLIZIZ2 % 60;
        int i2 = iLIZIZ2 / 60;
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        String strK4 = i3 == 0 ? C786410Ut5.k4(Locale.CHINA, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i)}, 2)) : C786410Ut5.k4(Locale.CHINA, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i)}, 3));
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setText(strK4);
        }
    }

    @Override // X.C15JN
    public final List<Integer> Wj() {
        List<C20503015Kq> list = this.LLILZLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C20503015Kq> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().getMaxCntOnScreen()));
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // androidx.fragment.app.Fragment, X.C15JN
    public final View getView() {
        return this.LLIZLLLIL;
    }

    @Override // X.C15JN
    public final void A8(C16HJ c16hj) {
        C1390920mIc c1390920mIc = this.LLILZIL;
        if (c1390920mIc != null) {
            c1390920mIc.LIZ.LLILLJJLI = c16hj;
        }
    }

    @Override // X.C15JN
    public final void BJ(float f) {
        int i = 0;
        for (Object obj : (ArrayList) this.LLILZLL) {
            int i2 = i + 1;
            if (i >= 0) {
                C20503015Kq c20503015Kq = (C20503015Kq) obj;
                if (i == this.LLJJ) {
                    if (f >= c20503015Kq.getAudioData().LJFF) {
                        InterfaceC1631620sYq<? super Integer, ? super Integer, ? super List<C15JF>, Unit> interfaceC1631620sYq = this.LLJJIII;
                        if (interfaceC1631620sYq != null) {
                            interfaceC1631620sYq.invoke(Integer.valueOf(i), Integer.valueOf((int) c20503015Kq.getAudioData().LJ), null);
                            return;
                        }
                        return;
                    }
                    C20503415Ku c20503415Ku = c20503015Kq.LLILZ;
                    c20503415Ku.LLILLL = (f - c20503015Kq.getAudioData().LJ) / (c20503015Kq.getAudioData().LIZLLL - c20503015Kq.getAudioData().LIZJ);
                    c20503415Ku.invalidate();
                } else {
                    C20503415Ku c20503415Ku2 = c20503015Kq.LLILZ;
                    c20503415Ku2.LLILLL = 0.0f;
                    c20503415Ku2.invalidate();
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.C15JN
    public final void JH(List<C15JF> list) {
        if (PR()) {
            list = C13LP.LJLJJLL(list);
        }
        for (Pair pair : (ArrayList) C13LP.LLIILII(list, this.LLILZLL)) {
            ((C20503015Kq) pair.getSecond()).LIZ(C418440Gaw.LIZIZ(6) / LSPassThroughRecordSizeConfig.DEFAULT, (C15JF) pair.getFirst());
        }
    }

    @Override // X.C15JN
    public final void My(InterfaceC20503815Ky interfaceC20503815Ky) {
        this.LLJJI = interfaceC20503815Ky;
    }

    public final void RR(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC1631620sYq<? super Integer, ? super Integer, ? super List<C15JF>, Unit> interfaceC1631620sYq;
        int i2 = 0;
        for (C20503015Kq c20503015Kq : this.LLILZLL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C20503015Kq c20503015Kq2 = c20503015Kq;
                boolean z4 = true;
                if (i2 == i) {
                    if (i2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i2 == ((ArrayList) this.LLILZLL).size() - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c20503015Kq2.LIZIZ(true, z2, z3);
                    C15JF audioData = c20503015Kq2.getAudioData();
                    UR((audioData.LIZLLL - audioData.LIZJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    if (this.LLJJ != i && (interfaceC1631620sYq = this.LLJJIII) != null) {
                        interfaceC1631620sYq.invoke(Integer.valueOf(i), Integer.valueOf((int) audioData.LJ), NR());
                    }
                } else {
                    if (i2 != 0 && i2 == i + 1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (i2 != ((ArrayList) this.LLILZLL).size() - 1 && i2 == i - 1) {
                        z4 = false;
                    }
                    c20503015Kq2.LIZIZ(false, z, z4);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LLJJ = i;
        SR();
    }

    public final void UR(long j) {
        String string;
        Resources resources;
        TuxTextView tuxTextView = this.LLJIJIL;
        if (tuxTextView != null) {
            C1361400lX0 c1361400lX0 = this.LLILLL;
            if (c1361400lX0 != null && (resources = c1361400lX0.getResources()) != null) {
                string = resources.getString(2131848646, Long.valueOf(j));
            } else {
                string = null;
            }
            tuxTextView.setText(string);
        }
    }

    public final void VR(int i) {
        long j;
        C15JF audioData;
        C20503015Kq c20503015Kq = (C20503015Kq) C13LP.LJJJLZIJ(i, this.LLILZLL);
        if (c20503015Kq == null) {
            return;
        }
        C20503015Kq c20503015Kq2 = (C20503015Kq) C13LP.LJJJLZIJ(i - 1, this.LLILZLL);
        if (c20503015Kq2 != null && (audioData = c20503015Kq2.getAudioData()) != null) {
            j = audioData.LIZLLL;
        } else {
            j = 0;
        }
        long jLIZJ = C814420VxA.LIZJ(c20503015Kq.getSelectFrameEndTime());
        C15JF c15jf = c20503015Kq.LLJ;
        c20503015Kq.LLJ = C15JF.LIZ(c15jf, c15jf.LIZJ + jLIZJ, j, j + jLIZJ, 71);
    }

    @Override // X.C15JN
    public final void Wr(List<MusicWaveBean> list) {
        Object objLJ;
        this.LLIZ = list;
        int i = 0;
        for (Object obj : (ArrayList) this.LLILZLL) {
            int i2 = i + 1;
            if (i >= 0) {
                C20503015Kq c20503015Kq = (C20503015Kq) obj;
                List<MusicWaveBean> list2 = this.LLIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (MusicWaveBean musicWaveBeanLJ : list2) {
                    if (!C15KF.LJI(musicWaveBeanLJ.getMusicWavePointArray())) {
                        musicWaveBeanLJ = C15KF.LJ(Aw());
                    }
                    arrayList.add(musicWaveBeanLJ);
                }
                if (i < arrayList.size()) {
                    objLJ = ListProtector.get(arrayList, i);
                } else {
                    objLJ = C15KF.LJ(Aw());
                }
                c20503015Kq.LLILZ.setAudioWaveViewData((MusicWaveBean) objLJ);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.C15JN
    public final void jz(InterfaceC1631620sYq<? super Integer, ? super Integer, ? super List<C15JF>, Unit> interfaceC1631620sYq) {
        this.LLJJIII = interfaceC1631620sYq;
    }

    public static boolean MR(C20503015Kq c20503015Kq, float f) {
        float f2 = (c20503015Kq.getMusicSelectFrameViewFromXml().getSelectFrameRect().right - c20503015Kq.getMusicSelectFrameViewFromXml().getSelectFrameRect().left) + f;
        if (Math.max(f2 - c20503015Kq.getMaxWidth(), Math.max(c20503015Kq.getMinWidth() - f2, 0.0f)) <= 0.0f) {
            return true;
        }
        return false;
    }

    @Override // X.C15JN
    public final void LB(int i, List list) {
        int iLIZJ;
        int iLIZJ2;
        Object objLJ;
        if (PR()) {
            list = C13LP.LJLJJLL(list);
        }
        Iterator it2 = list.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((C15JF) it2.next()).LJI;
        }
        int i2 = (int) j;
        ((ArrayList) this.LLILZLL).clear();
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.mq3);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (LinearLayout) viewFindViewById;
        }
        C786410Ut5.LJJJJJL((LinearLayout) viewFindViewById);
        C1361400lX0 c1361400lX0 = this.LLILLL;
        if (c1361400lX0 == null) {
            return;
        }
        final int i3 = 0;
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                C15JF c15jf = (C15JF) obj;
                C20503015Kq c20503015Kq = new C20503015Kq(c1361400lX0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i4 > 0) {
                    layoutParams.setMarginStart(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                }
                if (i4 == 0) {
                    iLIZJ = (int) C12ES.LIZJ(30.0f, c1361400lX0);
                } else {
                    iLIZJ = 0;
                }
                if (i4 == list.size() - 1) {
                    iLIZJ2 = (int) C12ES.LIZJ(30.0f, c1361400lX0);
                } else {
                    iLIZJ2 = 0;
                }
                c20503015Kq.setPadding(iLIZJ, 0, iLIZJ2, 0);
                List<MusicWaveBean> list2 = this.LLIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (MusicWaveBean musicWaveBeanLJ : list2) {
                    if (!C15KF.LJI(musicWaveBeanLJ.getMusicWavePointArray())) {
                        musicWaveBeanLJ = C15KF.LJ(Aw());
                    }
                    arrayList.add(musicWaveBeanLJ);
                }
                if (i4 < arrayList.size()) {
                    objLJ = ListProtector.get(arrayList, i4);
                } else {
                    objLJ = C15KF.LJ(Aw());
                }
                c20503015Kq.LLILZ.setAudioWaveViewData((MusicWaveBean) objLJ);
                ((ArrayList) this.LLILZLL).add(c20503015Kq);
                View viewFindViewById2 = this.LLILLJJLI;
                if (viewFindViewById2 == null) {
                    View view2 = getView();
                    if (view2 != null) {
                        viewFindViewById2 = view2.findViewById(R.id.mq3);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLILLJJLI = (LinearLayout) viewFindViewById2;
                }
                ((ViewGroup) viewFindViewById2).addView(c20503015Kq, layoutParams);
                c20503015Kq.LIZ(C418440Gaw.LIZIZ(6) / LSPassThroughRecordSizeConfig.DEFAULT, c15jf);
                i4 = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        RR(0);
        for (Object obj2 : (ArrayList) this.LLILZLL) {
            int i6 = i3 + 1;
            if (i3 >= 0) {
                final C20503015Kq c20503015Kq2 = (C20503015Kq) obj2;
                c20503015Kq2.setAudioSelectFrameClipListener(new InterfaceC20503215Ks() { // from class: X.15Kp
                    @Override // X.InterfaceC20503215Ks
                    public final void LIZ() {
                        this.LIZ.RR(i3);
                    }

                    @Override // X.InterfaceC20503215Ks
                    public final void LIZIZ(EnumC1084680eKg enumC1084680eKg) {
                        CutMultiMusicPanel cutMultiMusicPanel;
                        InterfaceC1631620sYq<? super Integer, ? super Integer, ? super List<C15JF>, Unit> interfaceC1631620sYq;
                        if (enumC1084680eKg == EnumC1084680eKg.RIGHT) {
                            this.LIZ.VR(i3);
                            this.LIZ.VR(i3 + 1);
                        } else {
                            this.LIZ.VR(i3 - 1);
                            this.LIZ.VR(i3);
                        }
                        List<C15JF> listNR = this.LIZ.NR();
                        C15JF c15jf2 = (C15JF) C13LP.LJJJLZIJ(this.LIZ.LLJJ, listNR);
                        if (c15jf2 != null && (interfaceC1631620sYq = (cutMultiMusicPanel = this.LIZ).LLJJIII) != null) {
                            interfaceC1631620sYq.invoke(Integer.valueOf(cutMultiMusicPanel.LLJJ), Integer.valueOf((int) c15jf2.LJ), listNR);
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9  */
                    @Override // X.InterfaceC20503215Ks
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZJ(float r7, X.EnumC1084680eKg r8) {
                        /*
                            Method dump skipped, instruction units count: 267
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C20502915Kp.LIZJ(float, X.0eKg):void");
                    }
                });
                i3 = i6;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        int iMin = Math.min(i2, i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" / ");
        sbLIZ.append(C389650FPn.LIZ(iMin));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        TuxTextView tuxTextView = this.LLJI;
        if (tuxTextView != null) {
            tuxTextView.setText(strLIZIZ);
        }
    }

    @Override // X.C15JN
    public final void pm(FragmentManager fragmentManager, List<Integer> list) {
        TuxSheet tuxSheet;
        if (this.LLJJIJI) {
            return;
        }
        if (this.LLILZ == null) {
            C1390920mIc c1390920mIc = this.LLILZIL;
            if (c1390920mIc != null) {
                tuxSheet = c1390920mIc.LIZ;
            } else {
                tuxSheet = null;
            }
            this.LLILZ = tuxSheet;
        }
        if (PR()) {
            RR(C1697810uHb.LJIIJ(this.LLILZLL));
            HandlerHook.viewPost(OR(), new ARunnableS128S0100000_28(this, 21));
        } else {
            RR(0);
            HandlerHook.viewPost(OR(), new ARunnableS128S0100000_28(this, 22));
        }
        this.LLJJIJI = true;
        TuxSheet tuxSheet2 = this.LLILZ;
        if (tuxSheet2 != null) {
            tuxSheet2.show(fragmentManager, "cutMusicPanel");
        }
    }

    @Override // X.C15JN
    public final void bA(C19EG c19eg, LayoutInflater layoutInflater, ViewGroup viewGroup, EnumC19381710sB enumC19381710sB) {
        int i;
        if (enumC19381710sB == EnumC19381710sB.WHITE) {
            i = R.style.xm;
        } else {
            i = R.style.y0;
        }
        C1361400lX0 c1361400lX0 = new C1361400lX0(c19eg, i);
        this.LLILLL = c1361400lX0;
        Context applicationContext = c1361400lX0.getApplicationContext();
        if (C2409809cO.LIZIZ && applicationContext == null) {
            applicationContext = C2409809cO.LIZ;
        }
        C0FU0.LIZJ(applicationContext);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c1361400lX0), R.layout.d2y, viewGroup, false);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = viewTd;
        tuxSheet.LLJJIJIIJIL = true;
        c1390920mIc.LJIIIIZZ(4);
        c1390920mIc.LIZ.LLJLLL = false;
        c1390920mIc.LIZLLL(i, false);
        this.LLILZIL = c1390920mIc;
        this.LLJ = (TuxTextView) viewTd.findViewById(R.id.zgz);
        this.LLJI = (TuxTextView) viewTd.findViewById(R.id.zh2);
        viewTd.findViewById(R.id.ump);
        this.LLJIJIL = (TuxTextView) viewTd.findViewById(R.id.tv_selected_tips);
        this.LLJILJIL = (TuxTextView) viewTd.findViewById(R.id.zgw);
        this.LLJILJILJ = (TuxTextView) viewTd.findViewById(R.id.zgy);
        viewTd.findViewById(R.id.yfy);
        this.LLJILLL = viewTd.findViewById(R.id.fe7);
        this.LLIZLLLIL = viewTd;
        C1390920mIc c1390920mIc2 = this.LLILZIL;
        if (c1390920mIc2 != null) {
            c1390920mIc2.LIZ.LL = new C16HF(this, 2);
        }
        TuxTextView tuxTextView = this.LLJILJILJ;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS165S0100000_31(this, 164));
        }
        TuxTextView tuxTextView2 = this.LLJILJIL;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS165S0100000_31(this, 165));
        }
    }
}
