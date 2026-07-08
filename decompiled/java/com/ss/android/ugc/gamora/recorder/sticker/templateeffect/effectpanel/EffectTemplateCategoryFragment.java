package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel;

import X.AbstractC1585810rMx;
import X.AbstractC1636650sgx;
import X.AbstractC214823195h;
import X.AbstractC21673619ry;
import X.AbstractC340470DWj;
import X.C01GW;
import X.C03A0;
import X.C098200Yq;
import X.C0C03;
import X.C0JEH;
import X.C0JEI;
import X.C0LAB;
import X.C0PEM;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C118300cf;
import X.C11JF;
import X.C11NZ;
import X.C11PQ;
import X.C11RK;
import X.C1365870leD;
import X.C1391850mK7;
import X.C13BV;
import X.C1449260noi;
import X.C14EU;
import X.C1623660sM0;
import X.C1625460sOu;
import X.C1625940sPg;
import X.C1629220sUy;
import X.C1629840sVy;
import X.C1630880sXe;
import X.C1630990sXp;
import X.C1631250sYF;
import X.C1636150sg9;
import X.C1636320sgQ;
import X.C1636520sgk;
import X.C1636550sgn;
import X.C1636570sgp;
import X.C1636640sgw;
import X.C1636790shB;
import X.C1637160shm;
import X.C1641640sp0;
import X.C1656550tD3;
import X.C1659630tI1;
import X.C1685300txQ;
import X.C1737170vJ5;
import X.C1737910vKH;
import X.C189200o6;
import X.C19475711Hn;
import X.C19EG;
import X.C19GS;
import X.C1DRG;
import X.C20012313Rx;
import X.C201955140j;
import X.C20533215Wg;
import X.C20684815ws;
import X.C2097608Jq;
import X.C21679919sz;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2296808zG;
import X.C23250099c;
import X.C317340CcG;
import X.C318240Cdi;
import X.C318380Cdw;
import X.C318390Cdx;
import X.C318650CeN;
import X.C318670CeP;
import X.C318690CeR;
import X.C324210CnL;
import X.C336650DHr;
import X.C339520DSs;
import X.C339660DTg;
import X.C339670DTh;
import X.C339680DTi;
import X.C339710DTl;
import X.C339720DTm;
import X.C342540Dbo;
import X.C345120Dfy;
import X.C418440Gaw;
import X.C452501pT;
import X.C622680Oba;
import X.C786410Ut5;
import X.C7967039h;
import X.C814420VxA;
import X.EnumC1448980noG;
import X.EnumC1641470soj;
import X.EnumC318740CeW;
import X.EnumC339730DTn;
import X.InterfaceC1446830nkn;
import X.InterfaceC1623190sLF;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625970sPj;
import X.InterfaceC1628910sUT;
import X.InterfaceC1629300sV6;
import X.InterfaceC1631590sYn;
import X.InterfaceC1635560sfC;
import X.InterfaceC1635780sfY;
import X.InterfaceC1636390sgX;
import X.InterfaceC318360Cdu;
import X.InterfaceC339530DSt;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.ViewOnAttachStateChangeListenerC1698110uI5;
import Y.ACListenerS117S0200000_14;
import Y.ACListenerS138S0100000_3;
import Y.AObserverS169S0200000_4;
import Y.AObserverS186S0200000_25;
import Y.AObserverS208S0100000_4;
import Y.AObserverS227S0100000_25;
import Y.ARunnableS114S0100000_14;
import Y.ARunnableS125S0100000_25;
import Y.ARunnableS13S0400000_4;
import Y.AfS183S0100000_14;
import Y.AsS51S0100000_25;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.effect.EffectCreationBanStatusViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerStatesStoreViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.protocol.ICreateTabFillScreenAdapter;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.util.PinTemplateListEffectWrapper;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.guidesubmit.b;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.OnboardingButtonClickListener;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.OpenDialogBoxUtil;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS213S0300000_4;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS653S0100000_4;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectTemplateCategoryFragment extends Fragment implements InterfaceC1631590sYn<Fragment> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWs+LCw8OiEpO2EgPCwvIiohZjEpJD8/KTEpHELIOSLCk1LSY4Zyo1LiAvPT8yJiAgZwo1LiAvPRs2JTUgKDs2CyQ4LCg8OjwKOy40JSAiPQ==";
    public ShortVideoContext LL;
    public InterfaceC1623190sLF LLILZ;
    public InterfaceC1635780sfY LLILZIL;
    public b LLILZLL;
    public C1DRG LLIZ;
    public View LLIZLLLIL;
    public int LLJILJIL;
    public InterfaceC1624480sNK LLJILJILJ;
    public C1631250sYF LLJILLL;
    public C1630880sXe LLJJ;
    public boolean LLJJIJIIJIL;
    public RecyclerView LLJJJ;
    public View LLJJJIL;
    public Effect LLJJJJ;
    public CreativeDialogWrapper LLJJL;
    public C1636150sg9 LLJJLIIIJLLLLLLLZ;
    public final C21679919sz LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public C11JF LLLFFI;
    public final C01GW LLLFZ;
    public final C324210CnL LLLI;
    public final C11PQ<Boolean> LLILLJJLI = new C11PQ<>();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 650));
    public final C1636570sgp LLJ = new InterfaceC484050IyZ() { // from class: X.0sgp
        /* JADX WARN: Can't wrap try/catch for region: R(6:8|(2:26|9)|18|24|19|(2:15|16)(1:29)) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        @Override // X.InterfaceC484050IyZ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onActivityResult(int r7, int r8, android.content.Intent r9) {
            /*
                r6 = this;
                r0 = 10088(0x2768, float:1.4136E-41)
                if (r7 != r0) goto L45
                r0 = -1
                if (r8 != r0) goto L45
                r5 = 0
                if (r9 == 0) goto L30
                java.lang.String r0 = "request_code_publish_effect_result"
                java.lang.String r4 = r9.getStringExtra(r0)     // Catch: java.lang.Exception -> L11
                goto L32
            L11:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                r4 = r5
                if (r9 != 0) goto L32
                r3 = r5
            L19:
                if (r4 == 0) goto L30
                com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment r0 = r6.LL
                com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.TemplateEffectsViewModel r0 = r0.bS()
                X.01wk r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
                X.0sgo r1 = new X.0sgo
                com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment r0 = r6.LL
                r1.<init>(r0, r3, r4, r5)
                r0 = 3
                X.C23250099c.LIZLLL(r2, r5, r5, r1, r0)
            L30:
                r0 = 1
                return r0
            L32:
                java.lang.String r0 = "request_code_publish_effect_result_extra"
                android.os.Parcelable r3 = r9.getParcelableExtra(r0)
                com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.EffectPublishedExtraData r3 = (com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.EffectPublishedExtraData) r3
                java.lang.String r0 = "request_code_save_draft_result"
                r9.getStringExtra(r0)     // Catch: java.lang.Exception -> L40
                goto L19
            L40:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                goto L19
            L45:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1636570sgp.onActivityResult(int, int, android.content.Intent):boolean");
        }
    };
    public final Map<Integer, NewFaceStickerBean> LLJI = new LinkedHashMap();
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 654));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 649));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 655));
    public final C11RK<Integer> LLJJIJI = new C11RK<>();
    public boolean LLJJIJIL = true;
    public int LLJJJJJIL = -1;
    public int LLJJJJLIIL = -1;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 656));
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(321));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(320));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 651));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(319));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 314));

    @Override // X.InterfaceC1631590sYn
    public final Fragment LJJZZI() {
        return this;
    }

    @Override // X.InterfaceC1625800sPS
    public final void in(boolean z) {
    }

    public final void qS() {
        C318380Cdw c318380Cdw;
        String jumpEffectId;
        EnumC1641470soj value = bS().LLJIJIL.getValue();
        EnumC1641470soj enumC1641470soj = EnumC1641470soj.LOADING;
        boolean z = value == enumC1641470soj || ZR().LLJIJIL.getValue() == enumC1641470soj;
        EnumC1641470soj value2 = bS().LLJIJIL.getValue();
        EnumC1641470soj enumC1641470soj2 = EnumC1641470soj.ERROR;
        boolean z2 = value2 == enumC1641470soj2 || ZR().LLJIJIL.getValue() == enumC1641470soj2;
        Integer value3 = VR().LL.getValue();
        boolean z3 = value3 != null && value3.intValue() == 3;
        C1636150sg9 c1636150sg9 = this.LLJJLIIIJLLLLLLLZ;
        if (c1636150sg9 == null) {
            c1636150sg9 = null;
        }
        if (z3) {
            enumC1641470soj = EnumC1641470soj.NONE;
        } else if (!z) {
            enumC1641470soj = z2 ? enumC1641470soj2 : EnumC1641470soj.NONE;
        }
        c1636150sg9.setState((Enum) enumC1641470soj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeInitialDataLoaded isLoading=");
        sbLIZ.append(z);
        sbLIZ.append(", isError=");
        sbLIZ.append(z2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ));
        boolean z4 = (z || z2 || z3) ? false : true;
        RecyclerView recyclerView = this.LLJJJ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        C786410Ut5.LLIZLLLIL(recyclerView, z4 ? 0 : 8);
        if (z4) {
            List<Effect> value4 = bS().LLIZLLLIL.getValue();
            if (value4 == null) {
                value4 = C13BV.INSTANCE;
            }
            List<Effect> value5 = ZR().LLIZLLLIL.getValue();
            if (value5 == null) {
                value5 = C13BV.INSTANCE;
            }
            C189200o6<Integer> value6 = ZR().LLJJJJJIL.getValue();
            ((ArrayList) aS().LLILZ).clear();
            aS().LLILZIL = this.LLJILJIL;
            aS().setData(value4);
            if (value5.isEmpty()) {
                kS();
                C21679919sz c21679919sz = this.LLJZ;
                AbstractC21673619ry abstractC21673619ry = (AbstractC21673619ry) this.LLJLLL.getValue();
                if (abstractC21673619ry != null) {
                    c21679919sz.LLLFZ(abstractC21673619ry);
                }
                if (this.LLJJIJIL) {
                    c21679919sz.LLLFZ((AbstractC21673619ry) this.LLJLILLLLZIIL.getValue());
                }
                c21679919sz.LLLFZ(aS());
                return;
            }
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("showing nonEmpty view, jumpAllMyEffectIndexResult=");
            sbLIZ2.append(value6);
            C201955140j.LIZLLL(c20012313Rx, "DiyProp", C2188811AlT.LIZIZ(sbLIZ2));
            kS();
            C21679919sz c21679919sz2 = this.LLJZ;
            if (VR().vQ2()) {
                this.LLJZ.LLLFZ(new C7967039h());
            }
            AbstractC21673619ry abstractC21673619ry2 = (AbstractC21673619ry) this.LLJLLL.getValue();
            if (abstractC21673619ry2 != null) {
                c21679919sz2.LLLFZ(abstractC21673619ry2);
            }
            c21679919sz2.LLLFZ((AbstractC21673619ry) this.LLJLIL.getValue());
            c21679919sz2.LLLFZ(WR());
            if (this.LLJJIJIL) {
                c21679919sz2.LLLFZ((AbstractC21673619ry) this.LLJLILLLLZIIL.getValue());
            }
            c21679919sz2.LLLFZ(aS());
            ((ArrayList) WR().LLILZ).clear();
            WR().LLILZIL = this.LLJILJIL;
            WR().setData(value5);
            RecyclerView recyclerView2 = this.LLJJJ;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            recyclerView2.invalidateItemDecorations();
            if (value6 != null) {
                value6.m10unboximpl();
                if (!C189200o6.m7isFailureimpl(value6.m10unboximpl())) {
                    ((Handler) this.LLJIJIL.getValue()).post(new ARunnableS13S0400000_4(value6, value5, this, value4, 2));
                    return;
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(value6.m10unboximpl());
                if (!(thM5exceptionOrNullimpl instanceof C318380Cdw) || (c318380Cdw = (C318380Cdw) thM5exceptionOrNullimpl) == null || (jumpEffectId = c318380Cdw.getJumpEffectId()) == null || jumpEffectId.length() == 0) {
                    return;
                }
                String jumpDraftId = c318380Cdw.getJumpDraftId();
                if (jumpDraftId == null || jumpDraftId.length() == 0) {
                    mS();
                }
            }
        }
    }

    @Override // X.InterfaceC1625800sPS
    public final C11NZ<Integer> Cm() {
        C11RK<Integer> c11rk = this.LLJJIJI;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final void OR() {
        RecyclerView recyclerView = this.LLJJJ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        if (recyclerView.getAdapter() == null) {
            return;
        }
        C1631250sYF c1631250sYF = this.LLJILLL;
        if (c1631250sYF == null) {
            c1631250sYF = null;
        }
        InterfaceC1446830nkn interfaceC1446830nkn = c1631250sYF.LIZ;
        if (interfaceC1446830nkn != null) {
            EffectCategoryModel effectCategoryModelUR = UR();
            interfaceC1446830nkn.LIZ(effectCategoryModelUR != null ? effectCategoryModelUR.getName() : null);
        }
    }

    public final CreateTabBottomBtnViewModel SR() {
        return (CreateTabBottomBtnViewModel) this.LLLFF.getValue();
    }

    public final EffectCategoryModel UR() {
        return (EffectCategoryModel) this.LLJJI.getValue();
    }

    public final EffectCreationBanStatusViewModel VR() {
        return (EffectCreationBanStatusViewModel) this.LLLF.getValue();
    }

    public final C1636640sgw WR() {
        return (C1636640sgw) this.LLJLL.getValue();
    }

    public final MyEffectsViewModel ZR() {
        return (MyEffectsViewModel) this.LLL.getValue();
    }

    public final C1636640sgw aS() {
        return (C1636640sgw) this.LLJL.getValue();
    }

    public final TemplateEffectsViewModel bS() {
        return (TemplateEffectsViewModel) this.LLLFZ.getValue();
    }

    public final void gS() {
        ArrayList arrayList;
        C21679919sz c21679919sz;
        Bundle bundle;
        String name;
        String key;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        InterfaceC1446830nkn interfaceC1446830nkn;
        AwS391S0200000_25 awS391S0200000_25;
        C21679919sz c21679919sz2;
        InterfaceC1624480sNK interfaceC1624480sNK = this.LLJILJILJ;
        if (interfaceC1624480sNK == null) {
            interfaceC1624480sNK = null;
        }
        Map<String, List<Integer>> mapLJJJLIIL = interfaceC1624480sNK.LJJJLIIL();
        EffectCategoryModel effectCategoryModelUR = UR();
        String name2 = effectCategoryModelUR != null ? effectCategoryModelUR.getName() : null;
        RecyclerView recyclerView = this.LLJJJ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (!(adapter instanceof C21679919sz) || (c21679919sz2 = (C21679919sz) adapter) == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            int itemCount = 1;
            for (AbstractC21673619ry<? extends RecyclerView.ViewHolder> abstractC21673619ry : c21679919sz2.LLLI()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("calcCreateTabSubTitleIndexList, adapter = ");
                sbLIZ.append(abstractC21673619ry);
                sbLIZ.append(", beforeCnt = ");
                sbLIZ.append(itemCount);
                sbLIZ.append(", itemCount = ");
                sbLIZ.append(abstractC21673619ry.getItemCount());
                C1636790shB.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if ((abstractC21673619ry instanceof ICreateTabFillScreenAdapter) || (abstractC21673619ry instanceof C03A0)) {
                    arrayList.add(Integer.valueOf(itemCount));
                }
                itemCount += abstractC21673619ry.getItemCount();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("calcCreateTabSubTitleIndexList, return ");
            sbLIZ2.append(arrayList);
            sbLIZ2.append(", ");
            C1636790shB.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        mapLJJJLIIL.put(name2, arrayList);
        RecyclerView recyclerView2 = this.LLJJJ;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        AbstractC21673619ry adapter2 = recyclerView2.getAdapter();
        if (!(adapter2 instanceof C21679919sz) || (c21679919sz = (C21679919sz) adapter2) == null) {
            return;
        }
        for (AbstractC21673619ry<? extends RecyclerView.ViewHolder> abstractC21673619ry2 : c21679919sz.LLLI()) {
            if (abstractC21673619ry2 instanceof C1636320sgQ) {
                bundle = new Bundle();
                C786410Ut5.LJJIZ(bundle, "category_model", UR());
                if (((ArrayList) ((AbstractC1636650sgx) abstractC21673619ry2).LLILZ).isEmpty()) {
                    return;
                }
                EffectCategoryModel effectCategoryModelUR2 = UR();
                name = effectCategoryModelUR2 != null ? effectCategoryModelUR2.getName() : null;
                EffectCategoryModel effectCategoryModelUR3 = UR();
                key = effectCategoryModelUR3 != null ? effectCategoryModelUR3.getKey() : null;
                RecyclerView recyclerView3 = this.LLJJJ;
                if (recyclerView3 == null) {
                    recyclerView3 = null;
                }
                iFindFirstVisibleItemPosition = ((LinearLayoutManager) recyclerView3.getLayoutManager()).findFirstVisibleItemPosition();
                RecyclerView recyclerView4 = this.LLJJJ;
                if (recyclerView4 == null) {
                    recyclerView4 = null;
                }
                iFindLastVisibleItemPosition = ((LinearLayoutManager) recyclerView4.getLayoutManager()).findLastVisibleItemPosition();
                C1631250sYF c1631250sYF = this.LLJILLL;
                if (c1631250sYF == null) {
                    c1631250sYF = null;
                }
                interfaceC1446830nkn = c1631250sYF.LIZ;
                if (interfaceC1446830nkn != null) {
                    awS391S0200000_25 = new AwS391S0200000_25(this, c21679919sz, 329);
                    interfaceC1446830nkn.LIZLLL(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition, name, key, bundle, awS391S0200000_25);
                }
            } else if (abstractC21673619ry2 instanceof ICreateTabFillScreenAdapter) {
                bundle = new Bundle();
                C786410Ut5.LJJIZ(bundle, "category_model", UR());
                EffectCategoryModel effectCategoryModelUR4 = UR();
                name = effectCategoryModelUR4 != null ? effectCategoryModelUR4.getName() : null;
                EffectCategoryModel effectCategoryModelUR5 = UR();
                key = effectCategoryModelUR5 != null ? effectCategoryModelUR5.getKey() : null;
                RecyclerView recyclerView5 = this.LLJJJ;
                if (recyclerView5 == null) {
                    recyclerView5 = null;
                }
                iFindFirstVisibleItemPosition = ((LinearLayoutManager) recyclerView5.getLayoutManager()).findFirstVisibleItemPosition();
                RecyclerView recyclerView6 = this.LLJJJ;
                if (recyclerView6 == null) {
                    recyclerView6 = null;
                }
                iFindLastVisibleItemPosition = ((LinearLayoutManager) recyclerView6.getLayoutManager()).findLastVisibleItemPosition();
                C1631250sYF c1631250sYF2 = this.LLJILLL;
                if (c1631250sYF2 == null) {
                    c1631250sYF2 = null;
                }
                interfaceC1446830nkn = c1631250sYF2.LIZ;
                if (interfaceC1446830nkn != null) {
                    awS391S0200000_25 = new AwS391S0200000_25(this, c21679919sz, 329);
                    interfaceC1446830nkn.LIZLLL(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition, name, key, bundle, awS391S0200000_25);
                }
            }
        }
    }

    public final void kS() {
        Iterator<? extends AbstractC21673619ry<? extends RecyclerView.ViewHolder>> it2 = this.LLJZ.LLLI().iterator();
        while (it2.hasNext()) {
            this.LLJZ.LLLIIIIL(it2.next());
        }
    }

    public final void mS() {
        LinearLayoutManager linearLayoutManager;
        int iLIZ = C336650DHr.LIZ((AbstractC21673619ry) this.LLJLIL.getValue(), this.LLJZ);
        if (iLIZ == -1) {
            return;
        }
        RecyclerView recyclerView = this.LLJJJ;
        if (recyclerView == null) {
            recyclerView = null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(iLIZ, 0);
    }

    public final void oS() {
        InterfaceC1635780sfY interfaceC1635780sfY = this.LLILZIL;
        if (interfaceC1635780sfY == null || !interfaceC1635780sfY.LIZ()) {
            this.LLILLJJLI.onNext(Boolean.FALSE);
            return;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            OnboardingButtonClickListener onboardingButtonClickListener = new OnboardingButtonClickListener() { // from class: com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment$showVideoOnBoardingDialog$clickListener$1
                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                }

                @Override // com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.OnboardingButtonClickListener
                public final void YC() {
                    ShortVideoContext shortVideoContext = this.LL.LL;
                    String str = (shortVideoContext == null ? null : shortVideoContext).enterFrom;
                    if (str == null) {
                        str = "";
                    }
                    if (shortVideoContext == null) {
                        shortVideoContext = null;
                    }
                    String str2 = shortVideoContext.shootWay;
                    String str3 = str2 != null ? str2 : "";
                    C0LAB c0lab = new C0LAB();
                    ShortVideoContext shortVideoContext2 = this.LL.LL;
                    if (shortVideoContext2 == null) {
                        shortVideoContext2 = null;
                    }
                    c0lab.LJ("creation_id", shortVideoContext2.getCreationId());
                    c0lab.LJ("enter_from", str);
                    c0lab.LJ("shoot_way", str3);
                    ShortVideoContext shortVideoContext3 = this.LL.LL;
                    c0lab.LJ("is_photo_mode", (shortVideoContext3 != null ? shortVideoContext3 : null).LJJIJIL());
                    C20684815ws.LJIILLIIL("click_continue_mec_onboarding", c0lab.LIZ);
                }

                @Override // com.ss.android.ugc.gamora.recorder.sticker.templateeffect.utils.OnboardingButtonClickListener
                public final void sg() {
                    ShortVideoContext shortVideoContext = this.LL.LL;
                    String str = (shortVideoContext == null ? null : shortVideoContext).enterFrom;
                    if (str == null) {
                        str = "";
                    }
                    if (shortVideoContext == null) {
                        shortVideoContext = null;
                    }
                    String str2 = shortVideoContext.shootWay;
                    String str3 = str2 != null ? str2 : "";
                    C0LAB c0lab = new C0LAB();
                    ShortVideoContext shortVideoContext2 = this.LL.LL;
                    if (shortVideoContext2 == null) {
                        shortVideoContext2 = null;
                    }
                    c0lab.LJ("creation_id", shortVideoContext2.getCreationId());
                    c0lab.LJ("enter_from", str);
                    c0lab.LJ("shoot_way", str3);
                    ShortVideoContext shortVideoContext3 = this.LL.LL;
                    c0lab.LJ("is_photo_mode", (shortVideoContext3 != null ? shortVideoContext3 : null).LJJIJIL());
                    C20684815ws.LJIILLIIL("dismiss_mec_onboarding_popup", c0lab.LIZ);
                }
            };
            OpenDialogBoxUtil openDialogBoxUtil = new OpenDialogBoxUtil();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIJL(bundle, "LISTENER", onboardingButtonClickListener);
            openDialogBoxUtil.setArguments(bundle);
            C1391850mK7.LIZIZ(openDialogBoxUtil, "309");
            openDialogBoxUtil.show(activity.getSupportFragmentManager(), "onboarding_video");
        }
        this.LLILLJJLI.onNext(Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0sgp] */
    /* JADX WARN: Type inference failed for: r0v44, types: [X.0CnL] */
    public EffectTemplateCategoryFragment() {
        C0JEH c0jeh = new C0JEH();
        c0jeh.LIZ = false;
        this.LLJZ = new C21679919sz(new C0JEI(c0jeh.LIZ, c0jeh.LIZIZ), (AbstractC21673619ry<? extends RecyclerView.ViewHolder>[]) new AbstractC21673619ry[0]);
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 653));
        this.LLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 652));
        this.LLLF = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(328));
        this.LLLFF = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2187));
        this.LLLFZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 657));
        this.LLLI = new InterfaceC318360Cdu() { // from class: X.0CnL
            @Override // X.InterfaceC318360Cdu
            public final void onEvent(int i, int i2) {
                List<? extends AbstractC21673619ry<? extends RecyclerView.ViewHolder>> listLLLI = this.LIZ.LLJZ.LLLI();
                ArrayList<ICreateTabFillScreenAdapter> arrayList = new ArrayList();
                for (AbstractC21673619ry<? extends RecyclerView.ViewHolder> abstractC21673619ry : listLLLI) {
                    if (abstractC21673619ry instanceof ICreateTabFillScreenAdapter) {
                        arrayList.add(abstractC21673619ry);
                    }
                }
                for (ICreateTabFillScreenAdapter iCreateTabFillScreenAdapter : arrayList) {
                    Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("self_published_effect_cnt", String.valueOf(i2)), new Pair("self_draft_effect_cnt", String.valueOf(i)));
                    iCreateTabFillScreenAdapter.LLJJJIL(mapLJIIIIZZ);
                    C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("adapter = ");
                    sbLIZ.append(iCreateTabFillScreenAdapter);
                    sbLIZ.append(", setParams = ");
                    sbLIZ.append(mapLJIIIIZZ);
                    C201955140j.LJIILL(c20012313Rx, "EffectTemplateCategoryFragment", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        };
    }

    public final InterfaceC1628910sUT iS() {
        String key;
        StickerStatesStoreViewModel stickerStatesStoreViewModel = (StickerStatesStoreViewModel) C1659630tI1.LJII(getView(), null, 6).get(StickerStatesStoreViewModel.class);
        InterfaceC1624480sNK interfaceC1624480sNK = this.LLJILJILJ;
        if (interfaceC1624480sNK == null) {
            interfaceC1624480sNK = null;
        }
        InterfaceC1629300sV6 interfaceC1629300sV6LJI = interfaceC1624480sNK.getStickerRepository().LJI();
        EffectCategoryModel effectCategoryModelUR = UR();
        if (effectCategoryModelUR == null || (key = effectCategoryModelUR.getKey()) == null) {
            key = "";
        }
        return stickerStatesStoreViewModel.vQ2(interfaceC1629300sV6LJI, key, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC524950KiL interfaceC524950KiL = (InterfaceC524950KiL) this.LLJZIJLIL.getValue();
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.T4(this.LLJ);
        }
        C622680Oba.LIZLLL(this);
        C11JF c11jf = this.LLLFFI;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public final void NR(C0LAB c0lab) {
        ShortVideoContext shortVideoContext = this.LL;
        ShortVideoContext shortVideoContext2 = null;
        if (shortVideoContext == null) {
            shortVideoContext = null;
        }
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        ShortVideoContext shortVideoContext3 = this.LL;
        if (shortVideoContext3 == null) {
            shortVideoContext3 = null;
        }
        c0lab.LJ("shoot_way", shortVideoContext3.shootWay);
        ShortVideoContext shortVideoContext4 = this.LL;
        if (shortVideoContext4 != null) {
            shortVideoContext2 = shortVideoContext4;
        }
        c0lab.LJ("enter_from", shortVideoContext2.enterFrom);
    }

    public final C1636640sgw PR(FixedStickerListViewModel fixedStickerListViewModel) {
        C1630880sXe c1630880sXe;
        C1631250sYF c1631250sYF;
        C1631250sYF c1631250sYF2;
        InterfaceC1624480sNK interfaceC1624480sNK = this.LLJILJILJ;
        ShortVideoContext shortVideoContext = null;
        if (interfaceC1624480sNK == null) {
            interfaceC1624480sNK = null;
        }
        C1630880sXe c1630880sXe2 = this.LLJJ;
        if (c1630880sXe2 == null) {
            c1630880sXe = null;
        } else {
            c1630880sXe = c1630880sXe2;
        }
        InterfaceC1635560sfC interfaceC1635560sfC = c1630880sXe.LJ;
        if (c1630880sXe2 == null) {
            c1630880sXe2 = null;
        }
        C1636520sgk c1636520sgk = c1630880sXe2.LJFF;
        C1636520sgk c1636520sgk2 = new C1636520sgk(c1636520sgk.LIZ, c1636520sgk.LIZIZ, c1636520sgk.LIZJ, c1636520sgk.LIZLLL, c1636520sgk.LJ, c1636520sgk.LJFF, c1636520sgk.LJI, c1636520sgk.LJII, c1636520sgk.LJIIIIZZ, c1636520sgk.LJIIIZ, c1636520sgk.LJIIJ, c1636520sgk.LJIIJJI, c1636520sgk.LJIIL, true, c1636520sgk.LJIILJJIL, c1636520sgk.LJIILL, c1636520sgk.LJIILLIIL, c1636520sgk.LJIIZILJ, c1636520sgk.LJIJ, c1636520sgk.LJIJI, c1636520sgk.LJIJJ, c1636520sgk.LJIJJLI, c1636520sgk.LJIL, c1636520sgk.LJJ);
        C1631250sYF c1631250sYF3 = this.LLJILLL;
        if (c1631250sYF3 == null) {
            c1631250sYF = null;
        } else {
            c1631250sYF = c1631250sYF3;
        }
        InterfaceC1625970sPj interfaceC1625970sPj = c1631250sYF.LIZLLL;
        if (c1631250sYF3 == null) {
            c1631250sYF2 = null;
        } else {
            c1631250sYF2 = c1631250sYF3;
        }
        InterfaceC1636390sgX interfaceC1636390sgX = c1631250sYF2.LIZIZ;
        if (c1631250sYF3 == null) {
            c1631250sYF3 = null;
        }
        EffectCategoryModel effectCategoryModelUR = UR();
        int i = this.LLJILJIL;
        AwS653S0100000_4 awS653S0100000_4 = new AwS653S0100000_4(this, 22);
        ShortVideoContext shortVideoContext2 = this.LL;
        if (shortVideoContext2 != null) {
            shortVideoContext = shortVideoContext2;
        }
        return new C1636640sgw(interfaceC1624480sNK, interfaceC1635560sfC, fixedStickerListViewModel, c1636520sgk2, interfaceC1625970sPj, interfaceC1636390sgX, c1631250sYF3, effectCategoryModelUR, i, awS653S0100000_4, shortVideoContext, new AwS674S0100000_25(this, 50));
    }

    public final void RR(EnumC318740CeW enumC318740CeW) {
        ShortVideoContext shortVideoContext;
        ShortVideoContext shortVideoContext2;
        ShortVideoContext shortVideoContext3 = this.LL;
        if (shortVideoContext3 == null) {
            shortVideoContext = null;
        } else {
            shortVideoContext = shortVideoContext3;
        }
        String str = shortVideoContext.enterFrom;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (shortVideoContext3 == null) {
            shortVideoContext2 = null;
        } else {
            shortVideoContext2 = shortVideoContext3;
        }
        String str3 = shortVideoContext2.shootWay;
        if (str3 == null) {
            str3 = "";
        }
        Pair[] pairArr = new Pair[7];
        if (shortVideoContext3 == null) {
            shortVideoContext3 = null;
        }
        pairArr[0] = new Pair("creation_id", shortVideoContext3.getCreationId());
        pairArr[1] = new Pair("enter_from", str);
        ShortVideoContext shortVideoContext4 = this.LL;
        if (shortVideoContext4 == null) {
            shortVideoContext4 = null;
        }
        pairArr[2] = new Pair("is_photo_mode", shortVideoContext4.LJJIJIL());
        ShortVideoContext shortVideoContext5 = this.LL;
        if (shortVideoContext5 == null) {
            shortVideoContext5 = null;
        }
        String str4 = shortVideoContext5.shootWay;
        if (str4 != null) {
            str2 = str4;
        }
        pairArr[3] = new Pair("shoot_way", str2);
        ShortVideoContext shortVideoContext6 = this.LL;
        if (shortVideoContext6 == null) {
            shortVideoContext6 = null;
        }
        pairArr[4] = new Pair("shoot_tab_name", shortVideoContext6.LJIJJLI());
        InterfaceC1624480sNK interfaceC1624480sNK = this.LLJILJILJ;
        if (interfaceC1624480sNK == null) {
            interfaceC1624480sNK = null;
        }
        pairArr[5] = new Pair("tab_key", C1623660sM0.LIZ(interfaceC1624480sNK).getKey());
        pairArr[6] = new Pair("button_position", enumC318740CeW.getMobValue());
        C1737910vKH.LIZ("advanced_mobile_effect_create_entry_click", C2097608Jq.LJIIIIZZ(pairArr));
        C1737170vJ5 c1737170vJ5 = new C1737170vJ5();
        c1737170vJ5.LIZ = getContext();
        c1737170vJ5.LIZIZ = str;
        c1737170vJ5.LJFF = "shootpage_create";
        c1737170vJ5.LIZJ = str;
        c1737170vJ5.LIZLLL = str3;
        ShortVideoContext shortVideoContext7 = this.LL;
        if (shortVideoContext7 == null) {
            shortVideoContext7 = null;
        }
        c1737170vJ5.LJ = shortVideoContext7.getCreationId();
        c1737170vJ5.LJII = C1636550sgn.LJ(str, str3);
        ShortVideoContext shortVideoContext8 = this.LL;
        if (shortVideoContext8 == null) {
            shortVideoContext8 = null;
        }
        c1737170vJ5.LJIIJ = shortVideoContext8.LJJIJIL();
        InterfaceC1624480sNK interfaceC1624480sNK2 = this.LLJILJILJ;
        if (interfaceC1624480sNK2 == null) {
            interfaceC1624480sNK2 = null;
        }
        c1737170vJ5.LJIIJJI = C1623660sM0.LIZ(interfaceC1624480sNK2).getKey();
        ShortVideoContext shortVideoContext9 = this.LL;
        if (shortVideoContext9 == null) {
            shortVideoContext9 = null;
        }
        c1737170vJ5.LJIIL = shortVideoContext9.LJIJJLI();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C317340CcG(c1737170vJ5, null), 3);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockEffectEvent(C1630990sXp c1630990sXp) {
        if (aS().LLLI(c1630990sXp.LIZ) != -1) {
            C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS125S0100000_25(this, 59));
        }
    }

    @C14EU
    public final void onShareComplete(C1365870leD c1365870leD) {
        if (Intrinsics.LJFF("prop_panel_long_press", c1365870leD.LJFF) && getView() != null) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectTemplateCategoryFragment", "onShareComplete");
            C345120Dfy.LJ(this, c1365870leD);
        }
    }

    @Override // X.InterfaceC1625800sPS
    public final void qB(Effect effect) {
        LinearLayoutManager linearLayoutManager;
        C1636640sgw c1636640sgwAS = aS();
        int iLLLI = c1636640sgwAS.LLLI(effect);
        RecyclerView recyclerView = null;
        if (iLLLI <= 0) {
            InterfaceC1624480sNK interfaceC1624480sNK = this.LLJILJILJ;
            if (interfaceC1624480sNK == null) {
                interfaceC1624480sNK = null;
            }
            interfaceC1624480sNK.LJJJJI(new C1629220sUy(Collections.singletonList(effect), 2, 0, 56));
            if (bS().LLJJLIIIJLLLLLLLZ) {
                c1636640sgwAS.LLLLIL(1);
            }
            ListProtector.add(c1636640sgwAS.LLILZ, 0, new PinTemplateListEffectWrapper(effect));
            c1636640sgwAS.notifyItemInserted(1);
            bS().LLJJLIIIJLLLLLLLZ = true;
            bS().LLJJL = effect.getEffectId();
            int iLIZ = C336650DHr.LIZ(aS(), this.LLJZ);
            if (iLIZ != -1) {
                RecyclerView recyclerView2 = this.LLJJJ;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    linearLayoutManager.scrollToPositionWithOffset(iLIZ, 0);
                    return;
                }
                return;
            }
            return;
        }
        cS(iLLLI, -1, new PinTemplateListEffectWrapper(effect));
        RecyclerView recyclerView3 = this.LLJJJ;
        if (recyclerView3 != null) {
            recyclerView = recyclerView3;
        }
        ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(iLLLI, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(35)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        String effectId = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/gamora/recorder/sticker/templateeffect/effectpanel/EffectTemplateCategoryFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6S6ZpzBzjZpGDlHrqJcl8/bMDQ3M2ndhOojqF/U2wsfJ5w0ISzGdYKqVz4l6Lr82Pl1SPE2jWwjA7eIjpmhqwwsLVQrmdwlVI3SXQ==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (this.LLJJJ != null) {
            if (z) {
                gS();
                oS();
                if (C339680DTi.LIZ()) {
                    C0LAB c0lab = new C0LAB();
                    NR(c0lab);
                    c0lab.LJ("ame_enter_from", "shootpage_create");
                    ShortVideoContext shortVideoContext = this.LL;
                    if (shortVideoContext == null) {
                        shortVideoContext = null;
                    }
                    c0lab.LJ("is_photo_mode", shortVideoContext.LJJIJIL());
                    C1449260noi.LJ("ame_aigc_create_button_show", c0lab.LIZ);
                }
                TemplateEffectsViewModel templateEffectsViewModelBS = bS();
                Effect effect = this.LLJJJJ;
                if (effect != null) {
                    effectId = effect.getEffectId();
                }
                templateEffectsViewModelBS.EQ2(effectId);
            } else {
                OR();
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(EffectTemplateCategoryFragment.class);
        }
    }

    public final void hS(FixedStickerListViewModel fixedStickerListViewModel, C1636640sgw c1636640sgw) {
        fixedStickerListViewModel.kS0().observe(this, new AObserverS186S0200000_25(c1636640sgw, this, 7));
        InterfaceC1624480sNK interfaceC1624480sNK = this.LLJILJILJ;
        if (interfaceC1624480sNK == null) {
            interfaceC1624480sNK = null;
        }
        interfaceC1624480sNK.LJII().LIZ().observe(this, new AObserverS186S0200000_25(c1636640sgw, this, 8));
    }

    /* JADX WARN: Type inference failed for: r1v40, types: [X.0CeZ] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ShortVideoContext shortVideoContext;
        ShortVideoContext shortVideoContext2;
        MutableLiveData mutableLiveDataAG;
        final ViewGroup viewGroup;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (shortVideoContext = (ShortVideoContext) arguments.getParcelable("short_video_context")) != null) {
            this.LL = shortVideoContext;
            this.LLJJJ = (RecyclerView) view.findViewById(R.id.w6_);
            C1636150sg9 c1636150sg9 = new C1636150sg9(view.getContext(), C2097608Jq.LJIIIIZZ(new Pair(EnumC1641470soj.LOADING, new AwS604S0100000_25(this, 745)), new Pair(EnumC1641470soj.EMPTY, new AwS604S0100000_25(this, 748)), new Pair(EnumC1641470soj.ERROR, new AwS604S0100000_25(this, 749))), EnumC1641470soj.NONE);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            C786410Ut5.q7(c1636150sg9, layoutParams);
            ((ViewGroup) getView()).addView(c1636150sg9);
            this.LLJJLIIIJLLLLLLLZ = c1636150sg9;
            ViewGroup viewGroup2 = (ViewGroup) view;
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.fuy, viewGroup2, false);
            C786410Ut5.LJLLLLLL(8, viewTd);
            viewGroup2.addView(viewTd, 0);
            this.LLJJJIL = viewTd;
            if (C339680DTi.LIZ()) {
                C1636790shB.LIZIZ(viewGroup2, EnumC339730DTn.CREATE_BTN_WITH_AI, SR());
            } else {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C339710DTl(viewGroup2, this, null), 3);
            }
            final RecyclerView recyclerView = this.LLJJJ;
            if (recyclerView == null) {
                recyclerView = null;
            }
            C1630880sXe c1630880sXe = this.LLJJ;
            if (c1630880sXe == null) {
                c1630880sXe = null;
            }
            recyclerView.setItemViewCacheSize(c1630880sXe.LJFF.LIZIZ);
            C1630880sXe c1630880sXe2 = this.LLJJ;
            if (c1630880sXe2 == null) {
                c1630880sXe2 = null;
            }
            final boolean z = c1630880sXe2.LJFF.LJIIJ;
            recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0LJX
                public int LL;

                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                    if (z) {
                        if (i != 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    C1322200kVm.LIZ().LJIILLIIL();
                                }
                            } else if (this.LL == 2) {
                                C1322200kVm.LIZ().LJIILLIIL();
                            } else if (C1322200kVm.LIZ().LJIILL()) {
                                C1322200kVm.LIZ().LJIJJ();
                            }
                        } else if (C1322200kVm.LIZ().LJIILL()) {
                            C1322200kVm.LIZ().LJIJJ();
                        }
                    }
                    this.LL = i;
                }
            });
            final C118300cf c118300cf = new C118300cf();
            final C118300cf c118300cf2 = new C118300cf();
            c118300cf.element = 15;
            c118300cf2.element = 15;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 60);
            C1630880sXe c1630880sXe3 = this.LLJJ;
            if (c1630880sXe3 == null) {
                c1630880sXe3 = null;
            }
            if (c1630880sXe3.LJFF.LJIIZILJ) {
                gridLayoutManager.mRecycleChildrenOnDetach = true;
            }
            gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.0Dat
                @Override // X.AbstractC214823195h
                public final int LJFF(int i) {
                    Integer numValueOf;
                    AbstractC21673619ry adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        numValueOf = Integer.valueOf(adapter.getItemViewType(i));
                    } else {
                        numValueOf = null;
                    }
                    if (C13LQ.LJJIJIIJI(numValueOf, new Integer[]{Integer.valueOf(R.layout.c3f), Integer.valueOf(R.layout.c3h), 10086, Integer.valueOf(R.layout.c3g), Integer.valueOf(this.aS().getItemViewType(0)), Integer.valueOf(this.aS().getItemViewType(this.aS().getItemCount() - 1))}) >= 0) {
                        return 60;
                    }
                    if (numValueOf != null && numValueOf.intValue() == 1) {
                        if (C339670DTh.LIZ()) {
                            return 20;
                        }
                        return c118300cf.element;
                    }
                    EffectTemplateCategoryFragment effectTemplateCategoryFragment = this;
                    if (i >= 1) {
                        if (i < effectTemplateCategoryFragment.aS().getItemCount() + 1) {
                            return c118300cf.element;
                        }
                    } else {
                        effectTemplateCategoryFragment.getClass();
                    }
                    return c118300cf2.element;
                }
            };
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.addOnScrollListener(new AsS51S0100000_25(this, 6));
            recyclerView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1698110uI5(this, 1));
            final CreateTabBottomBtnViewModel createTabBottomBtnViewModelSR = SR();
            if (C1656550tD3.LIZ()) {
                recyclerView.addOnScrollListener(new C339520DSs(new InterfaceC339530DSt() { // from class: X.0CeZ
                    @Override // X.InterfaceC339530DSt
                    public final void LIZ(boolean z2) {
                        CreateTabBottomBtnViewModel createTabBottomBtnViewModel = createTabBottomBtnViewModelSR;
                        createTabBottomBtnViewModel.getClass();
                        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateRvAmeEntryShow(");
                        sbLIZ.append(z2);
                        sbLIZ.append(')');
                        C201955140j.LIZLLL(c20012313Rx, "CreateTabBottomBtnViewModel", C2188811AlT.LIZIZ(sbLIZ));
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(createTabBottomBtnViewModel), null, null, new C318750CeX(z2, createTabBottomBtnViewModel, null), 3);
                    }
                }));
            }
            recyclerView.addOnScrollListener(new AsS51S0100000_25(new AwS569S0100000_25(this, 1033), 7));
            if (C339670DTh.LIZ()) {
                recyclerView.addItemDecoration(new AbstractC340470DWj() { // from class: X.0DWl
                    @Override // X.AbstractC340470DWj
                    public final void LJ() {
                    }

                    @Override // X.AbstractC340470DWj
                    public final void LJFF() {
                    }
                });
            } else {
                recyclerView.addItemDecoration(new AbstractC340470DWj() { // from class: X.0DWk
                    @Override // X.AbstractC340470DWj
                    public final void LJ() {
                    }

                    @Override // X.AbstractC340470DWj
                    public final void LJFF() {
                    }
                });
            }
            C21679919sz c21679919sz = this.LLJZ;
            AbstractC21673619ry abstractC21673619ry = (AbstractC21673619ry) this.LLJLLL.getValue();
            if (abstractC21673619ry != null) {
                c21679919sz.LLLFZ(abstractC21673619ry);
            }
            c21679919sz.LLLFZ((AbstractC21673619ry) this.LLJLILLLLZIIL.getValue());
            c21679919sz.LLLFZ(aS());
            c21679919sz.LLLFZ((AbstractC21673619ry) this.LLJLIL.getValue());
            recyclerView.setAdapter(this.LLJZ);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ame_creationcenter_optimizationexperiment_phase1", true) && !C339680DTi.LIZ()) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bS()), null, null, new C339720DTm(this, null), 3);
            }
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            C201955140j.LIZLLL(c20012313Rx, "DiyProp", "EffectTemplateCategoryFragment onViewCreated");
            if (!this.LLJJIJIIJIL) {
                this.LLJJIJIIJIL = true;
                C201955140j.LIZLLL(c20012313Rx, "DiyProp", "setting up observer");
                bS().LLJIJIL.observe(this, new AObserverS227S0100000_25(this, 122));
                ZR().LLJIJIL.observe(this, new AObserverS227S0100000_25(this, 123));
                ZR().LLJJJJ.observe(this, new AObserverS227S0100000_25(this, 124));
                ZR().LLJJJJLIIL.observe(this, new AObserverS208S0100000_4(this, 9));
                hS(bS(), aS());
                hS(ZR(), WR());
                MyEffectsViewModel myEffectsViewModelZR = ZR();
                myEffectsViewModelZR.LLJLL.observe(this, new AObserverS169S0200000_4(this, myEffectsViewModelZR, 1));
                if (C0C03.LIZ()) {
                    View view2 = getView();
                    if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
                        final AwS593S0100000_14 awS593S0100000_14 = new AwS593S0100000_14(this, 305);
                        VR().LL.observe(this, new Observer() { // from class: X.0Xq4
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj) {
                                Integer num = (Integer) obj;
                                Integer numValueOf = Integer.valueOf(R.attr.zs);
                                RecyclerView recyclerView2 = null;
                                if (num != null) {
                                    if (num.intValue() == 3) {
                                        View view3 = this.LL.LLJJJIL;
                                        if (view3 == null) {
                                            view3 = null;
                                        }
                                        C786410Ut5.LJLLLLLL(0, view3);
                                        RecyclerView recyclerView3 = this.LL.LLJJJ;
                                        if (recyclerView3 != null) {
                                            recyclerView2 = recyclerView3;
                                        }
                                        C786410Ut5.LLIZLLLIL(recyclerView2, 8);
                                        EffectTemplateCategoryFragment effectTemplateCategoryFragment = this.LL;
                                        C0LAB c0lab = new C0LAB();
                                        effectTemplateCategoryFragment.NR(c0lab);
                                        C1449260noi.LJ("show_create_action_block", c0lab.LIZ);
                                        if (!this.LL.VR().LLILLJJLI.LIZ(3)) {
                                            this.LL.VR().LLILLJJLI.LIZLLL(num.intValue());
                                            C742460TAm.LIZ(this.LL.requireContext(), this.LL.requireContext().getString(2131837113), this.LL.requireContext().getString(2131837112), this.LL.requireContext().getString(2131837117), new AwS213S0300000_4((Function1) awS593S0100000_14, (Function1<? super Integer, Unit>) num, (Integer) this.LL, (EffectTemplateCategoryFragment) 22), 3, R.raw.icon_exclamation_mark_circle, numValueOf).LIZLLL();
                                            EffectTemplateCategoryFragment effectTemplateCategoryFragment2 = this.LL;
                                            C0LAB c0lab2 = new C0LAB();
                                            effectTemplateCategoryFragment2.NR(c0lab2);
                                            C1449260noi.LJ("show_creation_action_revoked_pop_up", c0lab2.LIZ);
                                            return;
                                        }
                                        return;
                                    }
                                    if (num == null) {
                                        return;
                                    }
                                    if (num.intValue() == 2) {
                                        EffectTemplateCategoryFragment effectTemplateCategoryFragment3 = this.LL;
                                        effectTemplateCategoryFragment3.MR(viewGroup, effectTemplateCategoryFragment3.requireContext().getString(2131837116), null);
                                        EffectTemplateCategoryFragment effectTemplateCategoryFragment4 = this.LL;
                                        C0LAB c0lab3 = new C0LAB();
                                        effectTemplateCategoryFragment4.NR(c0lab3);
                                        C1449260noi.LJ("show_follow_guidelines_banner", c0lab3.LIZ);
                                        if (this.LL.VR().LLILLJJLI.LIZ(2)) {
                                            return;
                                        }
                                        this.LL.VR().LLILLJJLI.LIZLLL(num.intValue());
                                        C742460TAm.LIZ(this.LL.requireContext(), this.LL.requireContext().getString(2131837111), this.LL.requireContext().getString(2131837110), this.LL.requireContext().getString(2131837117), new AwS213S0300000_4((Function1) awS593S0100000_14, (Function1<? super Integer, Unit>) num, (Integer) this.LL, (EffectTemplateCategoryFragment) 23), 2, R.raw.icon_exclamation_mark_triangle, numValueOf).LIZLLL();
                                        EffectTemplateCategoryFragment effectTemplateCategoryFragment5 = this.LL;
                                        C0LAB c0lab4 = new C0LAB();
                                        effectTemplateCategoryFragment5.NR(c0lab4);
                                        C1449260noi.LJ("show_avoid_losing_access_popup", c0lab4.LIZ);
                                        return;
                                    }
                                    if (num.intValue() != 1 || this.LL.VR().LLILLJJLI.LIZIZ() != 3) {
                                        return;
                                    }
                                    EffectTemplateCategoryFragment effectTemplateCategoryFragment6 = this.LL;
                                    effectTemplateCategoryFragment6.MR(viewGroup, effectTemplateCategoryFragment6.requireContext().getString(2131837116), new AwS415S0200000_14(this.LL, num, 110));
                                    if (this.LL.VR().LLILLJJLI.LIZ(990)) {
                                        return;
                                    }
                                    C742460TAm.LIZ(this.LL.requireContext(), this.LL.requireContext().getString(2131821843), this.LL.requireContext().getString(2131821842), this.LL.requireContext().getString(2131837117), new AwS593S0100000_14(this.LL, 304), 1, R.raw.icon_file_tick, null).LIZLLL();
                                    EffectTemplateCategoryFragment effectTemplateCategoryFragment7 = this.LL;
                                    C0LAB c0lab5 = new C0LAB();
                                    effectTemplateCategoryFragment7.NR(c0lab5);
                                    C1449260noi.LJ("show_access_regained_pop_up", c0lab5.LIZ);
                                }
                            }
                        });
                    }
                }
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C318670CeP(this, null), 3);
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C318650CeN(this, null), 3);
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C318690CeR(this, null), 3);
                InterfaceC1623190sLF interfaceC1623190sLF = this.LLILZ;
                if (interfaceC1623190sLF != null && (mutableLiveDataAG = interfaceC1623190sLF.AG()) != null) {
                    mutableLiveDataAG.observe(this, new AObserverS208S0100000_4(this, 10));
                }
                TemplateEffectsViewModel templateEffectsViewModelBS = bS();
                templateEffectsViewModelBS.LLJJJJLIIL.observe(this, new AObserverS169S0200000_4(this, templateEffectsViewModelBS, 2));
            }
            if (C0C03.LIZ()) {
                C1631250sYF c1631250sYF = this.LLJILLL;
                if (c1631250sYF == null) {
                    c1631250sYF = null;
                }
                C11NZ<Pair<Integer, Integer>> c11nz = c1631250sYF.LJII;
                if (c11nz != null) {
                    this.LLLFFI = (C11JF) c11nz.LJJLJLI(new AfS183S0100000_14(this, 3));
                }
            }
            ShortVideoContext shortVideoContext3 = this.LL;
            if (shortVideoContext3 == null) {
                shortVideoContext2 = null;
            } else {
                shortVideoContext2 = shortVideoContext3;
            }
            String str = shortVideoContext2.mUnpublishedEffectId;
            if (shortVideoContext3 == null) {
                shortVideoContext3 = null;
            }
            dS(this, str, shortVideoContext3.mSavedDraftId, false, 4);
            InterfaceC524950KiL interfaceC524950KiL = (InterfaceC524950KiL) this.LLJZIJLIL.getValue();
            if (interfaceC524950KiL != null) {
                interfaceC524950KiL.Qh(this.LLJ);
            }
            C622680Oba.LIZJ(this);
            if (getUserVisibleHint()) {
                HandlerHook.viewPost(view, new ARunnableS114S0100000_14(this, 41));
            }
            if (C1656550tD3.LIZIZ()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1637160shm(this, null), 3);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void MR(ViewGroup viewGroup, String str, Function0<Unit> function0) {
        if (VR().vQ2() && this.LLIZLLLIL == null) {
            C0LAB c0lab = new C0LAB();
            NR(c0lab);
            C1449260noi.LJ("show_follow_guidelines_banner", c0lab.LIZ);
            Context contextRequireContext = requireContext();
            AwS380S0200000_14 awS380S0200000_14 = new AwS380S0200000_14(this, (EffectTemplateCategoryFragment) function0, (Function0<Unit>) 74);
            ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Sd(R.layout.fux, C786410Ut5.ne(contextRequireContext), viewGroup).findViewById(R.id.f679bsj);
            View viewFindViewById = viewGroup2.findViewById(R.id.fy2);
            TextView textView = (TextView) viewGroup2.findViewById(R.id.bsc);
            C786410Ut5.I7(new ACListenerS117S0200000_14(awS380S0200000_14, viewGroup2, 16), viewFindViewById);
            C786410Ut5.K7(viewGroup2, new ACListenerS138S0100000_3(contextRequireContext, 15));
            textView.setText(str);
            this.LLIZLLLIL = viewGroup2;
            this.LLJZ.LL.LIZ(0, new C7967039h());
            RecyclerView recyclerView = this.LLJJJ;
            RecyclerView recyclerView2 = null;
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView.setItemAnimator(null);
            RecyclerView recyclerView3 = this.LLJJJ;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            recyclerView3.invalidateItemDecorations();
            RecyclerView recyclerView4 = this.LLJJJ;
            if (recyclerView4 != null) {
                recyclerView2 = recyclerView4;
            }
            recyclerView2.scrollToPosition(0);
        }
    }

    public final void cS(int i, int i2, Effect effect) {
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC1624480sNK interfaceC1624480sNK = this.LLJILJILJ;
        C1630880sXe c1630880sXe = null;
        RecyclerView recyclerView = null;
        if (interfaceC1624480sNK == null) {
            interfaceC1624480sNK = null;
        }
        if (C1656550tD3.LIZ() && C1625940sPg.LJIIL(interfaceC1624480sNK, effect) && C342540Dbo.LIZIZ(interfaceC1624480sNK.LLILIL())) {
            z = true;
        } else {
            z = false;
        }
        if (C1625940sPg.LJIIL(interfaceC1624480sNK, effect) && C318390Cdx.LIZJ(interfaceC1624480sNK.LLILIL())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            if (i2 >= 0 && i2 < 12) {
                mS();
                return;
            }
            RecyclerView recyclerView2 = this.LLJJJ;
            if (recyclerView2 != null) {
                recyclerView = recyclerView2;
            }
            recyclerView.scrollToPosition(i);
            return;
        }
        if (i2 >= 0 && i2 < 12) {
            mS();
        } else {
            RecyclerView recyclerView3 = this.LLJJJ;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            recyclerView3.scrollToPosition(i);
        }
        InterfaceC1624480sNK interfaceC1624480sNK2 = this.LLJILJILJ;
        if (interfaceC1624480sNK2 == null) {
            interfaceC1624480sNK2 = null;
        }
        if (C1625940sPg.LJIIL(interfaceC1624480sNK2, effect) && (effect instanceof DraftEffect)) {
            C1630880sXe c1630880sXe2 = this.LLJJ;
            if (c1630880sXe2 != null) {
                c1630880sXe = c1630880sXe2;
            }
            c1630880sXe.LIZIZ.LIZJ(new C1625460sOu(i, null, EnumC1448980noG.UI_CLICK, effect, true));
        }
        ZR().ax0(new C1629840sVy<>(effect, i, this.LLJILJIL, false, false, null, null, null, null, 1016));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fv7, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public final void nS(int i, C1630880sXe c1630880sXe, C1631250sYF c1631250sYF, RecyclerView.RecycledViewPool recycledViewPool) {
        this.LLJILJIL = i;
        this.LLJILJILJ = c1630880sXe.LIZ;
        this.LLJJ = c1630880sXe;
        this.LLJILLL = c1631250sYF;
    }

    public static void dS(EffectTemplateCategoryFragment effectTemplateCategoryFragment, String str, String str2, boolean z, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        effectTemplateCategoryFragment.getClass();
        boolean zLJI = MethodIDManager.LJI(202430);
        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetching sticker data, jumpEffectId=");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c20012313Rx, "DiyProp", C2188811AlT.LIZIZ(sbLIZ));
        if (C1656550tD3.LIZ()) {
            TemplateEffectsViewModel templateEffectsViewModelBS = effectTemplateCategoryFragment.bS();
            templateEffectsViewModelBS.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(templateEffectsViewModelBS), null, null, new C339660DTg(templateEffectsViewModelBS, null), 3);
        } else {
            effectTemplateCategoryFragment.LLJJIJIL = false;
            TemplateEffectsViewModel templateEffectsViewModelBS2 = effectTemplateCategoryFragment.bS();
            templateEffectsViewModelBS2.getClass();
            templateEffectsViewModelBS2.CQ2(C1641640sp0.LIZJ(new ArrayList()));
        }
        if (!z) {
            MyEffectsViewModel myEffectsViewModelZR = effectTemplateCategoryFragment.ZR();
            myEffectsViewModelZR.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(myEffectsViewModelZR), null, null, new C318240Cdi(myEffectsViewModelZR, str, str2, null), 3);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
