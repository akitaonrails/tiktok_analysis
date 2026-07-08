package com.zhihu.matisse.internal.ui;

import X.AbstractC20148113sV;
import X.AnonymousClass1478;
import X.AnonymousClass1479;
import X.C098200Yq;
import X.C0DXR;
import X.C147C;
import X.C147I;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20148913sd;
import X.C20149313sh;
import X.C786410Ut5;
import X.InterfaceC20149113sf;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.Item;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes31.dex */
public class MediaSelectionFragment extends Fragment implements InterfaceC20149113sf, C147C, AnonymousClass1478 {
    public static final String _pnsPageId = "KyohZzU7IS05ZyIyPCw/Oip9ISs4LD09KSliHELIOSPCZ9BSAoIC4ALSkpKjs6JysKOy40JSAiPQ==";
    public final C20148913sd LL = new C20148913sd();
    public RecyclerView LLILLJJLI;
    public C147I LLILLL;
    public AnonymousClass1479 LLILZ;
    public C147C LLILZIL;
    public AnonymousClass1478 LLILZLL;

    @Override // X.C147C
    public final void d0() {
        C147C c147c = this.LLILZIL;
        if (c147c != null) {
            c147c.d0();
        }
    }

    @Override // X.InterfaceC20149113sf
    public final void yy() {
        this.LLILLL.LLLFZ(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C20148913sd c20148913sd = this.LL;
        AbstractC20148113sV abstractC20148113sV = c20148913sd.LIZIZ;
        if (abstractC20148113sV != null) {
            abstractC20148113sV.LIZ(2);
        }
        c20148913sd.LIZJ = null;
    }

    @Override // X.InterfaceC20149113sf
    public final void Xi(Cursor cursor) {
        this.LLILLL.LLLFZ(cursor);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Parcelable parcelable = getArguments().getParcelable("extra_album");
        C147I c147i = new C147I(getContext(), this.LLILZ.LJJLIIIJJIZ(), this.LLILLJJLI);
        this.LLILLL = c147i;
        c147i.LLILZIL = this;
        c147i.LLILZLL = this;
        this.LLILLJJLI.setHasFixedSize(true);
        final int i = C20149313sh.LIZ.LJIIIIZZ;
        this.LLILLJJLI.setLayoutManager(new GridLayoutManager(getContext(), i));
        final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.a78);
        this.LLILLJJLI.addItemDecoration(new C0DXR(i, dimensionPixelSize) { // from class: X.0DXk
            public final int LL;
            public final int LLILLJJLI;
            public final boolean LLILLL = false;

            {
                this.LL = i;
                this.LLILLJJLI = dimensionPixelSize;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int i2 = this.LL;
                int i3 = childAdapterPosition % i2;
                if (this.LLILLL) {
                    int i4 = this.LLILLJJLI;
                    rect.left = i4 - ((i3 * i4) / i2);
                    rect.right = ((i3 + 1) * i4) / i2;
                    if (childAdapterPosition < i2) {
                        rect.top = i4;
                    }
                    rect.bottom = i4;
                    return;
                }
                int i5 = this.LLILLJJLI;
                rect.left = (i3 * i5) / i2;
                rect.right = i5 - (((i3 + 1) * i5) / i2);
                if (childAdapterPosition < i2) {
                    return;
                }
                rect.top = i5;
            }
        });
        this.LLILLJJLI.setAdapter(this.LLILLL);
        C20148913sd c20148913sd = this.LL;
        C19EG activity = getActivity();
        c20148913sd.getClass();
        c20148913sd.LIZ = new WeakReference<>(activity);
        c20148913sd.LIZIZ = activity.getSupportLoaderManager();
        c20148913sd.LIZJ = this;
        C20148913sd c20148913sd2 = this.LL;
        c20148913sd2.getClass();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIJL(bundle2, "args_album", parcelable);
        bundle2.putBoolean("args_enable_capture", false);
        c20148913sd2.LIZIZ.LIZJ(2, bundle2, c20148913sd2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AnonymousClass1479) {
            this.LLILZ = (AnonymousClass1479) context;
            if (context instanceof C147C) {
                this.LLILZIL = (C147C) context;
            }
            if (context instanceof AnonymousClass1478) {
                this.LLILZLL = (AnonymousClass1478) context;
                return;
            }
            return;
        }
        throw new IllegalStateException("Context must implement SelectionProvider.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLJJLI = (RecyclerView) view.findViewById(R.id.t0z);
    }

    @Override // X.AnonymousClass1478
    public final void gL(Album album, Item item, int i) {
        AnonymousClass1478 anonymousClass1478 = this.LLILZLL;
        if (anonymousClass1478 != null) {
            anonymousClass1478.gL((Album) getArguments().getParcelable("extra_album"), item, i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8v, viewGroup, false);
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
}
