package com.ss.android.ugc.aweme.im.sharepanel.impl.share.viewmodel;

import X.C01GW;
import X.C0I0B;
import X.C0Z6T;
import X.C1370970lmR;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1364450lbv;
import X.EnumC1367900lhU;
import X.InterfaceC1362600lYw;
import X.InterfaceC1365380ldQ;
import X.InterfaceC1368700lim;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics;
import com.ss.android.ugc.aweme.im.service.service.IIMContentService;
import com.ss.android.ugc.aweme.im.sharepanel.api.experiment.ForwardLimitSetting;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareDialogViewModel extends ViewModel {
    public final SharePackage LL;
    public final InterfaceC1368700lim LLILLJJLI;
    public final boolean LLILLL;
    public final InterfaceC1362600lYw LLILZ = null;
    public final LiveData<String> LLILZIL;
    public final LiveData<List<IMContact>> LLILZLL;
    public final LiveData<List<IMContact>> LLIZ;
    public final LiveData<EnumC1367900lhU> LLIZLLLIL;
    public final MutableLiveData<List<IMContact>> LLJ;
    public final MutableLiveData<Boolean> LLJI;
    public final MutableLiveData<Boolean> LLJIJIL;
    public final MutableLiveData<Boolean> LLJILJIL;
    public final MutableLiveData<Boolean> LLJILJILJ;
    public final LiveData<Boolean> LLJILLL;
    public final MutableLiveData<Boolean> LLJJ;
    public final MutableLiveData<Integer> LLJJI;
    public final List<IMContact> LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public String LLJJJJ;
    public int LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final MutableLiveData<Boolean> LLJJL;

    public final void refresh() {
        this.LLILLJJLI.refresh();
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZIZ().LJIJI(null, EnumC1364450lbv.SOURCE_ACTION_OPEN_PANEL.getValue(), null);
    }

    public final boolean vQ2() {
        List<IMContact> value = this.LLJ.getValue();
        if (value == null || !((Boolean) this.LLJJJJLIIL.getValue()).booleanValue()) {
            return false;
        }
        int iLIZ = ForwardLimitSetting.LIZ(this.LLJJJJJIL);
        int iLJIIL = ((InterfaceC1365380ldQ) this.LLJJJIL.getValue()).LJIIL(this.LLJJJJJIL, this.LLJJJJ);
        if (iLIZ < 0) {
            return false;
        }
        if (iLJIIL < 0) {
            return value.size() >= iLIZ - 1;
        }
        return value.size() >= Math.min(iLIZ, iLJIIL) - 1;
    }

    public final boolean wQ2() {
        List<IMContact> value = this.LLJ.getValue();
        if (value == null || !((Boolean) this.LLJJJJLIIL.getValue()).booleanValue()) {
            return false;
        }
        int iLIZ = ForwardLimitSetting.LIZ(this.LLJJJJJIL);
        int iLJIIL = ((InterfaceC1365380ldQ) this.LLJJJIL.getValue()).LJIIL(this.LLJJJJJIL, this.LLJJJJ);
        if (iLIZ < 0) {
            return false;
        }
        if (iLJIIL < 0) {
            return value.size() >= iLIZ;
        }
        return value.size() >= Math.min(iLIZ, iLJIIL);
    }

    public final boolean zQ2() {
        Integer value = this.LLJJI.getValue();
        return value != null && value.intValue() == 1;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLJJLI.onCleared();
    }

    public final void AQ2(List<? extends IMContact> list) {
        String str;
        IMUser iMUser;
        int iIndexOf;
        this.LLJ.setValue(list);
        ArrayList<IMContact> arrayList = new ArrayList();
        for (IMContact iMContact : list) {
            if (!((ArrayList) this.LLJJIII).contains(iMContact)) {
                arrayList.add(iMContact);
            }
        }
        for (IMContact iMContact2 : arrayList) {
            SharePackage sharePackage = this.LL;
            if (!zQ2()) {
                List<IMContact> value = this.LLIZ.getValue();
                if (value != null) {
                    iIndexOf = value.indexOf(iMContact2);
                } else {
                    iIndexOf = 0;
                }
                sharePackage.extras.putInt("rank_num", iIndexOf);
            }
            Bundle bundle = sharePackage.extras;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            boolean z = iMContact2 instanceof IMUser;
            Integer numValueOf = null;
            if (z && (iMUser = (IMUser) iMContact2) != null) {
                numValueOf = Integer.valueOf(iMUser.getFollowStatus());
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append("");
            C786410Ut5.LJJJI("relation_tag", C2188811AlT.LIZIZ(sbLIZ), bundle);
            InterfaceC1362600lYw interfaceC1362600lYw = this.LLILZ;
            if (interfaceC1362600lYw != null) {
                interfaceC1362600lYw.LJIIJ(sharePackage, "chat_mergeIM");
            }
            IInternalShareApi.LIZ.getClass();
            C1370970lmR.LIZ().LIZJ().LJJII(sharePackage, iMContact2, "chat_list", System.currentTimeMillis(), C0I0B.LJFF.LIZIZ(), C0I0B.LJFF.LIZIZ());
            C0Z6T c0z6t = (C0Z6T) this.LLJJIJI.getValue();
            if (c0z6t != null && c0z6t.LIZLLL(this.LL)) {
                if (z) {
                    str = "user";
                } else {
                    str = "group";
                }
                ((IIMChatDetailAnalytics) this.LLJJIJIIJIL.getValue()).LJ(str, C0I0B.LJFF.LIZIZ());
            }
        }
        ((ArrayList) this.LLJJIII).clear();
        ((ArrayList) this.LLJJIII).addAll(list);
    }

    public final String xQ2(SharePackage sharePackage) {
        BaseTemplate baseTemplate;
        BaseRequestComponent baseRequestComponentRj;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        String str;
        BaseTemplate baseTemplate2;
        if (!Intrinsics.LJFF(sharePackage.itemType, "video_sticker")) {
            IIMContentService iIMContentService = (IIMContentService) this.LLJJJ.getValue();
            SendMessageTemplateTask sendMessageTemplateTask = sharePackage.sendMessageTemplateTask;
            if (sendMessageTemplateTask != null) {
                baseTemplate2 = sendMessageTemplateTask.template;
            } else {
                baseTemplate2 = null;
            }
            if (!iIMContentService.LIZ(baseTemplate2)) {
                if (!Intrinsics.LJFF(sharePackage.itemType, "gif")) {
                    return "";
                }
                return sharePackage.extras.getString("sticker_id", "");
            }
        }
        SendMessageTemplateTask sendMessageTemplateTask2 = sharePackage.sendMessageTemplateTask;
        if (sendMessageTemplateTask2 == null || (baseTemplate = sendMessageTemplateTask2.template) == null || (baseRequestComponentRj = baseTemplate.rj()) == null || (queryDataComponent = baseRequestComponentRj.queryData) == null || (map = queryDataComponent.extras) == null || (str = map.get("a:sticker_id")) == null) {
            return "";
        }
        return str;
    }

    public final String yQ2(SharePackage sharePackage) {
        BaseTemplate baseTemplate;
        BaseRequestComponent baseRequestComponentRj;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        String str;
        BaseTemplate baseTemplate2;
        Integer numLJIIJJI = null;
        if (!Intrinsics.LJFF(sharePackage.itemType, "video_sticker")) {
            IIMContentService iIMContentService = (IIMContentService) this.LLJJJ.getValue();
            SendMessageTemplateTask sendMessageTemplateTask = sharePackage.sendMessageTemplateTask;
            if (sendMessageTemplateTask != null) {
                baseTemplate2 = sendMessageTemplateTask.template;
            } else {
                baseTemplate2 = null;
            }
            if (!iIMContentService.LIZ(baseTemplate2)) {
                if (Intrinsics.LJFF(sharePackage.itemType, "gif")) {
                    return "giphy";
                }
                return "";
            }
        }
        IIMEmojiAnalytics iIMEmojiAnalytics = (IIMEmojiAnalytics) this.LLJJIJIL.getValue();
        SendMessageTemplateTask sendMessageTemplateTask2 = sharePackage.sendMessageTemplateTask;
        if (sendMessageTemplateTask2 != null && (baseTemplate = sendMessageTemplateTask2.template) != null && (baseRequestComponentRj = baseTemplate.rj()) != null && (queryDataComponent = baseRequestComponentRj.queryData) != null && (map = queryDataComponent.extras) != null && (str = map.get("a:sticker_type")) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str);
        }
        return iIMEmojiAnalytics.LIZ(numLJIIJJI);
    }

    public ShareDialogViewModel(SharePackage sharePackage, InterfaceC1368700lim interfaceC1368700lim, boolean z) {
        this.LL = sharePackage;
        this.LLILLJJLI = interfaceC1368700lim;
        this.LLILLL = z;
        C786410Ut5.LJJJI("position", "search_page", sharePackage.extras);
        ((IIMAnalyticsUtil) ServiceManager.get().getService(IIMAnalyticsUtil.class)).LJII();
        this.LLILZIL = interfaceC1368700lim.LIZLLL();
        this.LLILZLL = interfaceC1368700lim.LIZJ();
        MutableLiveData mutableLiveDataLIZ = interfaceC1368700lim.LIZ();
        this.LLIZ = mutableLiveDataLIZ;
        this.LLIZLLLIL = interfaceC1368700lim.getState();
        this.LLJ = new MutableLiveData<>();
        this.LLJI = new MutableLiveData<>();
        this.LLJIJIL = new MutableLiveData<>();
        this.LLJILJIL = new MutableLiveData<>();
        this.LLJILJILJ = new MutableLiveData<>();
        this.LLJILLL = Transformations.map(mutableLiveDataLIZ, new AwS583S0100000_4(this, 2));
        this.LLJJ = new MutableLiveData<>();
        this.LLJJI = new MutableLiveData<>();
        this.LLJJIII = new ArrayList();
        this.LLJJIJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(16));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(14));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(11));
        this.LLJJJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(15));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(17));
        this.LLJJJJ = "";
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 32));
        this.LLJJL = new MutableLiveData<>();
    }
}
