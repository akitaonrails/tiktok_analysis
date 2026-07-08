package com.ss.android.ugc.aweme.discover.model;

import X.C1C7U;
import X.C786410Ut5;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.HashSet;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public class SearchStateViewModel extends ViewModel {
    public MutableLiveData<Integer> searchState = new MutableLiveData<>();
    public MutableLiveData<Boolean> isSearchPageVisible = new MutableLiveData<>();
    public MutableLiveData<Boolean> isLeavingSearchPage = new MutableLiveData<>();
    public MutableLiveData<Boolean> isRefreshingData = new MutableLiveData<>();
    public MutableLiveData<Boolean> isStopAutoPlayByTns = new MutableLiveData<>();
    public MutableLiveData<Boolean> isTnsShowingMaskLayer = new MutableLiveData<>();
    public MutableLiveData<Boolean> isShowingFilters = new MutableLiveData<>();
    public MutableLiveData<Boolean> backToMiddle = new MutableLiveData<>();
    public MutableLiveData<Boolean> isHavingFocus = new MutableLiveData<>();
    public MutableLiveData<Boolean> shouldBlockMediaPlay = new MutableLiveData<>();
    public MutableLiveData<Boolean> isScrollingInternal = new MutableLiveData<>();
    public MutableLiveData<Boolean> isResultRVScrolling = new MutableLiveData<>();
    public MutableLiveData<String> latestSearchKeyWord = new MutableLiveData<>();
    public MutableLiveData<Unit> tacoClearPlayData = new MutableLiveData<>();
    public HashSet<Integer> queryWordChangeInProcess = new HashSet<>();
    public final MutableLiveData<Unit> barEllipsisClickEvent = new MutableLiveData<>();

    public static boolean isSearchIntermediate(int i) {
        return i == 3;
    }

    public static boolean isSearchResult(int i) {
        return i == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBackToMiddle$5(boolean z) {
        C1C7U.LIZ("SearchStateViewModel@432.setBackToMiddle$1L");
        this.backToMiddle.setValue(Boolean.valueOf(z));
        C1C7U.LIZIZ("SearchStateViewModel@432.setBackToMiddle$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsHavingFocus$8(boolean z) {
        C1C7U.LIZ("SearchStateViewModel@432.setIsHavingFocus$1L");
        this.isHavingFocus.setValue(Boolean.valueOf(z));
        C1C7U.LIZIZ("SearchStateViewModel@432.setIsHavingFocus$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsLeavingSearch$1(boolean z) {
        C1C7U.LIZ("SearchStateViewModel@432.setIsLeavingSearch$1L");
        this.isLeavingSearchPage.setValue(Boolean.valueOf(z));
        C1C7U.LIZIZ("SearchStateViewModel@432.setIsLeavingSearch$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsRefreshingData$3(boolean z) {
        C1C7U.LIZ("SearchStateViewModel@432.setIsRefreshingData$1L");
        this.isRefreshingData.setValue(Boolean.valueOf(z));
        C1C7U.LIZIZ("SearchStateViewModel@432.setIsRefreshingData$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsResultRVScrolling$9(boolean z) {
        C1C7U.LIZ("SearchStateViewModel@432.setIsResultRVScrolling$1L");
        this.isResultRVScrolling.setValue(Boolean.valueOf(z));
        C1C7U.LIZIZ("SearchStateViewModel@432.setIsResultRVScrolling$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIsStopAutoPlayByTns$6(boolean z) {
        C1C7U.LIZ("SearchStateViewModel@432.setIsStopAutoPlayByTns$1L");
        this.isStopAutoPlayByTns.setValue(Boolean.valueOf(z));
        C1C7U.LIZIZ("SearchStateViewModel@432.setIsStopAutoPlayByTns$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSearchPageVisible$2(boolean z) {
        C1C7U.LIZ("SearchStateViewModel@432.setSearchPageVisible$1L");
        this.isSearchPageVisible.setValue(Boolean.valueOf(z));
        C1C7U.LIZIZ("SearchStateViewModel@432.setSearchPageVisible$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSearchState$0(int i) {
        C1C7U.LIZ("SearchStateViewModel@432.setSearchState$1L");
        this.searchState.setValue(Integer.valueOf(i));
        C1C7U.LIZIZ("SearchStateViewModel@432.setSearchState$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setShouldBlockMediaPlay$7(boolean z) {
        C1C7U.LIZ("SearchStateViewModel@432.setShouldBlockMediaPlay$1L");
        this.shouldBlockMediaPlay.setValue(Boolean.valueOf(z));
        C1C7U.LIZIZ("SearchStateViewModel@432.setShouldBlockMediaPlay$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setShowingFilters$4(boolean z) {
        C1C7U.LIZ("SearchStateViewModel@432.setShowingFilters$1L");
        this.isShowingFilters.setValue(Boolean.valueOf(z));
        C1C7U.LIZIZ("SearchStateViewModel@432.setShowingFilters$1L");
    }

    private void runOnUiThread(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), runnable);
        }
    }

    public void setBackToMiddle(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.0Q9B
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setBackToMiddle$5(z);
            }
        });
    }

    public void setIsHavingFocus(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.0Q9F
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setIsHavingFocus$8(z);
            }
        });
    }

    public void setIsLeavingSearch(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.0Q9H
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setIsLeavingSearch$1(z);
            }
        });
    }

    public void setIsRefreshingData(final boolean z) {
        boolean zLJI = MethodIDManager.LJI(71988);
        runOnUiThread(new Runnable() { // from class: X.0Q9G
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setIsRefreshingData$3(z);
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void setIsResultRVScrolling(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.0Q9D
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setIsResultRVScrolling$9(z);
            }
        });
    }

    public void setIsScrollingInternal(boolean z) {
        this.isScrollingInternal.setValue(Boolean.valueOf(z));
    }

    public void setIsStopAutoPlayByTns(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.0Q9A
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setIsStopAutoPlayByTns$6(z);
            }
        });
    }

    public void setSearchPageVisible(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.0Q9E
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setSearchPageVisible$2(z);
            }
        });
    }

    public void setSearchState(final int i) {
        runOnUiThread(new Runnable() { // from class: X.0Q9C
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setSearchState$0(i);
            }
        });
    }

    public void setShouldBlockMediaPlay(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.0Q9I
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setShouldBlockMediaPlay$7(z);
            }
        });
    }

    public void setShowingFilters(final boolean z) {
        runOnUiThread(new Runnable() { // from class: X.0Q99
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setShowingFilters$4(z);
            }
        });
    }
}
