package com.ss.android.ugc.aweme.social.thought.ui.aggregated;

import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C05ML;
import X.C05MM;
import X.C095G;
import X.C09AE;
import X.C09IC;
import X.C0DZB;
import X.C0DZJ;
import X.C0DZK;
import X.C0PEM;
import X.C0XQ7;
import X.C13LP;
import X.C1BNE;
import X.C1DEK;
import X.C2252321DDq;
import X.C23250099c;
import X.C341220DZg;
import X.InterfaceC346201Wa;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInteractionInfo;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtLikeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class SocialThoughtAggregatedVM extends ViewModel {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public final C1DEK LLILLL;
    public final InterfaceC346201Wa<C0DZB> LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final Set<String> LLJ;
    public boolean LLJI;
    public final Map<String, C09AE> LLJIJIL;
    public AnonymousClass0956 LLJILJIL;

    public final ISocialThoughtDataCenterService wQ2() {
        return (ISocialThoughtDataCenterService) PluggableExtentionKt.pluggableSpi$default(ISocialThoughtDataCenterService.class, false, false, false, 14, null);
    }

    public final void xQ2() {
        Object value;
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        C2252321DDq c2252321DDq = this.LL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C0DZJ.LIZ((C0DZJ) value, null, false, true, false, 11)));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0DZK(this, getCurrentUid(), null), 3);
    }

    public SocialThoughtAggregatedVM() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C0DZJ(0));
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
        C1DEK c1dekLIZ = C095G.LIZ(-2, null, 6);
        this.LLILLL = c1dekLIZ;
        this.LLILZ = C09IC.LJJIIJ(c1dekLIZ);
        this.LLILZIL = "";
        this.LLILZLL = "";
        this.LLJ = new LinkedHashSet();
        this.LLJIJIL = new LinkedHashMap();
    }

    public final String getCurrentUid() {
        String curUserId = C0XQ7.LJFF().getCurUserId();
        return curUserId == null ? "" : curUserId;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        AnonymousClass0956 anonymousClass0956 = this.LLJILJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public final void yQ2(List<ThoughtAggregatedModel> list) {
        String uid;
        AnonymousClass0956 anonymousClass0956 = this.LLJILJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        ISocialThoughtDataCenterService iSocialThoughtDataCenterServiceWQ2 = wQ2();
        if (iSocialThoughtDataCenterServiceWQ2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ThoughtAggregatedModel> it2 = list.iterator();
        while (it2.hasNext()) {
            User user = it2.next().userInfo;
            if (user != null && (uid = user.getUid()) != null && uid.length() > 0) {
                arrayList.add(uid);
            }
        }
        List listLJJJJI = C13LP.LJJJJI(arrayList);
        if (listLJJJJI.isEmpty()) {
            return;
        }
        this.LLJILJIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C05MM(listLJJJJI, iSocialThoughtDataCenterServiceWQ2, this, null), 3);
    }

    public final void vQ2(String str, String str2, ThoughtInfo thoughtInfo, boolean z, User user, String str3) {
        ThoughtInteractionInfo thoughtInteractionInfo = thoughtInfo.viewerInteraction;
        if (thoughtInteractionInfo == null) {
            thoughtInteractionInfo = new ThoughtInteractionInfo(null, null);
        }
        ThoughtInfo thoughtInfoCopy = thoughtInfo.copy(thoughtInfo.thoughtId, thoughtInfo.textContent, thoughtInfo.createTimeMs, thoughtInfo.privacySetting, thoughtInfo.interactionPreview, thoughtInteractionInfo.copy(thoughtInteractionInfo.userInfo, new ThoughtLikeInfo(Integer.valueOf(z ? 1 : 0))), thoughtInfo.authorUid, thoughtInfo.isPublishing);
        ISocialThoughtDataCenterService iSocialThoughtDataCenterServiceWQ2 = wQ2();
        if (iSocialThoughtDataCenterServiceWQ2 != null) {
            iSocialThoughtDataCenterServiceWQ2.LJII(str, thoughtInfoCopy);
        }
        C341220DZg.LJIILIIL(this.LLILZIL, "friends_thoughts_panel", str3, thoughtInfoCopy, C341220DZg.LJIILL(user, str), z);
        C09AE c09ae = (C09AE) ((LinkedHashMap) this.LLJIJIL).get(str2);
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJIJIL.put(str2, C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(ProcessLifecycleOwner.Companion.get()), C0PEM.LIZJ, null, new C05ML(z, str2, this, str, thoughtInfo, null), 2));
    }
}
