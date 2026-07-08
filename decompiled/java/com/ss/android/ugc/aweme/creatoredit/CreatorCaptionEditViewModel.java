package com.ss.android.ugc.aweme.creatoredit;

import X.C01GW;
import X.C1697810uHb;
import X.C1BNE;
import X.C2252321DDq;
import X.C452501pT;
import X.C742490TAp;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class CreatorCaptionEditViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(174));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(177));
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public CreatorCaptionEditItem LLIZ;
    public List<String> LLIZLLLIL;
    public final List<String> LLJ;

    public final MutableLiveData<Aweme> vQ2() {
        return (MutableLiveData) this.LL.getValue();
    }

    public final MutableLiveData<C742490TAp> wQ2() {
        return (MutableLiveData) this.LLILZIL.getValue();
    }

    public final MutableLiveData<Boolean> xQ2() {
        return (MutableLiveData) this.LLILZLL.getValue();
    }

    public CreatorCaptionEditViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LLILLL = c2252321DDqLIZ;
        this.LLILZ = c2252321DDqLIZ;
        this.LLILZIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(175));
        this.LLILZLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(176));
        this.LLJ = new ArrayList();
    }

    public final void AQ2() {
        List<CreatorCaptionEditData> list;
        CreatorCaptionEditData creatorCaptionEditData;
        MutableLiveData<Boolean> mutableLiveDataXQ2 = xQ2();
        Iterator it2 = ((ArrayList) this.LLJ).iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int i2 = i + 1;
            String text = null;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            CreatorCaptionEditItem creatorCaptionEditItem = this.LLIZ;
            if (creatorCaptionEditItem != null && (list = creatorCaptionEditItem.transSubtitleItem) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(list, i)) != null) {
                text = creatorCaptionEditData.getText();
            }
            if (!Intrinsics.LJFF(text, next)) {
                z = true;
                break;
            }
            i = i2;
        }
        mutableLiveDataXQ2.setValue(Boolean.valueOf(z));
    }

    public final boolean yQ2() {
        C742490TAp value = wQ2().getValue();
        return value != null && value.LIZ > 0;
    }

    public final boolean zQ2() {
        C742490TAp value = wQ2().getValue();
        return value != null && value.LIZIZ;
    }
}
