package com.ss.android.ugc.aweme.story.note;

import X.AnonymousClass0956;
import X.C01GW;
import X.C05YD;
import X.C0HCN;
import X.C0HK3;
import X.C0HK4;
import X.C0LAB;
import X.C0PEM;
import X.C0TI1;
import X.C11GX;
import X.C1257100iom;
import X.C1257120ioo;
import X.C1341405Mu;
import X.C1372105Yp;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C1404940mfE;
import X.C15X1;
import X.C1609930rzr;
import X.C20581515gD;
import X.C20581815gG;
import X.C20583115gT;
import X.C20583215gU;
import X.C20684815ws;
import X.C2188811AlT;
import X.C228000uM;
import X.C23250099c;
import X.C23271099x;
import X.C289440BWc;
import X.C452501pT;
import X.C817600W5m;
import X.EnumC1405120mfW;
import X.EnumC20581215gA;
import X.EnumC20582815gQ;
import X.EnumC339980DUm;
import X.InterfaceC439080HJq;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.StoryUploadPageEntranceType;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService;
import com.ss.android.ugc.aweme.story.experiment.thought.StoryThoughtHolidayConfigSettings;
import com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResult;
import com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService;
import com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class StoryThoughtAvatarCreationVM extends ViewModel {
    public final C0TI1 LL = new C0TI1();
    public final MutableLiveData<Unit> LLILLJJLI;
    public final MutableLiveData LLILLL;
    public final C15X1 LLILZ;
    public final C01GW LLILZIL;
    public final StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig LLILZLL;
    public final MutableLiveData<String> LLIZ;
    public boolean LLIZLLLIL;
    public final MediatorLiveData LLJ;
    public final DebounceMutableLiveData<Boolean> LLJI;
    public final MutableLiveData<C817600W5m> LLJIJIL;
    public final MutableLiveData LLJILJIL;
    public final MutableLiveData<Integer> LLJILJILJ;
    public final MutableLiveData LLJILLL;
    public final MutableLiveData<Integer> LLJJ;
    public final C01GW LLJJI;
    public final MutableLiveData<Integer> LLJJIII;
    public final C01GW LLJJIJI;
    public CreativeInfo LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;
    public String LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public Boolean LLJLIL;
    public Boolean LLJLILLLLZIIL;
    public C817600W5m LLJLL;
    public boolean LLJLLIL;
    public final MutableLiveData<EnumC20581215gA> LLJLLL;
    public final MediatorLiveData LLJZ;
    public final MutableLiveData<Boolean> LLJZIJLIL;
    public final MutableLiveData LLL;
    public final MutableLiveData<EnumC1405120mfW> LLLF;
    public final MutableLiveData LLLFF;
    public final MutableLiveData<Boolean> LLLFFI;
    public final MutableLiveData LLLFZ;
    public final MutableLiveData<Boolean> LLLI;
    public final MutableLiveData LLLII;
    public final MutableLiveData<Boolean> LLLIIII;
    public InterfaceC439080HJq LLLIIIIL;
    public boolean LLLIIIL;
    public final LiveData<InterfaceC439080HJq> LLLIIL;
    public final MediatorLiveData LLLIILIL;
    public final MutableLiveData<EnumC339980DUm> LLLIL;
    public final MutableLiveData LLLILZ;
    public final MutableLiveData<EnumC20582815gQ> LLLILZJ;
    public final MutableLiveData LLLILZLLLI;
    public final MediatorLiveData LLLIZZ;
    public final MutableLiveData<EnumC1405120mfW> LLLJ;
    public final MediatorLiveData LLLJIL;
    public final MediatorLiveData LLLJL;
    public final MediatorLiveData LLLL;
    public final MutableLiveData<List<String>> LLLLII;
    public final MutableLiveData LLLLIIIILLL;
    public final MutableLiveData<String> LLLLIIL;
    public final MutableLiveData<List<String>> LLLLIILL;
    public final MutableLiveData LLLLIILLL;
    public final MutableLiveData<List<String>> LLLLIL;
    public final MutableLiveData LLLLILI;
    public final MutableLiveData<String> LLLLJ;
    public final MutableLiveData<String> LLLLJI;
    public final MutableLiveData<String> LLLLL;
    public final MutableLiveData<Long> LLLLLIL;
    public final MutableLiveData LLLLLILLIL;
    public final MutableLiveData<Boolean> LLLLLJIL;
    public final MutableLiveData LLLLLJLJLL;
    public boolean LLLLLL;
    public AnonymousClass0956 LLLLLLIL;
    public boolean LLLLLLJ;
    public final MediatorLiveData LLLLLLL;
    public final MediatorLiveData LLLLLLLLL;
    public final MediatorLiveData LLLLLLLLLL;
    public final MutableLiveData<Boolean> LLLLLLLZIL;
    public final MediatorLiveData LLLLLLZ;
    public final MediatorLiveData LLLLLLZZ;
    public final MutableLiveData<Unit> LLLLLZ;
    public final MutableLiveData LLLLLZIL;
    public final MutableLiveData<Unit> LLLLLZL;
    public final MutableLiveData LLLLZ;
    public final MutableLiveData<Unit> LLLLZI;
    public final MutableLiveData LLLLZIL;
    public final MutableLiveData<Unit> LLLLZLL;
    public final MutableLiveData LLLLZLLIL;
    public final LiveData<List<C817600W5m>> LLLLZLLLI;
    public final MediatorLiveData LLLZ;
    public final LiveData<List<C817600W5m>> LLLZI;
    public final MutableLiveData<Boolean> LLLZIIL;
    public final MutableLiveData LLLZIL;
    public boolean LLLZL;
    public final MutableLiveData<AvatarThoughtResult> LLLZLL;
    public final MutableLiveData<List<StoryNoteTextExtra>> LLLZLZ;

    public final String DQ2(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : "image" : "general_gradient" : "avatar_gradient";
    }

    public StoryThoughtAvatarCreationVM() {
        LiveData<List<C817600W5m>> liveDataLJII;
        C05YD<InterfaceC439080HJq> c05ydLIZIZ;
        MutableLiveData<Unit> mutableLiveData = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = mutableLiveData;
        this.LLILZ = C0HCN.LIZ() ? C15X1.SMALL_SCREEN : C15X1.NORMAL;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(334));
        this.LLILZIL = c01gwLIZIZ;
        IFriendInteractionSettingsService iFriendInteractionSettingsService = (IFriendInteractionSettingsService) PluggableExtentionKt.pluggableSpi$default(IFriendInteractionSettingsService.class, false, false, false, 14, null);
        StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig storyThoughtHolidayConfigLIZJ = iFriendInteractionSettingsService != null ? iFriendInteractionSettingsService.LIZJ() : null;
        this.LLILZLL = storyThoughtHolidayConfigLIZJ;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>("");
        this.LLIZ = mutableLiveData2;
        this.LLIZLLLIL = true;
        this.LLJ = C228000uM.LIZLLL(mutableLiveData2, new AwS610S0100000_31(this, 237));
        Boolean bool = Boolean.FALSE;
        this.LLJI = new DebounceMutableLiveData<>(bool);
        MutableLiveData<C817600W5m> mutableLiveData3 = new MutableLiveData<>(null);
        this.LLJIJIL = mutableLiveData3;
        List listLJJLL = C13LQ.LJJLL(C11GX.LIZ());
        Object obj = (storyThoughtHolidayConfigLIZJ == null || (obj = storyThoughtHolidayConfigLIZJ.backgroundImageList) == null) ? C13BV.INSTANCE : obj;
        if (!listLJJLL.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(listLJJLL);
            arrayList.addAll(1, obj);
            obj = arrayList;
        }
        MutableLiveData mutableLiveData4 = new MutableLiveData(obj);
        this.LLJILJIL = mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5 = new MutableLiveData<>(0);
        this.LLJILJILJ = mutableLiveData5;
        C20583115gT.LIZ.getClass();
        MutableLiveData mutableLiveData6 = new MutableLiveData(C20583115gT.LIZ());
        this.LLJILLL = mutableLiveData6;
        MutableLiveData<Integer> mutableLiveData7 = new MutableLiveData<>(0);
        this.LLJJ = mutableLiveData7;
        this.LLJJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(561));
        this.LLJJIII = new MutableLiveData<>(null);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 722));
        this.LLJLLL = new MutableLiveData<>(ComplianceServiceProvider.LJIJJ().LJJIIZ() ? EnumC20581215gA.ONLY_YOU : ((Boolean) C289440BWc.LIZIZ.getValue()).booleanValue() ? EnumC20581215gA.FRIENDS : EnumC20581215gA.EVERYONE);
        MediatorLiveData mediatorLiveDataLIZLLL = C228000uM.LIZLLL(mutableLiveData3, AFwS231S0000000_3.get$arr$(90));
        this.LLJZ = mediatorLiveDataLIZLLL;
        MutableLiveData<Boolean> mutableLiveData8 = new MutableLiveData<>(bool);
        this.LLJZIJLIL = mutableLiveData8;
        this.LLL = mutableLiveData8;
        MutableLiveData<EnumC1405120mfW> mutableLiveData9 = new MutableLiveData<>(EnumC1405120mfW.DEFAULT);
        this.LLLF = mutableLiveData9;
        this.LLLFF = mutableLiveData9;
        MutableLiveData<Boolean> mutableLiveData10 = new MutableLiveData<>(bool);
        this.LLLFFI = mutableLiveData10;
        this.LLLFZ = mutableLiveData10;
        Boolean bool2 = Boolean.TRUE;
        MutableLiveData<Boolean> mutableLiveData11 = new MutableLiveData<>(bool2);
        this.LLLI = mutableLiveData11;
        this.LLLII = mutableLiveData11;
        MutableLiveData<Boolean> mutableLiveData12 = new MutableLiveData<>(bool);
        this.LLLIIII = mutableLiveData12;
        SocialAvatarFastFlowService socialAvatarFastFlowService = (SocialAvatarFastFlowService) c01gwLIZIZ.getValue();
        LiveData<InterfaceC439080HJq> mutableLiveData13 = (socialAvatarFastFlowService == null || (c05ydLIZIZ = socialAvatarFastFlowService.LIZIZ(String.valueOf(JQ2()))) == null || (mutableLiveData13 = FlowLiveDataConversions.asLiveData(c05ydLIZIZ, C23271099x.INSTANCE, Mp4ScreenVideoLoadTimeout.CONTROL)) == null) ? new MutableLiveData<>(C1341405Mu.LIZ) : mutableLiveData13;
        this.LLLIIL = mutableLiveData13;
        this.LLLIILIL = C228000uM.LIZLLL(C228000uM.LIZ(mutableLiveData13, mutableLiveData12), AFwS231S0000000_3.get$arr$(92));
        MutableLiveData<EnumC339980DUm> mutableLiveData14 = new MutableLiveData<>(EnumC339980DUm.NONE);
        this.LLLIL = mutableLiveData14;
        this.LLLILZ = mutableLiveData14;
        MutableLiveData<EnumC20582815gQ> mutableLiveData15 = new MutableLiveData<>();
        this.LLLILZJ = mutableLiveData15;
        this.LLLILZLLLI = mutableLiveData15;
        MediatorLiveData mediatorLiveDataLIZLLL2 = C228000uM.LIZLLL(C228000uM.LIZIZ(mutableLiveData8, mutableLiveData10, mutableLiveData14), AFwS276S0000000_31.get$arr$(183));
        this.LLLIZZ = mediatorLiveDataLIZLLL2;
        MutableLiveData<EnumC1405120mfW> mutableLiveData16 = new MutableLiveData<>(null);
        this.LLLJ = mutableLiveData16;
        MediatorLiveData mediatorLiveDataLIZLLL3 = C228000uM.LIZLLL(C228000uM.LIZ(mediatorLiveDataLIZLLL2, mutableLiveData16), AFwS231S0000000_3.get$arr$(83));
        this.LLLJIL = mediatorLiveDataLIZLLL3;
        this.LLLJL = mediatorLiveDataLIZLLL3;
        this.LLLL = C228000uM.LIZLLL(C228000uM.LIZ(mediatorLiveDataLIZLLL2, mediatorLiveDataLIZLLL3), AFwS231S0000000_3.get$arr$(88));
        MutableLiveData<List<String>> mutableLiveData17 = new MutableLiveData<>();
        this.LLLLII = mutableLiveData17;
        this.LLLLIIIILLL = mutableLiveData17;
        this.LLLLIIL = new MutableLiveData<>();
        MutableLiveData<List<String>> mutableLiveData18 = new MutableLiveData<>();
        this.LLLLIILL = mutableLiveData18;
        this.LLLLIILLL = mutableLiveData18;
        MutableLiveData<List<String>> mutableLiveData19 = new MutableLiveData<>();
        this.LLLLIL = mutableLiveData19;
        this.LLLLILI = mutableLiveData19;
        this.LLLLJ = new MutableLiveData<>();
        this.LLLLJI = new MutableLiveData<>();
        this.LLLLL = new MutableLiveData<>();
        MutableLiveData<Long> mutableLiveData20 = new MutableLiveData<>(0L);
        this.LLLLLIL = mutableLiveData20;
        this.LLLLLILLIL = mutableLiveData20;
        MutableLiveData<Boolean> mutableLiveData21 = new MutableLiveData<>(bool2);
        this.LLLLLJIL = mutableLiveData21;
        this.LLLLLJLJLL = mutableLiveData21;
        this.LLLLLLL = C228000uM.LIZLLL(C228000uM.LIZ(mediatorLiveDataLIZLLL3, mutableLiveData11), AFwS231S0000000_3.get$arr$(87));
        MediatorLiveData mediatorLiveDataLIZLLL4 = C228000uM.LIZLLL(C228000uM.LIZIZ(mediatorLiveDataLIZLLL3, mutableLiveData4, mutableLiveData6), AFwS231S0000000_3.get$arr$(86));
        this.LLLLLLLLL = mediatorLiveDataLIZLLL4;
        this.LLLLLLLLLL = C228000uM.LIZLLL(C228000uM.LIZ(mediatorLiveDataLIZLLL4, C228000uM.LIZLLL(C228000uM.LIZIZ(mediatorLiveDataLIZLLL3, mutableLiveData5, mutableLiveData7), AFwS231S0000000_3.get$arr$(85))), AFwS231S0000000_3.get$arr$(84));
        MutableLiveData<Boolean> mutableLiveData22 = new MutableLiveData<>(bool);
        this.LLLLLLLZIL = mutableLiveData22;
        this.LLLLLLZ = C228000uM.LIZLLL(C228000uM.LIZ(mutableLiveData2, mutableLiveData22), AFwS231S0000000_3.get$arr$(91));
        this.LLLLLLZZ = C228000uM.LIZLLL(C228000uM.LIZIZ(mutableLiveData2, mediatorLiveDataLIZLLL3, mutableLiveData14), AFwS276S0000000_31.get$arr$(184));
        MutableLiveData<Unit> mutableLiveData23 = new MutableLiveData<>();
        this.LLLLLZ = mutableLiveData23;
        this.LLLLLZIL = mutableLiveData23;
        MutableLiveData<Unit> mutableLiveData24 = new MutableLiveData<>();
        this.LLLLLZL = mutableLiveData24;
        this.LLLLZ = mutableLiveData24;
        MutableLiveData<Unit> mutableLiveData25 = new MutableLiveData<>();
        this.LLLLZI = mutableLiveData25;
        this.LLLLZIL = mutableLiveData25;
        MutableLiveData<Unit> mutableLiveData26 = new MutableLiveData<>();
        this.LLLLZLL = mutableLiveData26;
        this.LLLLZLLIL = mutableLiveData26;
        IStoryThoughtDraftService iStoryThoughtDraftService = (IStoryThoughtDraftService) PluggableExtentionKt.pluggableSpi$default(IStoryThoughtDraftService.class, false, false, false, 14, null);
        LiveData<List<C817600W5m>> mutableLiveData27 = (iStoryThoughtDraftService == null || (mutableLiveData27 = iStoryThoughtDraftService.LJFF()) == null) ? new MutableLiveData<>(C13BV.INSTANCE) : mutableLiveData27;
        this.LLLLZLLLI = mutableLiveData27;
        this.LLLZ = C228000uM.LIZLLL(C228000uM.LIZIZ(mediatorLiveDataLIZLLL, mutableLiveData8, mutableLiveData27), AFwS231S0000000_3.get$arr$(89));
        IStoryThoughtDraftService iStoryThoughtDraftService2 = (IStoryThoughtDraftService) PluggableExtentionKt.pluggableSpi$default(IStoryThoughtDraftService.class, false, false, false, 14, null);
        this.LLLZI = (iStoryThoughtDraftService2 == null || (liveDataLJII = iStoryThoughtDraftService2.LJII()) == null) ? new MutableLiveData<>(C13BV.INSTANCE) : liveDataLJII;
        MutableLiveData<Boolean> mutableLiveData28 = new MutableLiveData<>(bool);
        this.LLLZIIL = mutableLiveData28;
        this.LLLZIL = mutableLiveData28;
        this.LLLZL = true;
        this.LLLZLL = new MutableLiveData<>(null);
        this.LLLZLZ = new MutableLiveData<>(C13BV.INSTANCE);
    }

    public final C20583215gU AQ2() {
        String creationId;
        Boolean bool = this.LLJLILLLLZIIL;
        Boolean bool2 = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(bool, bool2);
        String str = this.LLJJJJLIIL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        boolean zLJFF2 = Intrinsics.LJFF(this.LLL.getValue(), bool2);
        boolean zLJFF3 = Intrinsics.LJFF(this.LLLFZ.getValue(), bool2);
        String str3 = this.LLJJIJIL;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.LLJJJ;
        if (str4 == null) {
            str4 = "";
        }
        boolean z = this.LLJLL != null;
        GQ2();
        CreativeInfo creativeInfo = this.LLJJIJIIJIL;
        if (creativeInfo != null && (creationId = creativeInfo.getCreationId()) != null) {
            str2 = creationId;
        }
        return new C20583215gU(zLJFF, str, zLJFF2, zLJFF3, str3, str4, z, str2, this.LLJJJJJIL);
    }

    public final int EQ2() {
        if (this.LLLILZ.getValue() == EnumC339980DUm.FINISHED) {
            return 2;
        }
        return this.LLLILZ.getValue() == EnumC339980DUm.IN_PROGRESS ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int FQ2() {
        C817600W5m c817600W5m;
        List<String> list;
        if (!((Boolean) this.LLLZ.getValue()).booleanValue()) {
            return 0;
        }
        List<C817600W5m> value = this.LLLZI.getValue();
        return (value == null || (c817600W5m = (C817600W5m) C13LP.LJJJLL(value)) == null || (list = c817600W5m.avatarUrls) == null || C13LP.LJJJLL(list) == null) ? 1 : 2;
    }

    public final boolean GQ2() {
        return Intrinsics.LJFF(this.LLJZ.getValue(), Boolean.TRUE) && this.LLJLL == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int IQ2() {
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
            androidx.lifecycle.MediatorLiveData r0 = r4.LLLLLLLLLL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.model.story.BackgroundModel r0 = (com.ss.android.ugc.aweme.feed.model.story.BackgroundModel) r0
            java.lang.String r0 = r0.backgroundGeckoId
            boolean r0 = r3.contains(r0)
            r1 = 1
            if (r0 != r1) goto L2a
        L3d:
            androidx.lifecycle.MediatorLiveData r0 = r4.LLJ
            java.lang.Object r0 = r0.getValue()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.getSecond()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L54
            if (r1 != 0) goto L54
        L53:
            return r2
        L54:
            com.ss.android.ugc.aweme.story.experiment.thought.StoryThoughtHolidayConfigSettings$StoryThoughtHolidayConfig r0 = r4.LLILZLL
            if (r0 == 0) goto L53
            int r2 = r0.holidayType
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM.IQ2():int");
    }

    public final String JQ2() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return null;
        }
        return accountUserServiceLJIIJ.getCurUserId();
    }

    public final void KQ2() {
        this.LLLJ.setValue(EnumC1405120mfW.SOCIAL_AVATAR);
        this.LLLIL.setValue(EnumC339980DUm.NONE);
        this.LLLLLLLZIL.setValue(Boolean.TRUE);
        this.LLLLL.setValue(null);
        this.LLLLII.setValue(C13BV.INSTANCE);
        this.LLLLIIL.setValue("");
        AnonymousClass0956 anonymousClass0956 = this.LLLLLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NQ2() {
        /*
            r6 = this;
            androidx.lifecycle.MutableLiveData<X.0W5m> r0 = r6.LLJIJIL
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L55
            androidx.lifecycle.MutableLiveData<X.0W5m> r0 = r6.LLJIJIL
            java.lang.Object r0 = r0.getValue()
            X.0W5m r0 = (X.C817600W5m) r0
            if (r0 == 0) goto L53
            java.lang.String r1 = r0.taskId
        L14:
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r6.LLLLL
            java.lang.Object r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L55
            r5 = 2
        L21:
            X.15gG r0 = X.C20581815gG.LIZ
            X.15gU r4 = r6.AQ2()
            boolean r3 = r6.GQ2()
            r0.getClass()
            X.0LAB r2 = new X.0LAB
            r2.<init>()
            boolean r1 = r4.LIZJ
            boolean r0 = r4.LIZLLL
            X.C1609930rzr.LJIJJ(r2, r1, r0)
            java.lang.String r1 = "creation_id"
            java.lang.String r0 = r4.LJII
            r2.LJ(r1, r0)
            java.lang.String r0 = "is_draft"
            r2.LIZ(r3, r0)
            java.lang.String r0 = "toast_time"
            r2.LIZ(r5, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "generate_avatar_thought_fail_toast"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L53:
            r1 = 0
            goto L14
        L55:
            r5 = 1
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM.NQ2():void");
    }

    public final Map<String, String> vQ2() {
        String creationId;
        C20581815gG c20581815gG = C20581815gG.LIZ;
        Boolean bool = this.LLJLILLLLZIIL;
        Boolean bool2 = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(bool, bool2);
        String str = this.LLJJJJLIIL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        boolean zLJFF2 = Intrinsics.LJFF(this.LLL.getValue(), bool2);
        boolean zLJFF3 = Intrinsics.LJFF(this.LLLFZ.getValue(), bool2);
        String str3 = this.LLJJIJIL;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.LLJJJ;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = this.LLJJJJJIL;
        int i = this.LLJLL != null ? 1 : 0;
        CreativeInfo creativeInfo = this.LLJJIJIIJIL;
        if (creativeInfo != null && (creationId = creativeInfo.getCreationId()) != null) {
            str2 = creationId;
        }
        int iFQ2 = FQ2();
        c20581815gG.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(zLJFF ? 1 : 0, "has_avatar_prompt");
        c0lab.LJ("default_landing_status", str);
        C1609930rzr.LJIJJ(c0lab, zLJFF2, zLJFF3);
        c0lab.LJ("shoot_enter_from", str3);
        c0lab.LJ("shoot_enter_method", str4);
        c0lab.LJ("creation_id", str2);
        c0lab.LIZ(i, "is_avatar_thought_asynchronous_generated");
        c0lab.LIZ(str5 == null ? 0 : 1, "is_avatar_thought_try_it_out");
        c0lab.LIZ(iFQ2, "draft_status");
        if (str5 != null) {
            c0lab.LJ("try_it_out_position", str5);
        }
        return c0lab.LIZ;
    }

    public final C1404940mfE wQ2() {
        CreativeInfo creativeInfo = this.LLJJIJIIJIL;
        int value = this.LLJLLL.getValue().getValue();
        String str = this.LLJJIJIL;
        if (str == null) {
            str = "";
        }
        String str2 = this.LLJJJ;
        C1404940mfE c1404940mfE = new C1404940mfE(creativeInfo, value, str2 != null ? str2 : "", str, null, 112);
        if (this.LLJJJJ) {
            c1404940mfE.LJFF = StoryUploadPageEntranceType.THOUGHT;
        }
        return c1404940mfE;
    }

    public final int zQ2() {
        if (this.LLLILZ.getValue() == EnumC339980DUm.FINISHED) {
            return 1;
        }
        return this.LLLILZ.getValue() == EnumC339980DUm.IN_PROGRESS ? 2 : 3;
    }

    public final String BQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("story_thought_avatar_thoughts_landing_type_");
        sbLIZ.append(JQ2());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String CQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("story_thought_avatar_thoughts_upgrade_popup_shown_");
        sbLIZ.append(JQ2());
        return C2188811AlT.LIZIZ(sbLIZ);
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

    public final String HQ2(EnumC1405120mfW enumC1405120mfW) {
        EnumC1405120mfW enumC1405120mfW2 = EnumC1405120mfW.GENERATED_AVATAR;
        if (enumC1405120mfW == enumC1405120mfW2 && this.LLLILZ.getValue() == EnumC339980DUm.IN_PROGRESS) {
            return "avatar_thought_loading";
        }
        if (enumC1405120mfW == enumC1405120mfW2 && this.LLLILZ.getValue() == EnumC339980DUm.FINISHED) {
            return "avatar_thought";
        }
        if (enumC1405120mfW == EnumC1405120mfW.SOCIAL_AVATAR) {
            return "avatar_head";
        }
        return "pic_head";
    }

    public final void LQ2(String str) {
        int i;
        C20581815gG c20581815gG = C20581815gG.LIZ;
        C20583215gU c20583215gUAQ2 = AQ2();
        c20581815gG.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", c20583215gUAQ2.LJ);
        c0lab.LJ("shoot_enter_from", c20583215gUAQ2.LJ);
        c0lab.LJ("shoot_enter_method", c20583215gUAQ2.LJFF);
        if (c20583215gUAQ2.LJIIIIZZ != null) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_avatar_thought_try_it_out");
        c0lab.LJ("creation_id", c20583215gUAQ2.LJII);
        c0lab.LJ("action_type", str);
        String str2 = c20583215gUAQ2.LJIIIIZZ;
        if (str2 != null) {
            c0lab.LJ("try_it_out_position", str2);
        }
        C20684815ws.LJIILLIIL("avatar_thought_pop_up_banner", c0lab.LIZ);
    }

    public final void MQ2(String str) {
        if (GQ2()) {
            C20581815gG c20581815gG = C20581815gG.LIZ;
            C20583215gU c20583215gUAQ2 = AQ2();
            int iEQ2 = EQ2();
            c20581815gG.getClass();
            C0LAB c0labLIZ = C20581815gG.LIZ(c20583215gUAQ2);
            c0labLIZ.LIZ(iEQ2, "draft_item_status_final");
            c0labLIZ.LJ("result", str);
            C20684815ws.LJIILLIIL("thought_draft_exit_popup_results", c0labLIZ.LIZ);
            return;
        }
        C20581815gG c20581815gG2 = C20581815gG.LIZ;
        C20583215gU c20583215gUAQ22 = AQ2();
        boolean zGQ2 = GQ2();
        int iZQ2 = zQ2();
        c20581815gG2.getClass();
        C0LAB c0labLIZ2 = C20581815gG.LIZ(c20583215gUAQ22);
        c0labLIZ2.LIZ(zGQ2 ? 1 : 0, "is_draft");
        c0labLIZ2.LIZ(iZQ2, "avatar_thought_creation_status");
        c0labLIZ2.LJ("shoot_way", "story");
        c0labLIZ2.LJ("to_status", str);
        C20684815ws.LJIILLIIL("exit_shoot_popup_result", c0labLIZ2.LIZ);
    }

    public final void PQ2(String str) {
        int i;
        C20581815gG c20581815gG = C20581815gG.LIZ;
        C20583215gU c20583215gUAQ2 = AQ2();
        c20581815gG.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", c20583215gUAQ2.LJ);
        c0lab.LJ("shoot_enter_from", c20583215gUAQ2.LJ);
        c0lab.LJ("shoot_enter_method", c20583215gUAQ2.LJFF);
        if (c20583215gUAQ2.LJIIIIZZ != null) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_avatar_thought_try_it_out");
        c0lab.LJ("creation_id", c20583215gUAQ2.LJII);
        c0lab.LJ("action", str);
        C1609930rzr.LJIJJ(c0lab, c20583215gUAQ2.LIZJ, c20583215gUAQ2.LIZLLL);
        String str2 = c20583215gUAQ2.LJIIIIZZ;
        if (str2 != null) {
            c0lab.LJ("try_it_out_position", str2);
        }
        C20684815ws.LJIILLIIL("upgrade_avatar_pop_up", c0lab.LIZ);
    }

    public final void QQ2(Function1<? super Integer, Unit> function1) {
        this.LLLLLLLZIL.setValue(Boolean.FALSE);
        this.LLLLLL = false;
        C20581815gG c20581815gG = C20581815gG.LIZ;
        C20583215gU c20583215gUAQ2 = AQ2();
        boolean zGQ2 = GQ2();
        c20581815gG.getClass();
        C0LAB c0labLIZ = C20581815gG.LIZ(c20583215gUAQ2);
        c0labLIZ.LIZ(zGQ2 ? 1 : 0, "is_draft");
        c0labLIZ.LIZ(0, "click_result");
        C20684815ws.LJIILLIIL("click_generate_avatar_thought", c0labLIZ.LIZ);
        AnonymousClass0956 anonymousClass0956 = this.LLLLLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLLLLIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C20581515gD(this, function1, null), 2);
    }

    public final void RQ2(Function1<? super Integer, Unit> function1) {
        C1257100iom c1257100iom;
        this.LLLIIIL = true;
        T value = this.LLLII.getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(value, bool)) {
            QQ2(function1);
            return;
        }
        InterfaceC439080HJq value2 = this.LLLIIL.getValue();
        if (value2 instanceof C0HK4) {
            SQ2(function1);
            this.LLLIIII.setValue(bool);
            return;
        }
        if (!(value2 instanceof C0HK3) && !(value2 instanceof C1372105Yp)) {
            this.LLLLLZ.setValue(Unit.LIZ);
            C20581815gG c20581815gG = C20581815gG.LIZ;
            C20583215gU c20583215gUAQ2 = AQ2();
            boolean zGQ2 = GQ2();
            c20581815gG.getClass();
            C0LAB c0labLIZ = C20581815gG.LIZ(c20583215gUAQ2);
            c0labLIZ.LIZ(zGQ2 ? 1 : 0, "is_draft");
            c0labLIZ.LIZ(1, "click_result");
            C20684815ws.LJIILLIIL("click_generate_avatar_thought", c0labLIZ.LIZ);
            return;
        }
        QQ2(function1);
        String strJQ2 = JQ2();
        if (strJQ2 == null || (c1257100iom = (C1257100iom) ((LinkedHashMap) C1257120ioo.LIZIZ).get(strJQ2)) == null) {
            return;
        }
        c1257100iom.LIZJ = bool;
    }

    public final void SQ2(Function1<? super Integer, Unit> function1) {
        this.LLLLLLLZIL.setValue(Boolean.FALSE);
        this.LLLIL.setValue(EnumC339980DUm.UPLOADING);
        List list = (List) this.LLLIZZ.getValue();
        EnumC1405120mfW enumC1405120mfW = EnumC1405120mfW.GENERATED_AVATAR;
        function1.invoke(Integer.valueOf(list.indexOf(enumC1405120mfW)));
        this.LLLJ.setValue(enumC1405120mfW);
    }

    public final void WQ2(int i) {
        if (this.LLLJL.getValue() == EnumC1405120mfW.DEFAULT) {
            this.LLJILJILJ.setValue(Integer.valueOf(i));
        } else {
            this.LLJJ.setValue(Integer.valueOf(i));
        }
    }

    public final void XQ2(String str) {
        List list = (List) this.LLLLLLLLL.getValue();
        int iIntValue = 0;
        if (list != null) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(((BackgroundModel) it2.next()).backgroundGeckoId, str)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf != null && numValueOf.intValue() != -1 && numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        WQ2(iIntValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C20582515gN
            if (r0 == 0) goto L6c
            r4 = r13
            X.15gN r4 = (X.C20582515gN) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L53
            if (r0 != r5) goto L72
            X.C155000ia.LIZIZ(r6)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r6)
            androidx.lifecycle.MutableLiveData<X.0W5m> r0 = r12.LLJIJIL
            java.lang.Object r1 = r0.getValue()
            X.0W5m r1 = (X.C817600W5m) r1
            if (r1 != 0) goto L38
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L38:
            java.lang.Class<com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService> r6 = com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService.class
            r7 = 0
            r10 = 14
            r11 = 0
            r8 = r7
            r9 = r7
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService r0 = (com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService) r0
            if (r0 == 0) goto L58
            r4.LL = r1
            r4.LLILZ = r2
            java.lang.Object r0 = r0.LJIIIZ(r1, r4)
            if (r0 != r3) goto L58
            return r3
        L53:
            X.0W5m r1 = r4.LL
            X.C155000ia.LIZIZ(r6)
        L58:
            X.15gb r2 = X.C20583915gb.LIZ
            java.lang.String r0 = r1.taskId
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 0
            r4.LL = r0
            r4.LLILZ = r5
            java.lang.Object r0 = r2.LIZ(r1, r4)
            if (r0 != r3) goto L25
            return r3
        L6c:
            X.15gN r4 = new X.15gN
            r4.<init>(r12, r13)
            goto L12
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM.yQ2(X.05Vn):java.lang.Object");
    }

    public final void OQ2(Pair<String, String> pair, Pair<String, String> pair2) {
        String first;
        String second;
        String first2;
        C20581815gG c20581815gG = C20581815gG.LIZ;
        C20583215gU c20583215gUAQ2 = AQ2();
        c20581815gG.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", c20583215gUAQ2.LJII);
        String second2 = null;
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        c0lab.LJ("from_background", first);
        if (pair != null) {
            second = pair.getSecond();
        } else {
            second = null;
        }
        c0lab.LJ("from_bg_gecko_id", second);
        if (pair2 != null) {
            first2 = pair2.getFirst();
        } else {
            first2 = null;
        }
        c0lab.LJ("to_background", first2);
        if (pair2 != null) {
            second2 = pair2.getSecond();
        }
        c0lab.LJ("to_bg_gecko_id", second2);
        c0lab.LIZ(c20583215gUAQ2.LIZ ? 1 : 0, "has_avatar_prompt");
        c0lab.LJ("default_landing_status", c20583215gUAQ2.LIZIZ);
        C1609930rzr.LJIJJ(c0lab, c20583215gUAQ2.LIZJ, c20583215gUAQ2.LIZLLL);
        C20684815ws.LJIILLIIL("note_edit_change_color", c0lab.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x019b, code lost:
    
        if (r2 != 0) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:14:0x002c, B:62:0x0112], limit reached: 91 */
    /* JADX WARN: Path cross not found for [B:52:0x00e4, B:56:0x00f4], limit reached: 91 */
    /* JADX WARN: Path cross not found for [B:56:0x00f4, B:48:0x00d4], limit reached: 91 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019f  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0131 -> B:88:0x019b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0141 -> B:12:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object TQ2(java.lang.String r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM.TQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f4 -> B:14:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object UQ2(android.content.Context r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM.UQ2(android.content.Context, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object VQ2(android.content.Context r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            r18 = this;
            r4 = r20
            r6 = r19
            boolean r0 = r4 instanceof X.C20582415gM
            r3 = r18
            if (r0 == 0) goto L8f
            r11 = r4
            X.15gM r11 = (X.C20582415gM) r11
            int r2 = r11.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r11.LLILZIL = r2
        L18:
            java.lang.Object r5 = r11.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r11.LLILZIL
            r13 = 0
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 == r1) goto L56
            if (r0 != r4) goto L95
            X.C155000ia.LIZIZ(r5)
        L2c:
            androidx.lifecycle.MutableLiveData<kotlin.Unit> r1 = r3.LLLLZLL
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r1.postValue(r0)
            return r0
        L34:
            X.C155000ia.LIZIZ(r5)
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r3.LLLLL
            java.lang.Object r7 = r0.getValue()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L9d
            int r0 = r7.length()
            if (r0 == 0) goto L9d
            X.15gb r0 = X.C20583915gb.LIZ
            r11.LL = r6
            r11.LLILLJJLI = r7
            r11.LLILZIL = r1
            java.lang.Object r0 = r0.LJ(r7, r11)
            if (r0 != r2) goto L61
            return r2
        L56:
            java.lang.Object r7 = r11.LLILLJJLI
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r11.LL
            android.content.Context r6 = (android.content.Context) r6
            X.C155000ia.LIZIZ(r5)
        L61:
            r1 = 0
            com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel r8 = r3.xQ2(r1, r13)
            X.0mfE r9 = r3.wQ2()
            java.lang.Class<com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService> r12 = com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService.class
            r16 = 14
            r14 = r13
            r15 = r13
            r17 = r1
            java.lang.Object r5 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r12, r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService r5 = (com.ss.android.ugc.aweme.story.note.draft.IStoryThoughtDraftService) r5
            if (r5 == 0) goto L2c
            androidx.lifecycle.MutableLiveData<com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResult> r0 = r3.LLLZLL
            java.lang.Object r10 = r0.getValue()
            com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResult r10 = (com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResult) r10
            r11.LL = r1
            r11.LLILLJJLI = r1
            r11.LLILZIL = r4
            java.lang.Object r0 = r5.LJIIIIZZ(r6, r7, r8, r9, r10, r11)
            if (r0 != r2) goto L2c
            return r2
        L8f:
            X.15gM r11 = new X.15gM
            r11.<init>(r3, r4)
            goto L18
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM.VQ2(android.content.Context, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017c A[PHI: r3
      0x017c: PHI (r3v11 java.util.List<java.lang.String>) = (r3v10 java.util.List<java.lang.String>), (r3v13 java.util.List<java.lang.String>) binds: [B:48:0x0179, B:44:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019f A[PHI: r3
      0x019f: PHI (r3v1 java.util.List<java.lang.String>) = (r3v0 java.util.List<java.lang.String>), (r3v3 java.util.List<java.lang.String>) binds: [B:61:0x019c, B:57:0x0190] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel xQ2(java.lang.String r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationVM.xQ2(java.lang.String, boolean):com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel");
    }
}
