package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui;

import X.AbstractC653850Pkl;
import X.C366700EZg;
import X.C418440Gaw;
import X.C640260P9k;
import X.C645320PSw;
import X.C653860Pkm;
import X.C653890Pkp;
import X.C653910Pkr;
import X.C662380PyW;
import X.C662390PyX;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.SearchUserLinearLayoutManager;
import java.util.List;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes11.dex */
public class SearchMixUserCell extends AbstractC653850Pkl<C645320PSw> implements GenericLifecycleObserver {
    public static final int LLJJJJLIIL = C366700EZg.LIZ(8.0d);
    public static final int LLJJL = C366700EZg.LIZ(12.0d);
    public static final int LLJJLIIIJLLLLLLLZ = C366700EZg.LIZ(0.5d);
    public static final int LLJL = C366700EZg.LIZ(4.0d);
    public final C662380PyW LLJJI;
    public SearchResultParam LLJJIII;
    public final RecyclerView LLJJIJI;
    public final Fragment LLJJIJIIJIL;
    public C645320PSw LLJJIJIL;
    public C653890Pkp LLJJJ;
    public int LLJJJIL;
    public String LLJJJJ;
    public boolean LLJJJJJIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final boolean LIZIZ() {
        C645320PSw c645320PSw = this.LLJJIJIL;
        if (c645320PSw == null) {
            return false;
        }
        C662390PyX c662390PyX = C662390PyX.LIZ;
        List<SearchUser> list = c645320PSw.LLILLJJLI;
        c662390PyX.getClass();
        return C662390PyX.LIZ(list);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
    }

    public static void LIZJ(int i, TuxTextView tuxTextView) {
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
        }
    }

    public SearchMixUserCell(Fragment fragment, View view, Context context, C653860Pkm c653860Pkm, Fragment fragment2) {
        super(view, context, c653860Pkm);
        if (fragment2 != null) {
            fragment2.getLifecycle().addObserver(this);
        }
        this.LLILLL.setText(context.getString(2131858032));
        C653910Pkr c653910Pkr = new C653910Pkr(this);
        this.LLJJIJIIJIL = fragment;
        RecyclerView recyclerView = new RecyclerView(context);
        this.LLJJIJI = recyclerView;
        recyclerView.setImportantForAccessibility(2);
        SearchUserLinearLayoutManager searchUserLinearLayoutManager = new SearchUserLinearLayoutManager(context);
        searchUserLinearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(searchUserLinearLayoutManager);
        if (recyclerView.getItemAnimator() != null) {
            recyclerView.getItemAnimator().LJIJJLI(0L);
        }
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setPadding(0, C418440Gaw.LIZ(8), 0, C418440Gaw.LIZ(16));
        this.LLJIJIL.addView(recyclerView);
        C662380PyW c662380PyW = new C662380PyW(new SearchKeywordPresenter(C640260P9k.LIZIZ(view), fragment), c653910Pkr, fragment);
        this.LLJJI = c662380PyW;
        c662380PyW.LLIZ = this.LLILZIL;
        recyclerView.setAdapter(c662380PyW);
        recyclerView.setMotionEventSplittingEnabled(false);
    }
}
