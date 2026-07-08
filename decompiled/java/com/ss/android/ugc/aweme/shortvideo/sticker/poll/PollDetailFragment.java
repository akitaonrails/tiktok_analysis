package com.ss.android.ugc.aweme.shortvideo.sticker.poll;

import X.AbstractC683560Qra;
import X.C098200Yq;
import X.C0P6P;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C1893080zMY;
import X.C1908090zkl;
import X.C19632311rV;
import X.C19632611rY;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC1212360hec;
import X.InterfaceC19632811ra;
import Y.ACListenerS108S0200000_4;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS394S0200000_28;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes30.dex */
public final class PollDetailFragment extends AmeBaseFragment implements C0P6P, InterfaceC1212360hec<User> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCHELIOSB9OzElKiQ2Oms8JiM/ZhUjJSMXLTEtICMVOiQrJCo9PA==";
    public PollStruct LL;
    public int LLILLJJLI;
    public View LLILLL;
    public RecyclerView LLILZ;
    public C1749280vcc LLILZIL;
    public C1908090zkl LLILZLL;
    public C19632311rV LLIZ;
    public InterfaceC19632811ra LLIZLLLIL;

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<User> list, boolean z) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void zK() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    @Override // X.C0P6P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.sticker.data.PollStruct r0 = r9.LL
            if (r0 != 0) goto L7
            r9.Ng1()
        L7:
            X.11rV r2 = r9.LLIZ
            if (r2 == 0) goto L4c
            com.ss.android.ugc.aweme.sticker.data.PollStruct r0 = r9.LL
            long r4 = r0.getPollId()
            int r0 = r9.LLILLJJLI
            if (r0 != 0) goto L4d
            com.ss.android.ugc.aweme.sticker.data.PollStruct r0 = r9.LL
            java.util.List r1 = r0.getOptions()
            if (r1 == 0) goto L63
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.ss.android.ugc.aweme.sticker.data.PollStruct$OptionsBean r0 = (com.ss.android.ugc.aweme.sticker.data.PollStruct.OptionsBean) r0
            if (r0 == 0) goto L63
            long r6 = r0.getOptionId()
        L2a:
            X.11rX r3 = r2.LIZLLL
            X.11rc r0 = r2.LJFF
            int r8 = r0.LIZ
            X.11NZ r1 = r3.LIZ(r4, r6, r8)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r1 = r1.LJJJLZIJ(r0)
            X.11rW r0 = new X.11rW
            r0.<init>()
            r1.LIZIZ(r0)
        L4c:
            return
        L4d:
            com.ss.android.ugc.aweme.sticker.data.PollStruct r0 = r9.LL
            java.util.List r1 = r0.getOptions()
            if (r1 == 0) goto L63
            r0 = 1
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.ss.android.ugc.aweme.sticker.data.PollStruct$OptionsBean r0 = (com.ss.android.ugc.aweme.sticker.data.PollStruct.OptionsBean) r0
            if (r0 == 0) goto L63
            long r6 = r0.getOptionId()
            goto L2a
        L63:
            r6 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.poll.PollDetailFragment.LJJIFFI():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MR() {
        /*
            r10 = this;
            X.11rV r3 = r10.LLIZ
            if (r3 == 0) goto L43
            com.ss.android.ugc.aweme.sticker.data.PollStruct r0 = r10.LL
            long r5 = r0.getPollId()
            int r0 = r10.LLILLJJLI
            if (r0 != 0) goto L44
            com.ss.android.ugc.aweme.sticker.data.PollStruct r0 = r10.LL
            java.util.List r1 = r0.getOptions()
            if (r1 == 0) goto L5a
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.ss.android.ugc.aweme.sticker.data.PollStruct$OptionsBean r0 = (com.ss.android.ugc.aweme.sticker.data.PollStruct.OptionsBean) r0
            if (r0 == 0) goto L5a
            long r7 = r0.getOptionId()
        L23:
            X.11rX r4 = r3.LIZLLL
            r9 = 0
            X.11NZ r1 = r4.LIZ(r5, r7, r9)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r2 = r1.LJJJLZIJ(r0)
            X.12Yr r1 = new X.12Yr
            r0 = 3
            r1.<init>(r3, r0)
            r2.LIZIZ(r1)
        L43:
            return
        L44:
            com.ss.android.ugc.aweme.sticker.data.PollStruct r0 = r10.LL
            java.util.List r1 = r0.getOptions()
            if (r1 == 0) goto L5a
            r0 = 1
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.ss.android.ugc.aweme.sticker.data.PollStruct$OptionsBean r0 = (com.ss.android.ugc.aweme.sticker.data.PollStruct.OptionsBean) r0
            if (r0 == 0) goto L5a
            long r7 = r0.getOptionId()
            goto L23
        L5a:
            r7 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.poll.PollDetailFragment.MR():void");
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
        if (isViewValid()) {
            C1749280vcc c1749280vcc = this.LLILZIL;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
            C1749280vcc c1749280vcc2 = this.LLILZIL;
            if (c1749280vcc2 != null) {
                c1749280vcc2.LJ();
            }
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
        if (isViewValid()) {
            C1749280vcc c1749280vcc = this.LLILZIL;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
            C1749280vcc c1749280vcc2 = this.LLILZIL;
            if (c1749280vcc2 != null) {
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                c1722300uv6.LJIIIIZZ = getString(2131858396);
                c1749280vcc2.setStatus(c1722300uv6);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C19632311rV c19632311rV = this.LLIZ;
        if (c19632311rV != null) {
            c19632311rV.LJ.dispose();
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        C1908090zkl c1908090zkl;
        if (isViewValid() && (c1908090zkl = this.LLILZLL) != null) {
            c1908090zkl.showLoadMoreLoading();
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        C1749280vcc c1749280vcc;
        if (isViewValid() && (c1749280vcc = this.LLILZIL) != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LJI(c1722300uv6, c1749280vcc.getContext(), new C19632611rY(this));
            c1749280vcc.setStatus(c1722300uv6);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        C1908090zkl c1908090zkl;
        if (isViewValid() && (c1908090zkl = this.LLILZLL) != null) {
            c1908090zkl.showLoadMoreError();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("key_state");
        } else {
            i = 0;
        }
        this.LLILLJJLI = i;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("key_poll");
        } else {
            serializable = null;
        }
        this.LL = (PollStruct) serializable;
        this.LLIZ = new C19632311rV(this, this.LLIZLLLIL, this.LLILLJJLI);
    }

    @Override // X.InterfaceC1212360hec
    public final void LLJJJIL(List<User> list, boolean z) {
        if (!isViewValid()) {
            return;
        }
        if (!z) {
            C1908090zkl c1908090zkl = this.LLILZLL;
            if (c1908090zkl != null) {
                c1908090zkl.showLoadMoreEmpty();
            }
        } else {
            C1908090zkl c1908090zkl2 = this.LLILZLL;
            if (c1908090zkl2 != null) {
                c1908090zkl2.resetLoadMoreState();
            }
        }
        C1749280vcc c1749280vcc = this.LLILZIL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        C1908090zkl c1908090zkl3 = this.LLILZLL;
        if (c1908090zkl3 != null) {
            c1908090zkl3.setData(list);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<User> list, boolean z) {
        List arrayList;
        if (!isViewValid()) {
            return;
        }
        C1908090zkl c1908090zkl = this.LLILZLL;
        if (c1908090zkl != null) {
            c1908090zkl.setShowFooter(false);
        }
        if (!z) {
            C1908090zkl c1908090zkl2 = this.LLILZLL;
            if (c1908090zkl2 != null) {
                c1908090zkl2.showLoadMoreEmpty();
            }
        } else {
            C1908090zkl c1908090zkl3 = this.LLILZLL;
            if (c1908090zkl3 != null) {
                c1908090zkl3.resetLoadMoreState();
            }
        }
        C1908090zkl c1908090zkl4 = this.LLILZLL;
        if (c1908090zkl4 == null || (arrayList = c1908090zkl4.getData()) == null) {
            arrayList = new ArrayList();
        }
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
            C1908090zkl c1908090zkl5 = this.LLILZLL;
            if (c1908090zkl5 != null) {
                c1908090zkl5.setDataAfterLoadMore(arrayList);
            }
        }
        C1908090zkl c1908090zkl6 = this.LLILZLL;
        if (c1908090zkl6 != null) {
            c1908090zkl6.setShowFooter(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (X.C086I.LIZIZ(r4) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        if (X.C086I.LIZIZ(r4) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0068, code lost:
    
        LJ();
        r2 = r5.LLILZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006d, code lost:
    
        if (r2 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006f, code lost:
    
        com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, new Y.ARunnableS62S0300000_29(r5, r3, r4, 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0078, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return;
     */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            super.onViewCreated(r6, r7)
            int r2 = r5.LLILLJJLI
            r0 = 1
            r1 = 0
            if (r2 != 0) goto L39
            X.11ra r0 = r5.LLIZLLLIL
            if (r0 == 0) goto L17
            X.11rZ r0 = r0.LJ()
            if (r0 == 0) goto L17
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r4 = r0.LIZ
            if (r4 != 0) goto L1c
        L17:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1c:
            X.11ra r0 = r5.LLIZLLLIL
            if (r0 == 0) goto L2a
            X.11rZ r0 = r0.LJ()
            if (r0 == 0) goto L2a
            X.11rc r3 = r0.LIZIZ
            if (r3 != 0) goto L2f
        L2a:
            X.11rc r3 = new X.11rc
            r3.<init>(r1, r1)
        L2f:
            boolean r0 = X.C086I.LIZIZ(r4)
            if (r0 == 0) goto L68
        L35:
            r5.MR()
        L38:
            return
        L39:
            if (r2 != r0) goto L35
            X.11ra r0 = r5.LLIZLLLIL
            if (r0 == 0) goto L49
            X.11rZ r0 = r0.LJ()
            if (r0 == 0) goto L49
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r4 = r0.LIZJ
            if (r4 != 0) goto L4e
        L49:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L4e:
            X.11ra r0 = r5.LLIZLLLIL
            if (r0 == 0) goto L5c
            X.11rZ r0 = r0.LJ()
            if (r0 == 0) goto L5c
            X.11rc r3 = r0.LIZLLL
            if (r3 != 0) goto L61
        L5c:
            X.11rc r3 = new X.11rc
            r3.<init>(r1, r1)
        L61:
            boolean r0 = X.C086I.LIZIZ(r4)
            if (r0 == 0) goto L68
            goto L35
        L68:
            r5.LJ()
            androidx.recyclerview.widget.RecyclerView r2 = r5.LLILZ
            if (r2 == 0) goto L38
            Y.ARunnableS62S0300000_29 r1 = new Y.ARunnableS62S0300000_29
            r0 = 4
            r1.<init>(r5, r3, r4, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.poll.PollDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0QrV, X.0zkl] */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1749280vcc c1749280vcc;
        RecyclerView recyclerView;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i_v, viewGroup, false);
        this.LLILLL = viewTd;
        C19GS c19gs = null;
        if (viewTd != null) {
            c1749280vcc = (C1749280vcc) viewTd.findViewById(R.id.w28);
        } else {
            c1749280vcc = null;
        }
        this.LLILZIL = c1749280vcc;
        if (viewTd != null) {
            recyclerView = (RecyclerView) viewTd.findViewById(R.id.t0z);
        } else {
            recyclerView = null;
        }
        this.LLILZ = recyclerView;
        ?? r0 = new AbstractC683560Qra<User>() { // from class: X.0zkl
            @Override // X.AbstractC683560Qra
            public final RecyclerView.ViewHolder LLLI(ViewGroup viewGroup2) {
                return new C1908100zkm(C786410Ut5.Td(C786410Ut5.ne(viewGroup2.getContext()), R.layout.iau, viewGroup2, false));
            }

            @Override // X.AbstractC683560Qra
            public final void LLLFZ(RecyclerView.ViewHolder viewHolder, int i) {
                String nickname;
                String strLIZIZ;
                List<User> data = getData();
                if (data == null) {
                    return;
                }
                C1908100zkm c1908100zkm = (C1908100zkm) viewHolder;
                User user = (User) ListProtector.get(data, i);
                C1324840ka2.LJFF(c1908100zkm.LL, user.getAvatarMedium());
                TextView textView = c1908100zkm.LLILLJJLI;
                if (!TextUtils.isEmpty(user.getRemarkName())) {
                    nickname = user.getRemarkName();
                } else if (!C2222691Bz1.LJIIIIZZ()) {
                    if (TextUtils.isEmpty(user.getUniqueId())) {
                        nickname = user.getShortId();
                    } else {
                        nickname = user.getUniqueId();
                    }
                } else {
                    nickname = user.getNickname();
                }
                if (TextUtils.isEmpty(nickname)) {
                    strLIZIZ = "";
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(e3.g);
                    sbLIZ.append(nickname);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                textView.setText(strLIZIZ);
                C786410Ut5.D9(c1908100zkm.LL, new ACListenerS108S0200000_4(user, c1908100zkm, 9));
                C786410Ut5.T7(c1908100zkm.LLILLJJLI, new ACListenerS108S0200000_4(user, c1908100zkm, 10));
                c1908100zkm.LLILZIL = Collections.singletonList(user);
                C786410Ut5.LJLLLLLL(8, c1908100zkm.LLILLL);
                C1908730zln c1908730zln = c1908100zkm.LLILZ;
                C0SWE c0swe = new C0SWE(user);
                c0swe.LIZIZ = EnumC1357230lQH.NORMAL;
                c1908730zln.LLLLZIL(c0swe.LIZ());
                c1908100zkm.LLILZ.setDataChangeListener(new AwS394S0200000_28(user, c1908100zkm, 53));
                C0SY5.LIZIZ.contains(Integer.valueOf(user.getFollowStatus()));
                C426750GoL.LJIIIZ(c1908100zkm.LLILZ, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, null, false, 30);
                C19212010Ec.LIZJ.LJIILLIIL().LIZIZ(c1908100zkm.LLILZ, "", Collections.singletonList(user), false, null);
            }
        };
        this.LLILZLL = r0;
        r0.setLoadMoreListener(this);
        RecyclerView recyclerView2 = this.LLILZ;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LLILZLL);
        }
        RecyclerView recyclerView3 = this.LLILZ;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        View view = this.LLILLL;
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                view.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view;
    }
}
