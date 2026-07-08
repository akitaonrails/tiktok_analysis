package com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.keywords;

import X.C1389890mGx;
import X.C13BV;
import X.C1888220zEi;
import X.InterfaceC1887850zE7;
import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class CommentKeywordsVM extends ViewModel {
    public String LL = "";
    public String LLILLJJLI = "";
    public final int LLILLL;
    public final MutableLiveData<Integer> LLILZ;
    public final MutableLiveData LLILZIL;
    public final MutableLiveData<List<String>> LLILZLL;
    public final MutableLiveData LLIZ;
    public final MutableLiveData<Integer> LLIZLLLIL;
    public InterfaceC1887850zE7 LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    public CommentKeywordsVM() {
        C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
        this.LLILLL = c1888220zEi.LIZJ();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(c1888220zEi.LIZJ()));
        this.LLILZ = mutableLiveData;
        this.LLILZIL = mutableLiveData;
        MutableLiveData<List<String>> mutableLiveData2 = new MutableLiveData<>(C13BV.INSTANCE);
        this.LLILZLL = mutableLiveData2;
        this.LLIZ = mutableLiveData2;
        this.LLIZLLLIL = new MutableLiveData<>(0);
    }

    public static final void vQ2(String str) {
        Activity topActivity;
        ICommentSafetyDepService iCommentSafetyDepService = (ICommentSafetyDepService) PluggableExtentionKt.pluggableSpi$default(ICommentSafetyDepService.class, false, false, false, 14, null);
        if (iCommentSafetyDepService != null && (topActivity = iCommentSafetyDepService.getTopActivity()) != null) {
            if (!TextUtils.isEmpty(str)) {
                C1389890mGx c1389890mGx = new C1389890mGx(topActivity);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
                return;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(topActivity);
            c1389890mGx2.LIZ(true);
            c1389890mGx2.LJIIIZ(2131829163);
            c1389890mGx2.LJIIJJI();
        }
    }
}
