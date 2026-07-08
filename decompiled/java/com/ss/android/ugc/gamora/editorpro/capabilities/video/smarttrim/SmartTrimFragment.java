package com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim;

import X.C01GW;
import X.C051R;
import X.C0E1V;
import X.C0E1X;
import X.C0E43;
import X.C0E47;
import X.C0E48;
import X.C0E55;
import X.C0E5P;
import X.C0E5S;
import X.C0E69;
import X.C0EBE;
import X.C0FDG;
import X.C0FU0;
import X.C0FX2;
import X.C13LP;
import X.C1664600tQ2;
import X.C19A3;
import X.C1DRG;
import X.C23250099c;
import X.C350110Do1;
import X.C350870DpF;
import X.C351220Dpo;
import X.C352310DrZ;
import X.C354270Duj;
import X.C356530DyN;
import X.C358350E3d;
import X.C358850E5b;
import X.C358890E5f;
import X.C360610EBv;
import X.C361680EFy;
import X.C364210EPr;
import X.C368130Ebz;
import X.C368140Ec0;
import X.C368870EdB;
import X.C368880EdC;
import X.C368930EdH;
import X.C370920EgU;
import X.C452501pT;
import X.C786410Ut5;
import X.DialogC1390150mHN;
import X.EnumC356100Dxg;
import X.EnumC357140DzM;
import X.InterfaceC1389630mGX;
import X.InterfaceC351350Dq1;
import X.InterfaceC355360DwU;
import X.InterfaceC355380DwW;
import X.InterfaceC360800ECo;
import X.InterfaceC364230EPt;
import X.InterfaceC369000EdO;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim.SmartTrimFragment;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim.SmartTrimViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment;
import com.ss.ugc.android.editor.components.base.FrameInterpolator;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.ss.ugc.android.editor.core.vm.BaseViewModel;
import com.ss.ugc.android.editor.track.SeekInfo;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS37S0200100_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class SmartTrimFragment extends TTResourcePanelFragment<SmartTrimViewModel> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyQ8KC06HELIOSJCw4ICogZjMlLSo8ZjYhKD0nPDclJGEAJSQ+PRshISgKOy40JSAiPQ==";
    public FrameCacheViewModel LLLFFI;
    public C368870EdB LLLFZ;
    public DialogC1390150mHN LLLIIII;
    public volatile long LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public NLENode LLLIILIL;
    public long LLLILZLLLI;
    public C0E5S LLLL;
    public InterfaceC360800ECo LLLLII;
    public String LLLI = "";
    public boolean LLLII = true;
    public int LLLIL = -1;
    public final int LLLILZ = C0FU0.LIZ(15.0f);
    public float LLLILZJ = C368130Ebz.LIZJ;
    public final ArrayList<Pair<Long, Long>> LLLIZZ = new ArrayList<>();
    public final Keva LLLJ = Keva.getRepo("ep_smart_trim_toast_repo");
    public final FrameInterpolator LLLJIL = new FrameInterpolator(new C0FDG() { // from class: X.0E5c
        @Override // X.C0FDG
        public final void handleMsg(Message message) {
            C368870EdB c368870EdB = this.LIZ.LLLFZ;
            if (c368870EdB != null) {
                c368870EdB.LIZJ(message.arg1);
            }
        }
    });
    public final C01GW LLLJL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(205));
    public final C358890E5f LLLLIIIILLL = new INLEListenerVideoOutput() { // from class: X.0E5f
        @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
        public final void onRefresh(int i, long j) {
            if (i != 0) {
                return;
            }
            C354270Duj.LIZJ(0L, new C358870E5d(this.LL, j));
        }
    };
    public final C358850E5b LLLLIIL = new Observer() { // from class: X.0E5b
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            long jJh;
            boolean z;
            Pair<Long, Long> pair;
            Pair<Long, Long> pairPrevious;
            boolean z2;
            Pair<Long, Long> next;
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    if (iIntValue == 3) {
                        this.LL.LLLJIL.LIZ();
                        C0E48 c0e48 = this.LL.LL;
                        if (c0e48 != null) {
                            int iJh = (int) c0e48.getPlayer().Jh();
                            C368870EdB c368870EdB = this.LL.LLLFZ;
                            if (c368870EdB != null) {
                                c368870EdB.LIZJ(iJh);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0E48 c0e482 = this.LL.LL;
                if (c0e482 != null) {
                    jJh = c0e482.getPlayer().Jh();
                } else {
                    jJh = 0;
                }
                long jLIZLLL = C352310DrZ.LIZLLL(jJh);
                ArrayList<Pair<Long, Long>> arrayList = this.LL.LLLIZZ;
                if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                    z = false;
                } else {
                    for (Pair<Long, Long> pair2 : arrayList) {
                        long jLongValue = pair2.getFirst().longValue();
                        long jLongValue2 = pair2.getSecond().longValue();
                        long jLIZ = C352310DrZ.LIZ(jLIZLLL);
                        if (jLongValue <= jLIZ && jLIZ <= jLongValue2 && pair2.getSecond().longValue() - pair2.getFirst().longValue() >= 100) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                }
                ArrayList<Pair<Long, Long>> arrayList2 = this.LL.LLLIZZ;
                ListIterator<Pair<Long, Long>> listIterator = arrayList2.listIterator(arrayList2.size());
                while (true) {
                    pair = null;
                    if (listIterator.hasPrevious()) {
                        pairPrevious = listIterator.previous();
                        Pair<Long, Long> pair3 = pairPrevious;
                        if (pair3.getSecond().longValue() - pair3.getFirst().longValue() >= 100) {
                            break;
                        }
                    } else {
                        pairPrevious = null;
                        break;
                    }
                }
                Pair<Long, Long> pair4 = pairPrevious;
                if (pair4 != null && jLIZLLL == C352310DrZ.LIZLLL(pair4.getSecond().longValue())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z || z2) {
                    Iterator<Pair<Long, Long>> it2 = this.LL.LLLIZZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            Pair<Long, Long> pair5 = next;
                            if (C352310DrZ.LIZ(jLIZLLL) <= pair5.getFirst().longValue() && pair5.getSecond().longValue() - pair5.getFirst().longValue() >= 100) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Pair<Long, Long> pair6 = next;
                    if (pair6 != null) {
                        SmartTrimFragment smartTrimFragment = this.LL;
                        SmartTrimFragment.lT(smartTrimFragment, C352310DrZ.LIZLLL(pair6.getFirst().longValue()), new C0FX3(smartTrimFragment, 14), 6);
                    } else {
                        SmartTrimFragment smartTrimFragment2 = this.LL;
                        Iterator<Pair<Long, Long>> it3 = smartTrimFragment2.LLLIZZ.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Pair<Long, Long> next2 = it3.next();
                            Pair<Long, Long> pair7 = next2;
                            if (pair7.getSecond().longValue() - pair7.getFirst().longValue() >= 100) {
                                pair = next2;
                                break;
                            }
                        }
                        Pair<Long, Long> pair8 = pair;
                        if (pair8 != null) {
                            SmartTrimFragment.lT(smartTrimFragment2, C352310DrZ.LIZLLL(pair8.getFirst().longValue()), new C0FX3(smartTrimFragment2, 15), 6);
                        }
                    }
                }
                this.LL.LLLJIL.getClass();
                SystemClock.elapsedRealtime();
                return;
            }
            this.LL.LLLJIL.LIZ();
            this.LL.LLLJIL.getClass();
            SystemClock.elapsedRealtime();
        }
    };

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void HS() {
        if (this.LLLIIL) {
            return;
        }
        this.LLLIIL = true;
        this.LLLIIIL = true;
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            c0e48.getPlayer().LJJIII(this.LLLLIIIILLL);
            LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).removeObserver(this.LLLLIIL);
            c0e48.getPlayer().pause(false);
            C0E48 c0e482 = this.LL;
            C0E69.LIZ(this.LL, true, false, 16L, new AwS37S0200100_5(this, c0e48, c0e482 != null ? c0e482.getPlayer().Jh() : 0L, 2), 4);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void PS(EnumC357140DzM enumC357140DzM) {
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int RR() {
        return R.layout.c28;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String qS() {
        return "smart_trim_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final ViewModel QS() {
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        return C364210EPr.LIZIZ(SmartTrimViewModel.class);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String hS() {
        return C051R.LIZIZ(new C0E1X(C0E1V.SMART_TRIM.getNameId(), null, null, null, null, 30));
    }

    public final void jT() {
        VecNLETrackSPtr tracks;
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            boolean zResetHead = c0e48.LLFII().LJI().resetHead();
            NLEModel model = c0e48.LLFII().LJI().getModel();
            boolean z = (model == null || (tracks = model.getTracks()) == null || tracks.size() != 0) ? false : true;
            if (!zResetHead || z) {
                if (c0e48.LLFII().LJI().restore(this.LLLI).swigValue() != NLEError.SUCCESS.swigValue()) {
                    C356530DyN.LIZIZ(C0E5P.LIZIZ, "smartTrim", "restore failed ");
                } else {
                    C356530DyN.LIZIZ(C0E5P.LIZIZ, "smartTrim", "restore success ");
                }
            }
            ((LinkedHashMap) C350110Do1.LIZJ.LIZ).clear();
        }
    }

    public final void kT() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLILZLLLI;
        EnumC356100Dxg enumC356100Dxg = EnumC356100Dxg.USER_CANCEL;
        C361680EFy.LJJLL(enumC356100Dxg.getMsg(), jCurrentTimeMillis, 1, Integer.valueOf(enumC356100Dxg.getCode()));
        jT();
        NR();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C368880EdC c368880EdC;
        C370920EgU c370920EgU;
        C0E48 c0e48;
        super.onDestroy();
        if (C0E47.LIZ()) {
            if (!this.LLLIIIL && (c0e48 = this.LL) != null) {
                c0e48.getPlayer().LJJIII(this.LLLLIIIILLL);
                C0E48 c0e482 = this.LL;
                if (c0e482 != null) {
                    c0e482.S7().LIZIZ(Boolean.TRUE, "IS_ACTIVE_TRACKPANEL", false);
                }
                jT();
                C350870DpF.LIZ(c0e48, false);
            }
            this.LLLIIIL = false;
            this.LLLIIL = false;
            this.LLLJIL.LIZ();
            C368870EdB c368870EdB = this.LLLFZ;
            if (c368870EdB != null) {
                C368930EdH c368930EdH = c368870EdB.LLILLL;
                if (c368930EdH != null && (c368880EdC = c368930EdH.LLJI) != null && (c370920EgU = c368880EdC.LLIZLLLIL) != null) {
                    C23250099c.LIZLLL(c370920EgU, c370920EgU.LLJILJIL, null, new C358350E3d(c370920EgU, c368880EdC.LL, null), 2);
                }
                C368930EdH c368930EdH2 = c368870EdB.LLILLL;
                if (c368930EdH2 != null) {
                    c368930EdH2.setScrollChangeListener(null);
                }
                c368870EdB.LLILZIL = null;
            }
            C0E48 c0e483 = this.LL;
            if (c0e483 == null || (interfaceC351350Dq1LLFII = c0e483.LLFII()) == null) {
                return;
            }
            interfaceC351350Dq1LLFII.LJLIL();
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C0E55 player;
        C0E48 c0e48;
        C0E55 player2;
        super.onResume();
        C0E48 c0e482 = this.LL;
        if (c0e482 == null || (player = c0e482.getPlayer()) == null || !player.isPlaying() || (c0e48 = this.LL) == null || (player2 = c0e48.getPlayer()) == null) {
            return;
        }
        player2.pause(false);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void JS(boolean z) {
        long jJh;
        NLETrack mainTrack;
        if (this.LLLIIL) {
            return;
        }
        this.LLLIIL = true;
        C0E48 c0e48 = this.LL;
        if (c0e48 != null) {
            c0e48.getPlayer().LJJIII(this.LLLLIIIILLL);
            LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).removeObserver(this.LLLLIIL);
            c0e48.getPlayer().pause(false);
            C0E48 c0e482 = this.LL;
            long maxEnd = 0;
            if (c0e482 != null) {
                jJh = c0e482.getPlayer().Jh();
            } else {
                jJh = 0;
            }
            C0E48 c0e483 = this.LL;
            if (c0e483 != null && (mainTrack = C350870DpF.LJI(c0e483).getMainTrack()) != null) {
                maxEnd = mainTrack.getMaxEnd();
            }
            C0E69.LIZ(this.LL, true, false, 16L, new C0E43(this, c0e48, maxEnd, jJh), 4);
        }
    }

    public final void nT(long j) {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        NLETrackSlot nLETrackSlot2;
        NLETrack nLETrackRn;
        NLETrack nLETrackRn2;
        VecNLETrackSlotSPtr sortedSlots2;
        NLETrack mainTrack2;
        VecNLETrackSlotSPtr sortedSlots3;
        NLETrackSlot nLETrackSlot3;
        NLETrack mainTrack3;
        VecNLETrackSlotSPtr sortedSlots4;
        NLETrackSlot nLETrackSlot4;
        ArrayList<Pair<Long, Long>> arrayList = this.LLLIZZ;
        ArrayList arrayList2 = new ArrayList();
        for (Pair<Long, Long> pair : arrayList) {
            Pair<Long, Long> pair2 = pair;
            if (pair2.getSecond().longValue() - pair2.getFirst().longValue() >= 100) {
                arrayList2.add(pair);
            }
        }
        Iterator it2 = arrayList2.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Pair pair3 = (Pair) it2.next();
            long jLongValue = ((Number) pair3.getFirst()).longValue();
            if (j <= ((Number) pair3.getSecond()).longValue() && jLongValue <= j) {
                if (i != -1) {
                    Pair pair4 = (Pair) C13LP.LJJJLZIJ(i, arrayList2);
                    if (pair4 != null) {
                        long jLongValue2 = j - ((Number) pair4.getFirst()).longValue();
                        if (!this.LLLII) {
                            i += this.LLLIL;
                        }
                        C0E48 c0e48 = this.LL;
                        if (c0e48 != null && (mainTrack3 = C350870DpF.LJI(c0e48).getMainTrack()) != null && (sortedSlots4 = mainTrack3.getSortedSlots()) != null && (nLETrackSlot4 = (NLETrackSlot) C13LP.LJJJLZIJ(i, sortedSlots4)) != null) {
                            mT(nLETrackSlot4.getStartTime() + C352310DrZ.LIZLLL(jLongValue2), nLETrackSlot4);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                i++;
            }
        }
        Iterator it3 = arrayList2.iterator();
        int i2 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (j < ((Number) ((Pair) it3.next()).getFirst()).longValue()) {
                if (i2 != -1) {
                    if (!this.LLLII) {
                        i2 += this.LLLIL;
                    }
                    C0E48 c0e482 = this.LL;
                    if (c0e482 == null || (mainTrack2 = C350870DpF.LJI(c0e482).getMainTrack()) == null || (sortedSlots3 = mainTrack2.getSortedSlots()) == null || (nLETrackSlot3 = (NLETrackSlot) C13LP.LJJJLZIJ(i2, sortedSlots3)) == null) {
                        return;
                    }
                    mT(nLETrackSlot3.getStartTime(), nLETrackSlot3);
                    return;
                }
            } else {
                i2++;
            }
        }
        if (this.LLLII) {
            C0E48 c0e483 = this.LL;
            if (c0e483 != null && (nLETrackRn2 = c0e483.Rn()) != null && (sortedSlots2 = nLETrackRn2.getSortedSlots()) != null) {
                nLETrackSlot2 = (NLETrackSlot) C13LP.LJJLIIIJL(sortedSlots2);
            } else {
                nLETrackSlot2 = null;
            }
            C0E48 c0e484 = this.LL;
            if (c0e484 != null && (nLETrackRn = c0e484.Rn()) != null) {
                mT(nLETrackRn.getMaxEnd(), nLETrackSlot2);
                return;
            }
            return;
        }
        int size = (this.LLLIL + arrayList2.size()) - 1;
        C0E48 c0e485 = this.LL;
        if (c0e485 == null || (mainTrack = C350870DpF.LJI(c0e485).getMainTrack()) == null || (sortedSlots = mainTrack.getSortedSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(size, sortedSlots)) == null) {
            return;
        }
        mT(nLETrackSlot.getEndTime(), nLETrackSlot);
    }

    public final void mT(long j, NLETrackSlot nLETrackSlot) {
        lT(this, j, new C0FX2(this, nLETrackSlot, 7), 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strStore;
        NLENode nLENodeDeepClone;
        C19A3 c19a3;
        C1DRG c1drg;
        C0E55 player;
        NLETrack nLETrackRn;
        VecNLETrackSlotSPtr sortedSlots;
        C368870EdB c368870EdB;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        int iIntValue;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        C0E48 c0e48;
        NLETrack nLETrackRn2;
        Integer numValueOf;
        C0E55 player2;
        C0E55 player3;
        C19A3 c19a32;
        C1DRG c1drg2;
        super.onViewCreated(view, bundle);
        if (C0E47.LIZ()) {
            Scene sceneLIZ = C0EBE.LIZ(getView());
            if ((sceneLIZ instanceof C19A3) && (c19a32 = (C19A3) sceneLIZ) != null && (c1drg2 = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a32)).LLJJI) != null) {
                this.LLLLII = (InterfaceC360800ECo) c1drg2.LJIIL(null, InterfaceC360800ECo.class);
            }
            hT();
            zS();
            String string = getString(2131848555);
            TuxTextView tuxTextViewDS = dS();
            if (tuxTextViewDS != null) {
                tuxTextViewDS.setText(string);
            }
            C0E48 c0e482 = this.LL;
            if (c0e482 != null && (player3 = c0e482.getPlayer()) != null) {
                player3.Jh();
            }
            C0E48 c0e483 = this.LL;
            if (c0e483 == null || (strStore = c0e483.LLFII().LJI().store()) == null) {
                strStore = "";
            }
            this.LLLI = strStore;
            C0E5S c0e5s = this.LLLL;
            if (c0e5s != null) {
                c0e5s.QD2(false, false);
            }
            C0E48 c0e484 = this.LL;
            if (c0e484 != null && (player2 = c0e484.getPlayer()) != null) {
                player2.setActive(false);
            }
            Bundle arguments = getArguments();
            boolean z = true;
            if (arguments != null) {
                z = arguments.getBoolean("is_main_menu_smart_trim", true);
            }
            this.LLLII = z;
            ((SmartTrimViewModel) wS()).AQ2();
            if (!this.LLLII) {
                C0E48 c0e485 = this.LL;
                if (c0e485 != null && (nLETrackSlotLLLLLLIL2 = c0e485.LLLLLLIL()) != null && (c0e48 = this.LL) != null && (nLETrackRn2 = c0e48.Rn()) != null && (numValueOf = Integer.valueOf(nLETrackRn2.getSlotIndex(nLETrackSlotLLLLLLIL2))) != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = -1;
                }
                this.LLLIL = iIntValue;
                C0E48 c0e486 = this.LL;
                if (c0e486 != null && (nLETrackSlotLLLLLLIL = c0e486.LLLLLLIL()) != null) {
                    ((SmartTrimViewModel) wS()).BQ2(nLETrackSlotLLLLLLIL);
                }
            }
            C0E48 c0e487 = this.LL;
            if (c0e487 != null) {
                nLENodeDeepClone = C350870DpF.LJI(c0e487).deepClone(false);
            } else {
                nLENodeDeepClone = null;
            }
            this.LLLIILIL = nLENodeDeepClone;
            lT(this, 0L, null, 14);
            C0E48 c0e488 = this.LL;
            if (c0e488 != null && (mainTrack = C350870DpF.LJI(c0e488).getMainTrack()) != null && (slots = mainTrack.getSlots()) != null) {
                Iterator<NLETrackSlot> it2 = slots.iterator();
                if (it2.hasNext()) {
                    Long lValueOf = Long.valueOf(it2.next().getDuration());
                    while (it2.hasNext()) {
                        Long lValueOf2 = Long.valueOf(it2.next().getDuration());
                        if (lValueOf.compareTo(lValueOf2) > 0) {
                            lValueOf = lValueOf2;
                        }
                    }
                    if (lValueOf != null) {
                        float fLIZ = C352310DrZ.LIZ(lValueOf.longValue());
                        float fLIZJ = C360610EBv.LIZJ() * fLIZ;
                        float f = this.LLLILZ;
                        float f2 = C360610EBv.LIZJ / (f / fLIZ);
                        float f3 = LSPassThroughRecordSizeConfig.DEFAULT / f2;
                        if (fLIZJ < f) {
                            C360610EBv.LIZ = (int) f2;
                        }
                        this.LLLILZJ = Math.max(f3, C368130Ebz.LIZJ);
                    }
                }
            }
            C368140Ec0 c368140Ec0 = (C368140Ec0) view.findViewById(R.id.jo7);
            if (c368140Ec0 != null) {
                c368140Ec0.setPlayHeadWidth(C0FU0.LIZ(2.0f));
                c368140Ec0.setGapWidth(0.0f);
                c368140Ec0.invalidate();
            }
            C368870EdB c368870EdB2 = (C368870EdB) view.findViewById(R.id.jo_);
            this.LLLFZ = c368870EdB2;
            if (c368870EdB2 != null) {
                c368870EdB2.setLimitedMinScale(this.LLLILZJ);
            }
            C368870EdB c368870EdB3 = this.LLLFZ;
            if (c368870EdB3 != null) {
                c368870EdB3.LLILZIL = new InterfaceC369000EdO() { // from class: X.0E41
                    @Override // X.InterfaceC369000EdO
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC369000EdO
                    public final void LJJI() {
                    }

                    @Override // X.InterfaceC369000EdO
                    public final void LJJII() {
                    }

                    @Override // X.InterfaceC369000EdO
                    public final void LJIJJLI() {
                        C0E55 player4;
                        C0E48 c0e489;
                        C0E55 player5;
                        C0E48 c0e4810 = this.LIZ.LL;
                        if (c0e4810 == null || (player4 = c0e4810.getPlayer()) == null || !player4.isPlaying() || (c0e489 = this.LIZ.LL) == null || (player5 = c0e489.getPlayer()) == null) {
                            return;
                        }
                        player5.pause(false);
                    }

                    @Override // X.InterfaceC369000EdO
                    public final void LJJIFFI(SeekInfo seekInfo) {
                        long jLJII;
                        C0E55 player4;
                        C0E55 player5;
                        C0E55 player6;
                        C0E55 player7;
                        C0E55 player8;
                        C0E55 player9;
                        C0E55 player10;
                        C0E55 player11;
                        C0E48 c0e489;
                        C0E55 player12;
                        C0E48 c0e4810 = this.LIZ.LL;
                        if (c0e4810 != null && (player11 = c0e4810.getPlayer()) != null && player11.isPlaying() && (c0e489 = this.LIZ.LL) != null && (player12 = c0e489.getPlayer()) != null) {
                            player12.pause(false);
                        }
                        SmartTrimFragment smartTrimFragment = this.LIZ;
                        C0E48 c0e4811 = smartTrimFragment.LL;
                        long jJh = 0;
                        if (c0e4811 != null) {
                            jLJII = C350870DpF.LJII(c0e4811);
                        } else {
                            jLJII = 0;
                        }
                        C0E48 c0e4812 = smartTrimFragment.LL;
                        if (c0e4812 != null) {
                            jJh = c0e4812.getPlayer().Jh();
                        }
                        if (seekInfo.isEnd()) {
                            int i = seekInfo.seekFlag;
                            if (i != 1) {
                                if (i != 6) {
                                    C0E48 c0e4813 = smartTrimFragment.LL;
                                    if (c0e4813 != null && (player10 = c0e4813.getPlayer()) != null) {
                                        player10.LJIIL(0.0f, 0.0f, jLJII);
                                    }
                                } else {
                                    C0E48 c0e4814 = smartTrimFragment.LL;
                                    if (c0e4814 != null && (player9 = c0e4814.getPlayer()) != null) {
                                        player9.LJIIL(0.0f, 0.0f, jLJII);
                                    }
                                    C0E48 c0e4815 = smartTrimFragment.LL;
                                    if (c0e4815 != null && (player8 = c0e4815.getPlayer()) != null) {
                                        player8.flushSeekCmd();
                                    }
                                }
                            } else {
                                C0E48 c0e4816 = smartTrimFragment.LL;
                                if (c0e4816 != null && (player7 = c0e4816.getPlayer()) != null) {
                                    player7.LIZIZ(jLJII);
                                }
                            }
                            InterfaceC360800ECo interfaceC360800ECo = smartTrimFragment.LLLLII;
                            if (interfaceC360800ECo != null) {
                                interfaceC360800ECo.gm0(Long.valueOf(jLJII), null);
                                return;
                            }
                            return;
                        }
                        int i2 = seekInfo.seekFlag;
                        if (i2 == 0) {
                            C0E48 c0e4817 = smartTrimFragment.LL;
                            if (c0e4817 != null && (player6 = c0e4817.getPlayer()) != null) {
                                player6.LJIIL(seekInfo.seekPxSpeed, seekInfo.seekDurationSpeed, C352310DrZ.LIZ(seekInfo.position));
                            }
                            InterfaceC360800ECo interfaceC360800ECo2 = smartTrimFragment.LLLLII;
                            if (interfaceC360800ECo2 == null) {
                                return;
                            }
                            interfaceC360800ECo2.gm0(Long.valueOf(C352310DrZ.LIZ(seekInfo.position)), null);
                            return;
                        }
                        if (i2 == 6) {
                            C0E48 c0e4818 = smartTrimFragment.LL;
                            if (c0e4818 != null && (player5 = c0e4818.getPlayer()) != null) {
                                player5.flushSeekCmd();
                            }
                            InterfaceC360800ECo interfaceC360800ECo3 = smartTrimFragment.LLLLII;
                            if (interfaceC360800ECo3 == null) {
                                return;
                            }
                            interfaceC360800ECo3.gm0(Long.valueOf(C352310DrZ.LIZ(seekInfo.position)), null);
                            return;
                        }
                        C0E48 c0e4819 = smartTrimFragment.LL;
                        if (c0e4819 != null && (player4 = c0e4819.getPlayer()) != null) {
                            player4.LIZIZ(C352310DrZ.LIZ(seekInfo.position));
                        }
                        InterfaceC360800ECo interfaceC360800ECo4 = smartTrimFragment.LLLLII;
                        if (interfaceC360800ECo4 == null) {
                            return;
                        }
                        interfaceC360800ECo4.gm0(Long.valueOf(jJh), null);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC369000EdO
                    public final void LJJ(EnumC368970EdL enumC368970EdL, NLETrackSlot nLETrackSlot, int i, long j) {
                        ArrayList<C351480DqE> arrayList;
                        C351480DqE next;
                        NLEModel nLEModelDynamicCast;
                        NLETrackSlot slotByIndex;
                        NLETrack nLETrackRn3;
                        NLEEditor nLEEditorLJI;
                        SmartTrimFragment smartTrimFragment = this.LIZ;
                        NLENode nLENode = smartTrimFragment.LLLIILIL;
                        if (nLENode != null && (nLEModelDynamicCast = NLEModel.dynamicCast(nLENode.deepClone(false))) != null) {
                            C0E48 c0e489 = smartTrimFragment.LL;
                            if (c0e489 != null && (nLEEditorLJI = c0e489.LLFII().LJI()) != null) {
                                nLEEditorLJI.setModel(nLEModelDynamicCast);
                            }
                            C0E48 c0e4810 = smartTrimFragment.LL;
                            if (c0e4810 != null) {
                                C350870DpF.LIZ(c0e4810, false);
                            }
                            if (smartTrimFragment.LLLIL != -1) {
                                C0E48 c0e4811 = smartTrimFragment.LL;
                                if (c0e4811 != null && (nLETrackRn3 = c0e4811.Rn()) != null) {
                                    slotByIndex = nLETrackRn3.getSlotByIndex(0);
                                } else {
                                    slotByIndex = null;
                                }
                                C0E48 c0e4812 = smartTrimFragment.LL;
                                if (c0e4812 != null) {
                                    c0e4812.S7().LIZIZ(new C358740E4q(slotByIndex, 0, null, false, 0, 238), "select_slot_event", false);
                                }
                            }
                        }
                        C368870EdB c368870EdB4 = this.LIZ.LLLFZ;
                        if (c368870EdB4 != null) {
                            arrayList = c368870EdB4.LIZIZ();
                        } else {
                            arrayList = new ArrayList<>();
                        }
                        this.LIZ.LLLIZZ.clear();
                        SmartTrimFragment smartTrimFragment2 = this.LIZ;
                        Iterator<C351480DqE> it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            smartTrimFragment2.LLLIZZ.addAll(it3.next().LIZIZ);
                        }
                        ((SmartTrimViewModel) this.LIZ.wS()).xQ2(arrayList, this.LIZ.LLLII);
                        Iterator<C351480DqE> it4 = arrayList.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next = it4.next();
                                if (Intrinsics.LJFF(next.LIZ, nLETrackSlot)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        C351480DqE c351480DqE = next;
                        if (c351480DqE != null) {
                            SmartTrimFragment smartTrimFragment3 = this.LIZ;
                            Pair pair = (Pair) C13LP.LJJJLZIJ(i, c351480DqE.LIZIZ);
                            if (pair != null) {
                                VideoPublishEditModel videoPublishEditModelZS = smartTrimFragment3.ZS();
                                if (videoPublishEditModelZS != null) {
                                    C361680EFy.LJJJJZI(j, ((Number) pair.getSecond()).longValue() - ((Number) pair.getFirst()).longValue(), videoPublishEditModelZS, smartTrimFragment3.LL, "smart_trim");
                                }
                                if (enumC368970EdL == EnumC368970EdL.START) {
                                    long jLongValue = ((Number) pair.getFirst()).longValue();
                                    int i2 = (int) jLongValue;
                                    smartTrimFragment3.LLLJIL.LIZIZ(i2);
                                    SmartTrimFragment.lT(smartTrimFragment3, C352310DrZ.LIZLLL(jLongValue), null, 14);
                                    C368870EdB c368870EdB5 = smartTrimFragment3.LLLFZ;
                                    if (c368870EdB5 != null) {
                                        c368870EdB5.LIZJ(i2);
                                        return;
                                    }
                                    return;
                                }
                                if (enumC368970EdL != EnumC368970EdL.END) {
                                    return;
                                }
                                long jLongValue2 = ((Number) pair.getSecond()).longValue();
                                int i3 = (int) jLongValue2;
                                smartTrimFragment3.LLLJIL.LIZIZ(i3);
                                SmartTrimFragment.lT(smartTrimFragment3, C352310DrZ.LIZLLL(jLongValue2), null, 14);
                                C368870EdB c368870EdB6 = smartTrimFragment3.LLLFZ;
                                if (c368870EdB6 == null) {
                                    return;
                                }
                                c368870EdB6.LIZJ(i3);
                            }
                        }
                    }
                };
            }
            this.LLLFFI = (FrameCacheViewModel) ViewModelProviders.of(requireActivity()).get(FrameCacheViewModel.class);
            C0E48 c0e489 = this.LL;
            if (c0e489 != null && (nLETrackRn = c0e489.Rn()) != null && (sortedSlots = nLETrackRn.getSortedSlots()) != null && (c368870EdB = this.LLLFZ) != null) {
                FrameCacheViewModel frameCacheViewModel = this.LLLFFI;
                if (frameCacheViewModel == null) {
                    frameCacheViewModel = null;
                }
                c368870EdB.LIZ(sortedSlots, frameCacheViewModel.wQ2());
            }
            DialogC1390150mHN dialogC1390150mHN = this.LLLIIII;
            if (dialogC1390150mHN != null) {
                dialogC1390150mHN.LJJLL(0.0f, false);
            } else {
                final DialogC1390150mHN dialogC1390150mHN2 = new DialogC1390150mHN(requireActivity());
                dialogC1390150mHN2.LJJZ(false);
                dialogC1390150mHN2.LJJLJLI(requireActivity().getString(2131848552));
                C354270Duj.LIZ(3000L, new AwS406S0200000_5(dialogC1390150mHN2, this, 127));
                dialogC1390150mHN2.LLILZLL = new InterfaceC1389630mGX() { // from class: X.0E5g
                    @Override // X.InterfaceC1389630mGX
                    public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                        this.LIZ.kT();
                    }
                };
                dialogC1390150mHN2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0E65
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        if (i == 4 && keyEvent.getAction() == 1) {
                            C786410Ut5.LJIIJJI(dialogC1390150mHN2);
                            this.kT();
                            return true;
                        }
                        return false;
                    }
                });
                this.LLLIIII = dialogC1390150mHN2;
            }
            this.LLLILZLLLI = System.currentTimeMillis();
            DialogC1390150mHN dialogC1390150mHN3 = this.LLLIIII;
            if (dialogC1390150mHN3 != null) {
                C786410Ut5.K4(dialogC1390150mHN3);
            }
            BaseViewModel baseViewModel = (BaseViewModel) wS();
            InterfaceC355380DwW interfaceC355380DwW = new InterfaceC355380DwW() { // from class: X.0E5h
                @Override // X.InterfaceC355380DwW
                public final void LIZ(long j, boolean z2) {
                    C361680EFy.LJIIIZ(j, z2);
                }
            };
            C0E48 c0e4810 = baseViewModel.editorContext;
            if (c0e4810 != null) {
                c0e4810.LLFII().LJJLL(interfaceC355380DwW);
            }
            ((SmartTrimViewModel) wS()).vQ2(new InterfaceC355360DwU() { // from class: X.0E42
                @Override // X.InterfaceC355360DwU
                public final void onProgress(int i) {
                    DialogC1390150mHN dialogC1390150mHN4;
                    DialogC1390150mHN dialogC1390150mHN5 = this.LIZ.LLLIIII;
                    if (dialogC1390150mHN5 != null && dialogC1390150mHN5.isShowing() && (dialogC1390150mHN4 = this.LIZ.LLLIIII) != null) {
                        dialogC1390150mHN4.LJJLL(i, false);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC355360DwU
                public final void onSuccess(List<Pair<Long, Long>> list) {
                    boolean z2;
                    long maxEnd;
                    ArrayList<C351480DqE> arrayList;
                    C0E48 c0e4811;
                    C0E55 player4;
                    C0E55 player5;
                    Pair pair;
                    Long l;
                    NLETrack nLETrackRn3;
                    VideoPublishEditModel videoPublishEditModelZS;
                    DialogC1390150mHN dialogC1390150mHN4;
                    DialogC1390150mHN dialogC1390150mHN5 = this.LIZ.LLLIIII;
                    if (dialogC1390150mHN5 != null && dialogC1390150mHN5.isShowing() && (dialogC1390150mHN4 = this.LIZ.LLLIIII) != null) {
                        dialogC1390150mHN4.LJJLL(100.0f, false);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ.LLLILZLLLI;
                    C361680EFy.LJJLL("", jCurrentTimeMillis, 0, null);
                    SmartTrimFragment smartTrimFragment = this.LIZ;
                    if (smartTrimFragment.LL != null && (videoPublishEditModelZS = smartTrimFragment.ZS()) != null) {
                        C361680EFy.LJJLJLI(jCurrentTimeMillis, videoPublishEditModelZS, smartTrimFragment.LL);
                    }
                    SmartTrimFragment smartTrimFragment2 = this.LIZ;
                    smartTrimFragment2.getClass();
                    String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
                    Keva keva = smartTrimFragment2.LLLJ;
                    if (keva != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ep_smart_trim_complete_toast_show_");
                        sbLIZ.append(currentUserID);
                        z2 = keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        C19EG c19egRequireActivity = this.LIZ.requireActivity();
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.message(this.LIZ.getString(2131848553));
                        creativeToastBuilder.isTuxToast(true);
                        C1390380mHk.LIZ(c19egRequireActivity, 5012, creativeToastBuilder);
                        SmartTrimFragment smartTrimFragment3 = this.LIZ;
                        smartTrimFragment3.getClass();
                        String currentUserID2 = C0CHQ.LIZ().getAccountService().getCurrentUserID();
                        Keva keva2 = smartTrimFragment3.LLLJ;
                        if (keva2 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("ep_smart_trim_complete_toast_show_");
                            sbLIZ2.append(currentUserID2);
                            keva2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
                        }
                    }
                    C0E48 c0e4812 = this.LIZ.LL;
                    if (c0e4812 != null && (nLETrackRn3 = c0e4812.Rn()) != null) {
                        maxEnd = nLETrackRn3.getMaxEnd();
                    } else {
                        maxEnd = 0;
                    }
                    long j = maxEnd / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    long j2 = j - ((long) 3);
                    if (list.size() == 1 && (pair = (Pair) C13LP.LJJJLL(list)) != null && ((Number) pair.getFirst()).longValue() == 0) {
                        C354710DvR c354710DvR = new C354710DvR(j2, j);
                        Pair pair2 = (Pair) C13LP.LJJJLL(list);
                        if (pair2 != null && (l = (Long) pair2.getSecond()) != null && c354710DvR.LJIIIIZZ(l.longValue())) {
                            C19EG c19egRequireActivity2 = this.LIZ.requireActivity();
                            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                            creativeToastBuilder2.message(this.LIZ.getString(2131848551));
                            creativeToastBuilder2.isTuxToast(true);
                            C1390380mHk.LIZ(c19egRequireActivity2, 5012, creativeToastBuilder2);
                        }
                    }
                    ArrayList<Pair<Long, Long>> arrayList2 = new ArrayList<>();
                    arrayList2.addAll(list);
                    C368870EdB c368870EdB4 = this.LIZ.LLLFZ;
                    if (c368870EdB4 != null) {
                        c368870EdB4.LIZLLL(arrayList2);
                    }
                    C368870EdB c368870EdB5 = this.LIZ.LLLFZ;
                    if (c368870EdB5 != null) {
                        arrayList = c368870EdB5.LIZIZ();
                    } else {
                        arrayList = new ArrayList<>();
                    }
                    this.LIZ.LLLIZZ.clear();
                    SmartTrimFragment smartTrimFragment4 = this.LIZ;
                    Iterator<C351480DqE> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        smartTrimFragment4.LLLIZZ.addAll(it3.next().LIZIZ);
                    }
                    ((SmartTrimViewModel) this.LIZ.wS()).xQ2(arrayList, this.LIZ.LLLII);
                    C0E48 c0e4813 = this.LIZ.LL;
                    if ((c0e4813 == null || (player5 = c0e4813.getPlayer()) == null || !player5.isPlaying()) && ((LifecycleOwner) this.LIZ.LLLJL.getValue()).getLifecycle().getCurrentState() == Lifecycle.State.RESUMED && (c0e4811 = this.LIZ.LL) != null && (player4 = c0e4811.getPlayer()) != null) {
                        player4.LLIL(false);
                    }
                }

                @Override // X.InterfaceC355360DwU
                public final void onFail(int i, String str) {
                    DialogC1390150mHN dialogC1390150mHN4;
                    C361680EFy.LJJLL(str, System.currentTimeMillis() - this.LIZ.LLLILZLLLI, 1, Integer.valueOf(i));
                    C19EG c19egRequireActivity = this.LIZ.requireActivity();
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.message(this.LIZ.getString(2131848557));
                    creativeToastBuilder.isTuxToast(true);
                    C1390380mHk.LIZ(c19egRequireActivity, 5012, creativeToastBuilder);
                    DialogC1390150mHN dialogC1390150mHN5 = this.LIZ.LLLIIII;
                    if (dialogC1390150mHN5 != null && dialogC1390150mHN5.isShowing() && (dialogC1390150mHN4 = this.LIZ.LLLIIII) != null) {
                        dialogC1390150mHN4.dismiss();
                        C785410UrT.LIZ(dialogC1390150mHN4);
                    }
                    SmartTrimFragment smartTrimFragment = this.LIZ;
                    smartTrimFragment.jT();
                    smartTrimFragment.NR();
                }
            });
            C0E48 c0e4811 = this.LL;
            if (c0e4811 != null && (player = c0e4811.getPlayer()) != null) {
                player.LJJ(this.LLLLIIIILLL);
            }
            LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe((LifecycleOwner) this.LLLJL.getValue(), this.LLLLIIL);
            Scene sceneLIZ2 = C0EBE.LIZ(view);
            if (!(sceneLIZ2 instanceof C19A3) || (c19a3 = (C19A3) sceneLIZ2) == null || (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI) == null) {
                return;
            }
            this.LLLL = (C0E5S) c1drg.LJIIL(null, C0E5S.class);
        }
    }

    public static void lT(SmartTrimFragment smartTrimFragment, long j, INLEListenerSeek iNLEListenerSeek, int i) {
        boolean z;
        C0E55 player;
        C0E55 player2;
        boolean z2 = true;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) == 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            iNLEListenerSeek = new INLEListenerSeek() { // from class: X.0E5l
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSeek
                public final void onSeekDone(int i2) {
                }
            };
        }
        if (z2) {
            InterfaceC360800ECo interfaceC360800ECo = smartTrimFragment.LLLLII;
            if (interfaceC360800ECo != null) {
                interfaceC360800ECo.gm0(Long.valueOf(C352310DrZ.LIZ(j)), null);
            }
        } else {
            smartTrimFragment.getClass();
        }
        C0FX2 c0fx2 = new C0FX2(new AtomicBoolean(false), iNLEListenerSeek, 12);
        if (z) {
            C0E48 c0e48 = smartTrimFragment.LL;
            if (c0e48 != null && (player2 = c0e48.getPlayer()) != null) {
                player2.LJJII(j, c0fx2);
            }
        } else {
            C0E48 c0e482 = smartTrimFragment.LL;
            if (c0e482 != null && (player = c0e482.getPlayer()) != null) {
                player.ba(C351220Dpo.LLLLLLL(j), c0fx2);
            }
        }
        C354270Duj.LIZ(600L, new AwS549S0100000_5(c0fx2, 1196));
    }
}
