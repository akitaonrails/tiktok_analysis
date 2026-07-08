package com.ss.android.ugc.gamora.editorpro.components.asyncedit;

import X.C0E47;
import X.C0LAB;
import X.C1388190mED;
import X.C1397510mTF;
import X.C19MB;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23250099c;
import X.C362580EJk;
import X.C362590EJl;
import X.C377250Eqh;
import X.C377260Eqi;
import X.C377380Equ;
import X.C383720F2s;
import X.C418440Gaw;
import X.C425240Glu;
import X.C563650M8t;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC357140DzM;
import X.InterfaceC383740F2u;
import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class AsyncTasksPanelFragment extends TTResourcePanelFragment<AsyncTasksPanelViewModel> implements InterfaceC383740F2u {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyohOSHELIOSA9LSs4OmEyOzwiKio3ITFiCDwqJiYYKDw4OxUtJyo/DjctLiI2JjE=";
    public ConstraintLayout LLLFZ;
    public TuxTextView LLLI;
    public TuxIconView LLLII;
    public C425240Glu LLLIIII;
    public int LLLIIL;
    public int LLLIILIL;
    public Pair<String, C1397510mTF> LLLIL;
    public final boolean LLLFFI = true;
    public final C383720F2s LLLIIIIL = new C383720F2s(this);
    public final C362580EJk LLLIIIL = new C362580EJk(Integer.valueOf(R.id.gcw));

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void PS(EnumC357140DzM enumC357140DzM) {
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int RR() {
        return R.layout.bgb;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String qS() {
        return "async_tasks";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void GS() {
        jT("click_blank");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r1 == null) goto L8;
     */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.lifecycle.ViewModel QS() {
        /*
            r2 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0EPt> r0 = X.C364210EPr.LIZ
            java.lang.Class<com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel> r1 = com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel.class
            X.0E48 r0 = r2.LL
            androidx.lifecycle.ViewModel r1 = X.C364210EPr.LIZLLL(r1)
            com.ss.ugc.android.editor.core.vm.BaseViewModel r1 = (com.ss.ugc.android.editor.core.vm.BaseViewModel) r1
            if (r0 == 0) goto L13
            if (r1 == 0) goto L15
            r1.editorContext = r0
        L12:
            return r1
        L13:
            if (r1 != 0) goto L12
        L15:
            com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel r1 = new com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel
            r1.<init>()
            X.0E48 r0 = r2.LL
            r1.editorContext = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTasksPanelFragment.QS():androidx.lifecycle.ViewModel");
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final boolean uS() {
        return this.LLLFFI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e  */
    @Override // X.InterfaceC383740F2u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Re(X.C377380Equ r18) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTasksPanelFragment.Re(X.0Equ):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC383740F2u
    public final void Tg(C377380Equ c377380Equ) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemRetryClick: ");
        sbLIZ.append(c377380Equ.LIZ);
        C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
        AsyncTasksPanelViewModel asyncTasksPanelViewModel = (AsyncTasksPanelViewModel) wS();
        asyncTasksPanelViewModel.getClass();
        asyncTasksPanelViewModel.CQ2(c377380Equ.LIZIZ, c377380Equ.LIZ);
        asyncTasksPanelViewModel.LLJJIJIL.setValue(c377380Equ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC383740F2u
    public final void dC(C377380Equ c377380Equ) {
        AsyncTasksPanelViewModel asyncTasksPanelViewModel = (AsyncTasksPanelViewModel) wS();
        asyncTasksPanelViewModel.getClass();
        GS();
        asyncTasksPanelViewModel.LLJJJ.postValue(c377380Equ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void jT(String str) {
        C377260Eqi c377260EqiZQ2 = ((AsyncTasksPanelViewModel) wS()).zQ2();
        List<String> list = ((AsyncTasksPanelViewModel) wS()).LL;
        c377260EqiZQ2.getClass();
        C0LAB c0labLIZIZ = C377260Eqi.LIZIZ(C377260Eqi.LJ(), c377260EqiZQ2.LIZ, list);
        if (c0labLIZIZ != null) {
            c0labLIZIZ.LJ("exit_method", str);
            C20684815ws.LJIILLIIL("exit_ep_async_process_page", c0labLIZIZ.LIZ);
        }
        if (((AsyncTasksPanelViewModel) wS()).LLJJI == null) {
            NR();
            return;
        }
        AsyncTasksPanelViewModel asyncTasksPanelViewModel = (AsyncTasksPanelViewModel) wS();
        C362580EJk c362580EJk = this.LLLIIIL;
        asyncTasksPanelViewModel.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(asyncTasksPanelViewModel), null, null, new C362590EJl(this, asyncTasksPanelViewModel, c362580EJk, null), 3);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C0E47.LIZ()) {
            zS();
            eT();
            this.LLLFZ = (ConstraintLayout) view.findViewById(R.id.b_1);
            this.LLLI = (TuxTextView) view.findViewById(R.id.q2m);
            this.LLLII = (TuxIconView) view.findViewById(R.id.e1v);
            C425240Glu c425240Glu = (C425240Glu) view.findViewById(R.id.tv6);
            this.LLLIIII = c425240Glu;
            if (c425240Glu != null) {
                c425240Glu.setAdapter(this.LLLIIIIL);
                c425240Glu.setLayoutManager(new LinearLayoutManager(c425240Glu.getContext(), 1, false));
            }
            ConstraintLayout constraintLayout = this.LLLFZ;
            if (constraintLayout != null) {
                int iSS = sS() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53));
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                c19mb.LJIIL(R.id.tv6, iSS);
                c19mb.LIZIZ(constraintLayout);
            }
            Context context = getContext();
            if (context != null) {
                this.LLLIIIL.LIZIZ = C1388190mED.LIZIZ(context);
            }
            TuxIconView tuxIconView = this.LLLII;
            if (tuxIconView != null) {
                C786410Ut5.a9(tuxIconView, new ACListenerS140S0100000_5(this, 81));
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C377250Eqh(this, null), 3);
        }
    }
}
