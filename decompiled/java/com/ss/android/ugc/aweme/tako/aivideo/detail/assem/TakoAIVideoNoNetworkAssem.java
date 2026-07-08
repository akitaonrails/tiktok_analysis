package com.ss.android.ugc.aweme.tako.aivideo.detail.assem;

import X.AbstractC738140SxQ;
import X.C09R3;
import X.C0HTI;
import X.C0QSJ;
import X.C0XF1;
import X.C1220000hqw;
import X.C1327605Hm;
import X.C13LE;
import X.C1519805xE;
import X.C197039127h;
import X.C1BNE;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C687700QyG;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1519705xD;
import X.InterfaceC1682240tsU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.tako.aivideo.detail.ability.TakoAIVideoOverlayAbility;
import com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoFeedViewModel;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import com.zhiliaoapp.musically.R;
import irm.AkS50S0200000_2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoAIVideoNoNetworkAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C2252321DDq LLJJI;
    public final C2252321DDq LLJJIII;
    public final C736950SvV LLJJIJI;
    public volatile InterfaceC1682240tsU LLJJIJIIJIL;
    public volatile TakoAIVideoOverlayAbility LLJJIJIL;
    public InterfaceC665370Q7z LLJJJ;
    public C0QSJ LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoAIVideoNoNetworkAssem.class, "hostAbility", "getHostAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/ability/TakoAIVideoHostAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoAIVideoNoNetworkAssem.class, "overlayAbility", "getOverlayAbility()Lcom/ss/android/ugc/aweme/tako/aivideo/detail/ability/TakoAIVideoOverlayAbility;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fjw;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoAIVideoDetailScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TakoAIVideoDetailScope.class);
        return arrayList;
    }

    public final C0QSJ hp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJ;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJJ = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{TakoAIVideoDetailScope.class});
        this.LLJJJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final TakoAIVideoOverlayAbility ip() {
        TakoAIVideoOverlayAbility takoAIVideoOverlayAbility;
        TakoAIVideoOverlayAbility takoAIVideoOverlayAbility2 = this.LLJJIJIL;
        if (takoAIVideoOverlayAbility2 == null) {
            synchronized (this) {
                takoAIVideoOverlayAbility2 = this.LLJJIJIL;
                if (takoAIVideoOverlayAbility2 == null) {
                    C0QSJ c0qsjHp = hp();
                    if (c0qsjHp != null) {
                        takoAIVideoOverlayAbility = (TakoAIVideoOverlayAbility) c0qsjHp.getAbility(TakoAIVideoOverlayAbility.class);
                        C687700QyG.LJ(takoAIVideoOverlayAbility, TakoAIVideoOverlayAbility.class);
                    } else {
                        takoAIVideoOverlayAbility = null;
                    }
                    this.LLJJIJIL = takoAIVideoOverlayAbility;
                    return takoAIVideoOverlayAbility;
                }
            }
        }
        return takoAIVideoOverlayAbility2;
    }

    public TakoAIVideoNoNetworkAssem() {
        Boolean bool = Boolean.FALSE;
        this.LLJJI = C1BNE.LIZ(bool);
        this.LLJJIII = C1BNE.LIZ(bool);
        AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(685);
        this.LLJJIJI = new C736950SvV(C13LE.LIZ(TakoAIVideoFeedViewModel.class), aFwS187S0000000_2, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS229S0000000_2.get$arr$(511), new AwS546S0100000_2((AbstractC738140SxQ) this, 839), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        View viewFindViewById;
        int iIndexOfChild;
        super.onViewCreated(view);
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null && (viewFindViewById = viewGroup.findViewById(R.id.ija)) != null && (iIndexOfChild = viewGroup.indexOfChild(viewFindViewById)) >= 0 && viewGroup.indexOfChild(view) != iIndexOfChild) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
            viewGroup.addView(view, iIndexOfChild);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.x46);
        if (appCompatImageView != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nl;
            appCompatImageView.setImageDrawable(c0hti.LIZ(appCompatImageView.getContext()));
        }
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.x47);
        if (c197039127h != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
            C786410Ut5.I7(new AkS50S0200000_2(this, view, 0), c197039127h);
        }
        C2252321DDq c2252321DDq = this.LLJJI;
        C1519805xE c1519805xE = InterfaceC1519705xD.LIZ;
        Context context = view.getContext();
        c1519805xE.getClass();
        c2252321DDq.setValue(Boolean.valueOf(!C0XF1.LIZLLL(context)));
        C736680Sv4.LJIIIIZZ(this, this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.06Wd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C326490Cr1) obj).LL;
            }
        }, null, new AwS616S0100000_2(this, 64), 6);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1327605Hm(this, null), 3);
    }
}
