package com.ss.android.ugc.aweme.search.pages.common.personalized.banner.core.viewmodel;

import X.C0PG7;
import X.C0QGP;
import X.C644560PPy;
import Y.AsS16S0110000_10;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.poplayer.core.PopupManager;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPersonalizedBannerVM extends ViewModel {
    public boolean LL;
    public boolean LLILLJJLI;
    public final NoticeStateLiveData LLILLL;
    public final NoticeStateLiveData LLILZ;
    public C0PG7 LLILZIL;
    public final AsS16S0110000_10 LLILZLL;

    public final void vQ2() {
        this.LLILLL.setValue(C0PG7.DIMISS);
        this.LL = false;
        PopupManager.LIZJ(C0QGP.class);
    }

    public SearchPersonalizedBannerVM() {
        this.LLILLJJLI = C644560PPy.LJIJJLI() == 0;
        NoticeStateLiveData noticeStateLiveData = new NoticeStateLiveData();
        this.LLILLL = noticeStateLiveData;
        this.LLILZ = noticeStateLiveData;
        this.LLILZLL = new AsS16S0110000_10(this, 1);
    }

    public final class NoticeStateLiveData extends MutableLiveData<C0PG7> {
        public NoticeStateLiveData() {
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void postValue(C0PG7 c0pg7) {
            C0PG7 c0pg72 = C0PG7.SHOW;
            if (c0pg7 == c0pg72 && getValue() == C0PG7.READY) {
                super.postValue(c0pg7);
                return;
            }
            C0PG7 c0pg73 = C0PG7.DIMISS;
            if (c0pg7 == c0pg73 && getValue() != c0pg73) {
                super.postValue(c0pg7);
            } else if (c0pg7 != c0pg72 && c0pg7 != c0pg73) {
                super.postValue(c0pg7);
            }
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(C0PG7 c0pg7) {
            C0PG7 c0pg72 = C0PG7.SHOW;
            if (c0pg7 == c0pg72 && getValue() == C0PG7.READY) {
                super.setValue(c0pg7);
                return;
            }
            C0PG7 c0pg73 = C0PG7.DIMISS;
            if (c0pg7 == c0pg73 && getValue() != c0pg73) {
                super.setValue(c0pg7);
            } else if (c0pg7 != c0pg72 && c0pg7 != c0pg73) {
                super.setValue(c0pg7);
            }
        }
    }
}
