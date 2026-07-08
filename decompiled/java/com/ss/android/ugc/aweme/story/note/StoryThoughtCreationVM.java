package com.ss.android.ugc.aweme.story.note;

import X.C01GW;
import X.C0HCN;
import X.C0TI1;
import X.C11GX;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C20085613iQ;
import X.C20684815ws;
import X.C228000uM;
import X.C2344009Gk;
import X.C289440BWc;
import X.C452501pT;
import X.EnumC20580215g0;
import X.EnumC20581215gA;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.experiment.thought.StoryThoughtHolidayConfigSettings;
import com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes32.dex */
public final class StoryThoughtCreationVM extends ViewModel {
    public final C0TI1 LL = new C0TI1();
    public final MutableLiveData<Unit> LLILLJJLI;
    public final MutableLiveData LLILLL;
    public final EnumC20580215g0 LLILZ;
    public final MutableLiveData<String> LLILZIL;
    public final StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig LLILZLL;
    public final MutableLiveData<String> LLIZ;
    public boolean LLIZLLLIL;
    public final MutableLiveData LLJ;
    public final DebounceMutableLiveData<Boolean> LLJI;
    public final MediatorLiveData LLJIJIL;
    public int LLJILJIL;
    public final MutableLiveData LLJILJILJ;
    public final MutableLiveData<Integer> LLJILLL;
    public final MediatorLiveData LLJJ;
    public final MutableLiveData<Integer> LLJJI;
    public final C01GW LLJJIII;
    public CreativeInfo LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public boolean LLJJJIL;
    public long LLJJJJ;
    public boolean LLJJJJJIL;
    public final MutableLiveData<EnumC20581215gA> LLJJJJLIIL;
    public final MutableLiveData<List<StoryNoteTextExtra>> LLJJL;

    public final String xQ2(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : "image" : "general_gradient" : "avatar_gradient";
    }

    public final void vQ2() {
        List<BackgroundModel> list;
        BackgroundModel backgroundModel;
        Iterator it2 = ((List) this.LLJILJILJ.getValue()).iterator();
        int i = 0;
        while (it2.hasNext()) {
            String str = ((BackgroundModel) it2.next()).backgroundGeckoId;
            StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig storyThoughtHolidayConfig = this.LLILZLL;
            if (Intrinsics.LJFF(str, (storyThoughtHolidayConfig == null || (list = storyThoughtHolidayConfig.backgroundImageList) == null || (backgroundModel = (BackgroundModel) C13LP.LJJJLL(list)) == null) ? null : backgroundModel.backgroundGeckoId)) {
                if (i != -1) {
                    this.LLJILLL.setValue(Integer.valueOf(i));
                    ((LiveData) this.LLJJIII.getValue()).setValue(null);
                    return;
                }
                return;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int yQ2() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.story.experiment.thought.StoryThoughtHolidayConfigSettings$StoryThoughtHolidayConfig r0 = r4.LLILZLL
            r2 = 0
            if (r0 == 0) goto L2a
            java.util.List<com.ss.android.ugc.aweme.feed.model.story.BackgroundModel> r1 = r0.backgroundImageList
            if (r1 == 0) goto L2a
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.story.BackgroundModel r0 = (com.ss.android.ugc.aweme.feed.model.story.BackgroundModel) r0
            java.lang.String r0 = r0.backgroundGeckoId
            r3.add(r0)
            goto L18
        L2a:
            r1 = 0
            goto L3d
        L2c:
            androidx.lifecycle.MediatorLiveData r0 = r4.LLJJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.model.story.BackgroundModel r0 = (com.ss.android.ugc.aweme.feed.model.story.BackgroundModel) r0
            java.lang.String r0 = r0.backgroundGeckoId
            boolean r0 = r3.contains(r0)
            r1 = 1
            if (r0 != r1) goto L2a
        L3d:
            androidx.lifecycle.MutableLiveData r0 = r4.LLJ
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4e
            if (r1 != 0) goto L4e
        L4d:
            return r2
        L4e:
            com.ss.android.ugc.aweme.story.experiment.thought.StoryThoughtHolidayConfigSettings$StoryThoughtHolidayConfig r0 = r4.LLILZLL
            if (r0 == 0) goto L4d
            int r2 = r0.holidayType
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.StoryThoughtCreationVM.yQ2():int");
    }

    public StoryThoughtCreationVM() {
        MutableLiveData mutableLiveData;
        MutableLiveData<Unit> mutableLiveData2 = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData2;
        this.LLILLL = mutableLiveData2;
        this.LLILZ = C0HCN.LIZ() ? EnumC20580215g0.SMALL_SCREEN : EnumC20580215g0.NORMAL;
        this.LLILZIL = new MutableLiveData<>("");
        IFriendInteractionSettingsService iFriendInteractionSettingsService = (IFriendInteractionSettingsService) ServiceManager.get().getService(IFriendInteractionSettingsService.class);
        this.LLILZLL = iFriendInteractionSettingsService != null ? iFriendInteractionSettingsService.LIZJ() : null;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>("");
        this.LLIZ = mutableLiveData3;
        this.LLIZLLLIL = true;
        try {
            mutableLiveData = C228000uM.LIZLLL(mutableLiveData3, new AwS610S0100000_31(this, 238));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            mutableLiveData = new MutableLiveData(C13BV.INSTANCE);
        }
        this.LLJ = mutableLiveData;
        this.LLJI = new DebounceMutableLiveData<>(Boolean.FALSE);
        this.LLJIJIL = C228000uM.LIZLLL(C228000uM.LIZ(this.LLIZ, this.LLILZIL), AFwS231S0000000_3.get$arr$(94));
        this.LLJILJIL = -1;
        List listLJJLL = C13LQ.LJJLL(C11GX.LIZ());
        StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig storyThoughtHolidayConfig = this.LLILZLL;
        Object obj = (storyThoughtHolidayConfig == null || (obj = storyThoughtHolidayConfig.backgroundImageList) == null) ? C13BV.INSTANCE : obj;
        if (!listLJJLL.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(listLJJLL);
            arrayList.addAll(1, obj);
            obj = arrayList;
        }
        MutableLiveData mutableLiveData4 = new MutableLiveData(obj);
        this.LLJILJILJ = mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5 = new MutableLiveData<>(0);
        this.LLJILLL = mutableLiveData5;
        this.LLJJ = C228000uM.LIZLLL(C228000uM.LIZ(mutableLiveData4, mutableLiveData5), AFwS231S0000000_3.get$arr$(93));
        this.LLJJI = new MutableLiveData<>(null);
        this.LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 724));
        this.LLJJJJ = -1L;
        this.LLJJJJLIIL = new MutableLiveData<>(ComplianceServiceProvider.LJIJJ().LJJIIZ() ? EnumC20581215gA.ONLY_YOU : ((Boolean) C289440BWc.LIZIZ.getValue()).booleanValue() ? EnumC20581215gA.FRIENDS : EnumC20581215gA.EVERYONE);
        this.LLJJL = new MutableLiveData<>(C13BV.INSTANCE);
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class DebounceMutableLiveData<T> extends MutableLiveData<T> {
        public static final int $stable = 8;

        public DebounceMutableLiveData(T t) {
            super(t);
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void postValue(T t) {
            if (!Intrinsics.LJFF(t, getValue())) {
                super.postValue(t);
            }
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t) {
            if (!Intrinsics.LJFF(t, getValue())) {
                super.setValue(t);
            }
        }
    }

    public static List wQ2(List list) {
        List<MatchResult> listLJLLLL = C13LP.LJLLLL(C20085613iQ.LIZ(AFwS276S0000000_31.get$arr$(200), AFwS276S0000000_31.get$arr$(201)), list);
        ArrayList arrayList = new ArrayList();
        for (MatchResult matchResult : listLJLLLL) {
            if (!arrayList.isEmpty()) {
                IntRange intRangeLIZIZ = ((MatchResult) C13LP.LJJLIIIJJI(arrayList)).LIZIZ();
                IntRange intRangeLIZIZ2 = matchResult.LIZIZ();
                if (intRangeLIZIZ.LL > intRangeLIZIZ2.LL || intRangeLIZIZ.LLILLJJLI < intRangeLIZIZ2.LLILLJJLI) {
                }
            }
            arrayList.add(matchResult);
        }
        return arrayList;
    }

    public final void zQ2(Pair<String, String> pair, Pair<String, String> pair2) {
        String creationId;
        String first;
        String second;
        String first2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        CreativeInfo creativeInfo = this.LLJJIJI;
        String second2 = null;
        if (creativeInfo != null) {
            creationId = creativeInfo.getCreationId();
        } else {
            creationId = null;
        }
        c2344009Gk.LJIIIIZZ("creation_id", creationId);
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        c2344009Gk.LJIIIIZZ("from_background", first);
        if (pair != null) {
            second = pair.getSecond();
        } else {
            second = null;
        }
        c2344009Gk.LJIIIIZZ("from_bg_gecko_id", second);
        if (pair2 != null) {
            first2 = pair2.getFirst();
        } else {
            first2 = null;
        }
        c2344009Gk.LJIIIIZZ("to_background", first2);
        if (pair2 != null) {
            second2 = pair2.getSecond();
        }
        c2344009Gk.LJIIIIZZ("to_bg_gecko_id", second2);
        C20684815ws.LJIILLIIL("note_edit_change_color", c2344009Gk.LIZ);
    }
}
