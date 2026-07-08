package com.ss.android.ugc.aweme.internalshare.impl.more;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0CNA;
import X.C0I0B;
import X.C0PEM;
import X.C0Z6T;
import X.C1368200lhy;
import X.C1368560liY;
import X.C1368640lig;
import X.C1368750lir;
import X.C1370970lmR;
import X.C1DFH;
import X.C2095008Iq;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C296750Bk9;
import X.C328280Ctu;
import X.C443101nx;
import X.C443201ny;
import X.C452501pT;
import X.C786410Ut5;
import X.C866950Xzh;
import X.EnumC1364450lbv;
import X.EnumC1368950ljB;
import X.InterfaceC1362600lYw;
import X.InterfaceC1365380ldQ;
import X.InterfaceC1368670lij;
import Y.AObserverS224S0100000_21;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareMoreViewModel extends ViewModel {
    public final SharePackage LL;
    public final InterfaceC1368670lij LLILLJJLI;
    public final InterfaceC1362600lYw LLILZ;
    public int LLILZIL;
    public final String LLILZLL;
    public final MutableLiveData LLIZLLLIL;
    public final MutableLiveData LLJ;
    public final AObserverS224S0100000_21 LLJI;
    public final MutableLiveData LLJIJIL;
    public final MutableLiveData LLJILJIL;
    public final LiveData<EnumC1368950ljB> LLJILJILJ;
    public final MutableLiveData<List<IMContact>> LLJILLL;
    public final NextLiveData<String> LLJJ;
    public final MutableLiveData<Boolean> LLJJI;
    public final MutableLiveData<Boolean> LLJJIII;
    public final MutableLiveData<Boolean> LLJJIJI;
    public final LiveData<Boolean> LLJJIJIIJIL;
    public final MutableLiveData<Boolean> LLJJIJIL;
    public final MutableLiveData<Boolean> LLJJJ;
    public final MutableLiveData<Integer> LLJJJIL;
    public final List<IMContact> LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public String LLJLIL;
    public int LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final boolean LLILLL = true;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(687));

    public final boolean AQ2() {
        Integer value = this.LLJJJIL.getValue();
        return value != null && value.intValue() == 1;
    }

    public final void refresh() {
        this.LLILLJJLI.refresh();
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZIZ().LJIJI(null, EnumC1364450lbv.SOURCE_ACTION_OPEN_PANEL.getValue(), null);
    }

    public final boolean vQ2() {
        List<IMContact> value = this.LLJILLL.getValue();
        if (value == null || !((Boolean) this.LLJLL.getValue()).booleanValue()) {
            return false;
        }
        int iLIZ = ForwardLimitSetting.LIZ(this.LLJLILLLLZIIL);
        int iLJIIL = ((InterfaceC1365380ldQ) this.LLJL.getValue()).LJIIL(this.LLJLILLLLZIIL, this.LLJLIL);
        if (iLIZ < 0) {
            return false;
        }
        if (iLJIIL < 0) {
            return value.size() >= iLIZ - 1;
        }
        return value.size() >= Math.min(iLIZ, iLJIIL) - 1;
    }

    public final boolean wQ2() {
        List<IMContact> value = this.LLJILLL.getValue();
        if (value == null || !((Boolean) this.LLJLL.getValue()).booleanValue()) {
            return false;
        }
        int iLIZ = ForwardLimitSetting.LIZ(this.LLJLILLLLZIIL);
        int iLJIIL = ((InterfaceC1365380ldQ) this.LLJL.getValue()).LJIIL(this.LLJLILLLLZIIL, this.LLJLIL);
        if (iLIZ < 0) {
            return false;
        }
        if (iLJIIL < 0) {
            return value.size() >= iLIZ;
        }
        return value.size() >= Math.min(iLIZ, iLJIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String xQ2() {
        String str = (String) this.LLIZLLLIL.getValue();
        return str == null ? "" : str;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLJ.removeObserver(this.LLJI);
        this.LLILLJJLI.onCleared();
    }

    public final List<IMContact> BQ2(List<IMContact> list) {
        List listLJJLIIIJILLIZJL;
        String string = this.LL.extras.getString("select_uid_list");
        if (string != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6)) != null) {
            boolean z = false;
            for (Object obj : listLJJLIIIJILLIZJL) {
                ArrayList arrayList = (ArrayList) list;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        BaseContact baseContact = (BaseContact) it2.next();
                        if ((baseContact instanceof IMUser) && Intrinsics.LJFF(baseContact.getUid(), obj)) {
                            arrayList.remove(baseContact);
                            ListProtector.add(list, 0, baseContact);
                            CQ2(Collections.singletonList(baseContact));
                            this.LL.extras.remove("selected_uid");
                            z = true;
                            break;
                        }
                    }
                }
            }
            if (z) {
                return list;
            }
        }
        String string2 = this.LL.extras.getString("selected_uid");
        if (C866950Xzh.LIZ(string2) && string2 != null) {
            ArrayList arrayList2 = (ArrayList) list;
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                IMContact iMContact = (IMContact) it3.next();
                if ((iMContact instanceof IMUser) && Intrinsics.LJFF(iMContact.getUid(), string2)) {
                    if (iMContact.getType() != 3 && iMContact.getType() != 0) {
                        arrayList2.remove(iMContact);
                        ListProtector.add(list, 0, iMContact);
                    } else {
                        IMUser iMUserClone = ((IMUser) iMContact).clone();
                        iMUserClone.setType(-1);
                        ListProtector.add(list, 0, iMUserClone);
                    }
                    CQ2(Collections.singletonList(iMContact));
                    this.LL.extras.remove("selected_uid");
                }
            }
            if ((this.LLJILLL.getValue() == null || !(!r0.isEmpty())) && this.LL.extras.getBoolean("from_open_platform")) {
                this.LLJJI.setValue(Boolean.TRUE);
                return list;
            }
        }
        return list;
    }

    public final void CQ2(List<? extends IMContact> list) {
        String str;
        IMUser iMUser;
        int iIndexOf;
        this.LLJILLL.setValue(list);
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : list) {
            if (!((ArrayList) this.LLJJJJ).contains(iMContact)) {
                arrayList.add(iMContact);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            Integer numValueOf = null;
            if (!it2.hasNext()) {
                break;
            }
            IMContact iMContact2 = (IMContact) it2.next();
            SharePackage sharePackage = this.LL;
            if (!AQ2()) {
                List list2 = (List) this.LLJILJIL.getValue();
                if (list2 != null) {
                    iIndexOf = list2.indexOf(iMContact2);
                } else {
                    iIndexOf = 0;
                }
                sharePackage.extras.putInt("rank_num", iIndexOf);
            }
            Bundle bundle = sharePackage.extras;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            boolean z = iMContact2 instanceof IMUser;
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
            if (((C0Z6T) this.LLJJJJJIL.getValue()).LIZLLL(this.LL)) {
                if (z) {
                    str = "user";
                } else {
                    str = "group";
                }
                ((IIMChatDetailAnalytics) this.LLJJJJLIIL.getValue()).LJ(str, C0I0B.LJFF.LIZIZ());
            }
        }
        ((ArrayList) this.LLJJJJ).clear();
        ((ArrayList) this.LLJJJJ).addAll(list);
        if (Intrinsics.LJFF(this.LL.itemType, "minis")) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C328280Ctu(list, this, null), 3);
        }
    }

    public final void LJJZZIII(String str) {
        if (C296750Bk9.LIZ()) {
            this.LLILZIL++;
            IInternalShareApi.LIZ.getClass();
            C1370970lmR.LIZ().LIZJ().LJJIIJ();
        }
        if (C0CNA.LIZ()) {
            this.LLILLJJLI.LJLIIL(str);
            return;
        }
        if (C1368200lhy.LIZ()) {
            this.LLILLJJLI.LIZIZ(str, "social_search_matcher");
            return;
        }
        if (C1368750lir.LIZJ()) {
            C443201ny c443201ny = (C443201ny) this.LLIZ.getValue();
            C1368640lig c1368640lig = new C1368640lig(this, null);
            AnonymousClass0956 anonymousClass0956 = c443201ny.LIZIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            c443201ny.LIZIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C443101nx(c443201ny, c1368640lig, str, null), 3);
            return;
        }
        this.LLILLJJLI.LJJZZIII(str);
    }

    public final String yQ2(SharePackage sharePackage) {
        BaseTemplate baseTemplate;
        BaseRequestComponent baseRequestComponentRj;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        String str;
        BaseTemplate baseTemplate2;
        if (!Intrinsics.LJFF(sharePackage.itemType, "video_sticker")) {
            IIMContentService iIMContentService = (IIMContentService) this.LLJJLIIIJLLLLLLLZ.getValue();
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

    public final String zQ2(SharePackage sharePackage) {
        BaseTemplate baseTemplate;
        BaseRequestComponent baseRequestComponentRj;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        String str;
        BaseTemplate baseTemplate2;
        Integer numLJIIJJI = null;
        if (!Intrinsics.LJFF(sharePackage.itemType, "video_sticker")) {
            IIMContentService iIMContentService = (IIMContentService) this.LLJJLIIIJLLLLLLLZ.getValue();
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
        IIMEmojiAnalytics iIMEmojiAnalytics = (IIMEmojiAnalytics) this.LLJJL.getValue();
        SendMessageTemplateTask sendMessageTemplateTask2 = sharePackage.sendMessageTemplateTask;
        if (sendMessageTemplateTask2 != null && (baseTemplate = sendMessageTemplateTask2.template) != null && (baseRequestComponentRj = baseTemplate.rj()) != null && (queryDataComponent = baseRequestComponentRj.queryData) != null && (map = queryDataComponent.extras) != null && (str = map.get("a:sticker_type")) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str);
        }
        return iIMEmojiAnalytics.LIZ(numLJIIJJI);
    }

    public ShareMoreViewModel(SharePackage sharePackage, InterfaceC1368670lij interfaceC1368670lij, InterfaceC1362600lYw interfaceC1362600lYw) {
        this.LL = sharePackage;
        this.LLILLJJLI = interfaceC1368670lij;
        this.LLILZ = interfaceC1362600lYw;
        this.LLILZLL = "";
        this.LLILZLL = UUID.randomUUID().toString();
        C786410Ut5.LJJJI("position", "search_page", sharePackage.extras);
        ((IIMAnalyticsUtil) ServiceManager.get().getService(IIMAnalyticsUtil.class)).LJII();
        this.LLIZLLLIL = interfaceC1368670lij.LJLIIIL();
        MutableLiveData<C1368560liY> mutableLiveDataLJLILLLLZI = interfaceC1368670lij.LJLILLLLZI();
        this.LLJ = mutableLiveDataLJLILLLLZI;
        AObserverS224S0100000_21 aObserverS224S0100000_21 = new AObserverS224S0100000_21(this, 112);
        this.LLJI = aObserverS224S0100000_21;
        mutableLiveDataLJLILLLLZI.observeForever(aObserverS224S0100000_21);
        this.LLJIJIL = interfaceC1368670lij.LJLIL();
        MutableLiveData<List<IMContact>> mutableLiveDataLJLI = interfaceC1368670lij.LJLI();
        this.LLJILJIL = mutableLiveDataLJLI;
        this.LLJILJILJ = interfaceC1368670lij.getState();
        this.LLJILLL = new MutableLiveData<>();
        this.LLJJ = new NextLiveData<>();
        this.LLJJI = new MutableLiveData<>();
        new MutableLiveData();
        this.LLJJIII = new MutableLiveData<>();
        this.LLJJIJI = new MutableLiveData<>();
        this.LLJJIJIIJIL = Transformations.map(mutableLiveDataLJLI, new AwS583S0100000_4(this, 378));
        this.LLJJIJIL = new MutableLiveData<>();
        this.LLJJJ = new MutableLiveData<>();
        this.LLJJJIL = new MutableLiveData<>();
        this.LLJJJJ = new ArrayList();
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(688));
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(685));
        this.LLJJL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(634));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(686));
        this.LLJL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(689));
        this.LLJLIL = "";
        this.LLJLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1696));
    }
}
