package com.ss.android.ugc.aweme.story.note.draft;

import X.C01GW;
import X.C13BV;
import X.C228000uM;
import X.C452501pT;
import X.C817600W5m;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryThoughtDraftViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1993));
    public final LiveData<List<C817600W5m>> LLILLJJLI;
    public String LLILLL;
    public final MutableLiveData<Boolean> LLILZ;
    public final MutableLiveData<List<String>> LLILZIL;
    public final MediatorLiveData LLILZLL;
    public Map<String, String> LLIZ;

    public StoryThoughtDraftViewModel() {
        IStoryThoughtDraftService iStoryThoughtDraftService = (IStoryThoughtDraftService) PluggableExtentionKt.pluggableSpi$default(IStoryThoughtDraftService.class, false, false, false, 14, null);
        LiveData<List<C817600W5m>> mutableLiveData = (iStoryThoughtDraftService == null || (mutableLiveData = iStoryThoughtDraftService.LJFF()) == null) ? new MutableLiveData<>(C13BV.INSTANCE) : mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(Boolean.FALSE);
        this.LLILZ = mutableLiveData2;
        MutableLiveData<List<String>> mutableLiveData3 = new MutableLiveData<>(C13BV.INSTANCE);
        this.LLILZIL = mutableLiveData3;
        this.LLILZLL = C228000uM.LIZLLL(C228000uM.LIZIZ(mutableLiveData, mutableLiveData2, mutableLiveData3), AFwS232S0000000_4.get$arr$(77));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f4 -> B:14:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(android.content.Context r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftViewModel.vQ2(android.content.Context, X.05Vn):java.lang.Object");
    }
}
