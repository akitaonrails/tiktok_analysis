package com.ss.android.ugc.aweme.newcreatoredit;

import X.AbstractC1779240wOw;
import X.C0TRZ;
import X.C1697810uHb;
import X.C1779260wOy;
import X.C1826670xdR;
import X.C20703515zt;
import X.C21384818mU;
import X.C746760TRa;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.creatoredit.NewCreatorCaptionEditItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class NewCreatorCaptionEditViewModel extends ViewModel {
    public List<String> LL;
    public List<String> LLILLJJLI;
    public List<String> LLILLL;
    public List<String> LLILZ;
    public final C1826670xdR LLILZIL;
    public C21384818mU LLILZLL;
    public boolean LLIZ;
    public final MutableLiveData<Boolean> LLIZLLLIL;
    public final MutableLiveData<AbstractC1779240wOw<NewCreatorCaptionEditItem>> LLJ;
    public final MutableLiveData<AbstractC1779240wOw<NewCreatorCaptionEditItem>> LLJI;
    public final MutableLiveData<Boolean> LLJIJIL;
    public final MutableLiveData<Boolean> LLJILJIL;
    public final MutableLiveData<Boolean> LLJILJILJ;
    public final LiveData<AbstractC1779240wOw<List<C0TRZ>>> LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final Set<String> LLJJIJI;

    public final String vQ2() {
        Aweme aweme;
        CaptionItemModel captionItemModelLJIIIIZZ;
        if (this.LLJJ) {
            return yQ2();
        }
        C21384818mU c21384818mU = this.LLILZLL;
        if (c21384818mU == null || (aweme = c21384818mU.LJII) == null || (captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme)) == null) {
            return null;
        }
        return captionItemModelLJIIIIZZ.languageCode;
    }

    public final NewCreatorCaptionEditItem xQ2() {
        AbstractC1779240wOw<NewCreatorCaptionEditItem> value = this.LLJ.getValue();
        if (value != null) {
            return value.LIZ();
        }
        return null;
    }

    public final NewCreatorCaptionEditItem zQ2() {
        AbstractC1779240wOw<NewCreatorCaptionEditItem> value = this.LLJI.getValue();
        if (value != null) {
            return value.LIZ();
        }
        return null;
    }

    public NewCreatorCaptionEditViewModel() {
        C1826670xdR c1826670xdR = new C1826670xdR(ViewModelKt.getViewModelScope(this));
        this.LLILZIL = c1826670xdR;
        Boolean bool = Boolean.FALSE;
        this.LLIZLLLIL = new MutableLiveData<>(bool);
        C1779260wOy c1779260wOy = C1779260wOy.LIZ;
        this.LLJ = new MutableLiveData<>(c1779260wOy);
        this.LLJI = new MutableLiveData<>(c1779260wOy);
        this.LLJIJIL = new MutableLiveData<>(bool);
        this.LLJILJIL = new MutableLiveData<>(bool);
        this.LLJILJILJ = new MutableLiveData<>(bool);
        this.LLJILLL = c1826670xdR.LJ;
        this.LLJJIJI = new LinkedHashSet();
    }

    public static String yQ2() {
        return (String) C746760TRa.LIZ().LJIIIIZZ().getValue();
    }

    public final void AQ2(boolean z) {
        String text;
        List<CreatorCaptionEditData> list;
        CreatorCaptionEditData creatorCaptionEditData;
        String text2;
        List<CreatorCaptionEditData> list2;
        CreatorCaptionEditData creatorCaptionEditData2;
        boolean z2 = false;
        if (z) {
            MutableLiveData<Boolean> mutableLiveData = this.LLJILJIL;
            List<String> list3 = this.LL;
            if (list3 != null) {
                Iterator it2 = ((ArrayList) list3).iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        NewCreatorCaptionEditItem newCreatorCaptionEditItemXQ2 = xQ2();
                        if (newCreatorCaptionEditItemXQ2 != null && (list2 = newCreatorCaptionEditItemXQ2.transSubtitleItem) != null && (creatorCaptionEditData2 = (CreatorCaptionEditData) ListProtector.get(list2, i)) != null) {
                            text2 = creatorCaptionEditData2.getText();
                        } else {
                            text2 = null;
                        }
                        if (!Intrinsics.LJFF(text2, next)) {
                            z2 = true;
                            break;
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            mutableLiveData.postValue(Boolean.valueOf(z2));
            return;
        }
        MutableLiveData<Boolean> mutableLiveData2 = this.LLJILJILJ;
        List<String> list4 = this.LLILLJJLI;
        if (list4 != null) {
            Iterator it3 = ((ArrayList) list4).iterator();
            int i3 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    NewCreatorCaptionEditItem newCreatorCaptionEditItemZQ2 = zQ2();
                    if (newCreatorCaptionEditItemZQ2 != null && (list = newCreatorCaptionEditItemZQ2.transSubtitleItem) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(list, i3)) != null) {
                        text = creatorCaptionEditData.getText();
                    } else {
                        text = null;
                    }
                    if (!Intrinsics.LJFF(text, next2)) {
                        z2 = true;
                        break;
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        mutableLiveData2.postValue(Boolean.valueOf(z2));
    }

    public final NewCreatorCaptionEditItem wQ2(boolean z) {
        if (z) {
            return xQ2();
        }
        return zQ2();
    }
}
