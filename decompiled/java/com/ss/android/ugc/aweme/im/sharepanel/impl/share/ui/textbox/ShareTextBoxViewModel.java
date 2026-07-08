package com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox;

import X.C01GW;
import X.C0I0B;
import X.C0I1Z;
import X.C0I7D;
import X.C0WZX;
import X.C0YNP;
import X.C0Z6T;
import X.C1210790hc5;
import X.C1231720i9q;
import X.C1235930iGd;
import X.C1236590iHh;
import X.C1336205Ku;
import X.C1363060lZg;
import X.C1364640lcE;
import X.C1365160ld4;
import X.C1365220ldA;
import X.C1365330ldL;
import X.C1365870leD;
import X.C1370970lmR;
import X.C13BV;
import X.C13LP;
import X.C1440005kM;
import X.C15438062q;
import X.C1599690rjL;
import X.C1723106ov;
import X.C1ER1;
import X.C2204961BRm;
import X.C452501pT;
import X.C786410Ut5;
import X.C805520Vio;
import X.C805530Vip;
import X.InterfaceC1361990lXx;
import X.InterfaceC1362600lYw;
import X.InterfaceC1364650lcF;
import X.InterfaceC1365090lcx;
import X.InterfaceC1365250ldD;
import X.InterfaceC1365380ldQ;
import android.text.Editable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.controller.helper.ShareStateHelper;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class ShareTextBoxViewModel extends ViewModel implements InterfaceC1364650lcF {
    public final SharePackage LL;
    public final InterfaceC1365250ldD LLILLJJLI;
    public final InterfaceC1362600lYw LLILLL = null;
    public final InterfaceC1364650lcF LLILZ;
    public final MutableLiveData<Boolean> LLILZIL;
    public final C1363060lZg LLILZLL;
    public final MutableLiveData<Boolean> LLIZ;
    public final InterfaceC1365090lcx LLIZLLLIL;
    public final MutableLiveData<Integer> LLJ;
    public final MutableLiveData LLJI;
    public final MutableLiveData<C1210790hc5> LLJIJIL;
    public final MutableLiveData LLJILJIL;
    public final MutableLiveData<C1236590iHh> LLJILJILJ;
    public final MutableLiveData LLJILLL;
    public final MutableLiveData<Float> LLJJ;
    public final MutableLiveData LLJJI;
    public final MutableLiveData<Boolean> LLJJIII;
    public final MutableLiveData LLJJIJI;
    public final MutableLiveData LLJJIJIIJIL;
    public final NextLiveData<Boolean> LLJJIJIL;
    public final NextLiveData LLJJJ;
    public final boolean LLJJJIL;
    public final boolean LLJJJJ;
    public List<? extends IMContact> LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final MutableLiveData<List<C0I1Z>> LLJJLIIIJLLLLLLLZ;

    @Override // X.InterfaceC1364650lcF
    public final void TU0(int i, boolean z) {
    }

    public final void GQ2() {
        InterfaceC1365090lcx interfaceC1365090lcx = this.LLIZLLLIL;
        if (interfaceC1365090lcx != null && interfaceC1365090lcx.eo()) {
            this.LLJILJILJ.postValue(new C1236590iHh(2131835413, 0));
            return;
        }
        InterfaceC1365090lcx interfaceC1365090lcx2 = this.LLIZLLLIL;
        if (interfaceC1365090lcx2 != null && interfaceC1365090lcx2.isChecked()) {
            this.LLJILJILJ.postValue(new C1236590iHh(2131835372, 0));
        } else if (zQ2().size() <= 1) {
            this.LLJILJILJ.postValue(new C1236590iHh(R.string.sxo, 0));
        } else {
            this.LLJILJILJ.postValue(new C1236590iHh(R.string.sxo, zQ2().size()));
        }
    }

    public final List<IMContact> zQ2() {
        if (!this.LL.extras.getBoolean("key_is_from_multi_guest_live_event", false)) {
            return this.LLJJJJJIL;
        }
        List<? extends IMContact> list = this.LLJJJJJIL;
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : list) {
            if (!Intrinsics.LJFF(iMContact.getInvitedEventId(), this.LL.extras.getString("live_event_id", ""))) {
                arrayList.add(iMContact);
            }
        }
        return arrayList;
    }

    public static void vQ2(List list) {
        String uid;
        C1723106ov c1723106ov = C1723106ov.LL;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            IMContact iMContact = (IMContact) it2.next();
            if (iMContact instanceof IMUser) {
                IMUser iMUser = (IMUser) iMContact;
                if (!iMUser.isBlock() && iMUser.getFollowStatus() == 2 && (uid = iMContact.getUid()) != null) {
                    arrayList.add(uid);
                }
            }
        }
        C1723106ov.LIZ(arrayList);
    }

    public final void DQ2(boolean z) {
        InterfaceC1364650lcF interfaceC1364650lcF = this.LLILZ;
        if (interfaceC1364650lcF != null) {
            interfaceC1364650lcF.z51(z);
        }
        this.LLJJIII.setValue(Boolean.valueOf(z));
        if (!z) {
            InterfaceC1365090lcx interfaceC1365090lcx = this.LLIZLLLIL;
            if (interfaceC1365090lcx != null) {
                interfaceC1365090lcx.LIZIZ();
            }
            GQ2();
        }
    }

    @Override // X.InterfaceC1364650lcF
    public final void Ew(boolean z) {
        Editable editableLLLLJI;
        C0I7D c0i7d = this.LLILZLL.LIZJ;
        String string = null;
        if (c0i7d != null && (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzG3SDhT2DsSx9m1G5IYHvFWqNTg3AHF25Rh5qYck0uetpcfiGdxb6vYMk8fyGivOz54SgA1Q==", null))) != null) {
            string = editableLLLLJI.toString();
        }
        AQ2(string, null, null, null, null, true, null);
    }

    public final void FQ2(SharePackage sharePackage) {
        SharePackage sharePackage2;
        SendMessageTemplateTask sendMessageTemplateTask;
        SendMessageEventParcel sendMessageEventParcel;
        if (Intrinsics.LJFF(sharePackage.itemType, "aigc_avatar") && (sendMessageTemplateTask = (sharePackage2 = this.LL).sendMessageTemplateTask) != null && (sendMessageEventParcel = sendMessageTemplateTask.sendMessageEventParcel) != null) {
            String string = sharePackage2.extras.getString("enter_method");
            if (string == null) {
                string = "";
            }
            sendMessageEventParcel.enterMethod = string;
        }
    }

    @Override // X.InterfaceC1364650lcF
    public final void N9(boolean z) {
        GQ2();
        InterfaceC1364650lcF interfaceC1364650lcF = this.LLILZ;
        if (interfaceC1364650lcF != null) {
            interfaceC1364650lcF.N9(z);
        }
    }

    @Override // X.InterfaceC1364650lcF
    public final void bd(boolean z) {
        InterfaceC1364650lcF interfaceC1364650lcF = this.LLILZ;
        if (interfaceC1364650lcF != null) {
            interfaceC1364650lcF.bd(z);
        }
    }

    public void x9(List<? extends IMContact> list) {
        this.LLJJJJJIL = list;
        InterfaceC1365090lcx interfaceC1365090lcx = this.LLIZLLLIL;
        if (interfaceC1365090lcx != null) {
            interfaceC1365090lcx.LIZ(list);
        }
        GQ2();
        List<IMContact> listZQ2 = zQ2();
        if (listZQ2 != null && !listZQ2.isEmpty()) {
            this.LLJJ.setValue(Float.valueOf(1.0f));
        } else {
            this.LLJJ.setValue(Float.valueOf(0.5f));
        }
    }

    public final void yQ2(List<? extends IMContact> list) {
        String strJ3;
        try {
            JSONObject jSONObject = new JSONObject();
            for (IMContact iMContact : list) {
                if (iMContact instanceof MAFIMUser) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("relation_tag", String.valueOf(((MAFIMUser) iMContact).getFollowStatus()));
                    jSONObject2.put("rec_type", ((MAFIMUser) iMContact).getRecType());
                    jSONObject.put(iMContact.getUid(), jSONObject2);
                }
            }
            strJ3 = C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strJ3 = "";
        }
        if (strJ3.length() > 0) {
            C786410Ut5.LJJJI("rec_map", strJ3, this.LL.extras);
        }
    }

    @Override // X.InterfaceC1364650lcF
    public final void z51(boolean z) {
        InterfaceC1364650lcF interfaceC1364650lcF = this.LLILZ;
        if (interfaceC1364650lcF != null) {
            interfaceC1364650lcF.z51(z);
        }
    }

    public final void EQ2(int i, SharePackage sharePackage) {
        boolean z;
        InterfaceC1365090lcx interfaceC1365090lcx = this.LLIZLLLIL;
        if (interfaceC1365090lcx != null && interfaceC1365090lcx.isChecked()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sharePackage.extras.putInt("is_create_group_chat", 1);
        } else {
            sharePackage.extras.putInt("is_create_group_chat", 0);
        }
        sharePackage.extras.putInt("friends_shared_cnt", i);
    }

    public void wQ2(String str, HashMap map) {
        String str2;
        if (this.LL.extras.getBoolean("is_share_live", false)) {
            if (str != null && str.length() > 0) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_with_message", str2);
            map.put("is_picture_share", "2");
        }
    }

    public final void xQ2(String str, String str2, List list) {
        InterfaceC1365250ldD interfaceC1365250ldD = this.LLILLJJLI;
        if (interfaceC1365250ldD != null) {
            interfaceC1365250ldD.LJIIJ(this.LL, list);
        }
        if (list.size() > 1) {
            IInternalShareApi.LIZ.getClass();
            C1370970lmR.LIZ().LIZJ().LJJIIZI(this.LL, null, list.size(), C0I0B.LJFF.LIZIZ());
        }
        ArrayList<String> arrayList = C805520Vio.LIZ;
        C805530Vip.LIZ().LIZLLL("recent share", "default", list);
        ShareStateHelper.LIZJ(this.LL, str2, new ArrayList(list));
        vQ2(list);
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZJ().LJIILLIIL(this.LL, str, list, System.currentTimeMillis(), C0I0B.LJFF.LIZIZ(), -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CQ2(final java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r45, java.lang.String r46, java.util.Map<java.lang.String, java.lang.String> r47, java.util.Map<java.lang.String, java.lang.String> r48, java.util.Map<java.lang.String, java.lang.String> r49) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.ShareTextBoxViewModel.CQ2(java.util.List, java.lang.String, java.util.Map, java.util.Map, java.util.Map):void");
    }

    public final void AQ2(String str, BaseContent baseContent, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z, Function1<? super MutableLiveData<Boolean>, Unit> function1) {
        InterfaceC1365090lcx interfaceC1365090lcx;
        Editable editableLLLLJI;
        boolean z2;
        String string;
        Map<String, String> linkedHashMap = map2;
        List<IMContact> listZQ2 = zQ2();
        if (listZQ2 != null && !listZQ2.isEmpty()) {
            InterfaceC1365250ldD interfaceC1365250ldD = this.LLILLJJLI;
            if (interfaceC1365250ldD != null) {
                interfaceC1365250ldD.LJIIIIZZ();
            }
            InterfaceC1362600lYw interfaceC1362600lYw = this.LLILLL;
            if (interfaceC1362600lYw != null && !interfaceC1362600lYw.LJIIIIZZ(this.LL)) {
                return;
            }
            if (this.LLJJJIL) {
                this.LLILZIL.setValue(Boolean.TRUE);
                C1ER1 c1er1 = C1ER1.LIZIZ;
                SharePackage sharePackage = this.LL;
                List<IMContact> listZQ22 = zQ2();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listZQ22, 10));
                Iterator<IMContact> it2 = listZQ22.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C0YNP.LJ(it2.next().getUid()));
                }
                c1er1.LLLLLZIL(sharePackage, arrayList);
                return;
            }
            Boolean boolValueOf = null;
            str = null;
            str = null;
            String str2 = null;
            string = null;
            String string2 = null;
            if (this.LLJJJJ) {
                ITakoService iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null);
                if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
                    str2 = string;
                }
                Iterator<IMContact> it3 = zQ2().iterator();
                while (it3.hasNext()) {
                    String strLJJIIZ = C1336205Ku.LIZ(false).getImChatService().LJJIIZ(it3.next().getUid());
                    if (iTakoService != null) {
                        iTakoService.LJJJJZ(this.LL, strLJJIIZ, str2, new AwS598S0100000_19(this, 171));
                    }
                }
                List<IMContact> listZQ23 = zQ2();
                IMContact iMContact = (IMContact) C13LP.LJJJLL(zQ2());
                int size = zQ2().size();
                if (zQ2().size() > 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                SharePackage sharePackage2 = this.LL;
                C1440005kM.LIZ(new C1365870leD(listZQ23, iMContact, size, z2, sharePackage2.itemType, sharePackage2.extras.getString("enter_from"), null, null, null, false, false, false));
                return;
            }
            if (str != null && str.length() > 6000) {
                this.LLJ.setValue(2131835733);
                return;
            }
            InterfaceC1365090lcx interfaceC1365090lcx2 = this.LLIZLLLIL;
            if (interfaceC1365090lcx2 != null && interfaceC1365090lcx2.eo()) {
                this.LLILZIL.setValue(Boolean.TRUE);
                String string3 = UUID.randomUUID().toString();
                this.LL.extras.putBoolean("is_create_group_and_share", true);
                IMSharePanelApi.LIZ.getClass();
                InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                List<IMContact> listZQ24 = zQ2();
                C0I7D c0i7d = this.LLILZLL.LIZJ;
                if (c0i7d != null && (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzG3SDhT2DsSx9m1G5IYHvFWqNTg3AHF25Rh5qYck0uetpcfiGdxb6vYMk8fyGivOz54SgA1Q==", null))) != null) {
                    string2 = editableLLLLJI.toString();
                }
                shareService.LJJJJZI(listZQ24, string2, this.LL, null, null, string3, null, null, null);
                return;
            }
            InterfaceC1365090lcx interfaceC1365090lcx3 = this.LLIZLLLIL;
            if ((interfaceC1365090lcx3 != null && interfaceC1365090lcx3.isChecked()) || ((interfaceC1365090lcx = this.LLIZLLLIL) != null && interfaceC1365090lcx.eo())) {
                InterfaceC1365090lcx interfaceC1365090lcx4 = this.LLIZLLLIL;
                if (interfaceC1365090lcx4 != null) {
                    boolValueOf = Boolean.valueOf(interfaceC1365090lcx4.LIZJ(new C1365160ld4(this, str, linkedHashMap, map3, map, baseContent, z)));
                }
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    DQ2(true);
                    return;
                }
                return;
            }
            int i = this.LL.extras.getInt("forward_limit", 15);
            if (zQ2().size() > i) {
                this.LLJIJIL.setValue(new C1210790hc5(i));
                return;
            }
            SharePackage sharePackage3 = this.LL;
            if (sharePackage3.sendMessageTemplateDynamicTask != null) {
                List<IMContact> listZQ25 = zQ2();
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                this.LLILZIL.setValue(Boolean.TRUE);
                SharePackage sharePackage4 = this.LL;
                SendMessageTemplateDynamicTask sendMessageTemplateDynamicTask = sharePackage4.sendMessageTemplateDynamicTask;
                if (sendMessageTemplateDynamicTask != null) {
                    C1235930iGd.LIZ(sharePackage4, listZQ25);
                    EQ2(C1231720i9q.LIZ(listZQ25), this.LL);
                    FQ2(this.LL);
                    SharePackage sharePackage5 = this.LL;
                    String str3 = linkedHashMap.get("from_group_id");
                    if (str3 != null) {
                        C786410Ut5.LJJJI("aid", str3, sharePackage5.extras);
                    }
                    if (Intrinsics.LJFF(linkedHashMap.get("enter_method"), "forward")) {
                        linkedHashMap.put("source", "forward");
                        if (map3 != null) {
                            map3.put("source", "forward");
                        }
                    } else {
                        linkedHashMap.put("source", "share");
                        if (map3 != null) {
                            map3.put("source", "share");
                        }
                    }
                    C1336205Ku.LIZ(false).getSendMessageTemplateService().LIZIZ(listZQ25, sendMessageTemplateDynamicTask, str, linkedHashMap, map3, null, null);
                    C1365220ldA c1365220ldA = C1365220ldA.LIZ;
                    SharePackage sharePackage6 = this.LL;
                    SendMessageEventParcel sendMessageEventParcel = sendMessageTemplateDynamicTask.sendMessageEventParcel;
                    c1365220ldA.getClass();
                    C1365220ldA.LJIIJ(sharePackage6, sendMessageEventParcel, listZQ25, null);
                }
            } else if (sharePackage3.sendMessageTemplateTask != null) {
                List<IMContact> listZQ26 = zQ2();
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                CQ2(listZQ26, str, linkedHashMap, map3, map);
            } else {
                List<IMContact> listZQ27 = zQ2();
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                BQ2(listZQ27, str, baseContent, map, linkedHashMap, map3, z);
            }
            if (function1 == null) {
                return;
            }
            function1.invoke(this.LLIZ);
        }
    }

    public void BQ2(final List<? extends IMContact> list, final String str, BaseContent baseContent, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z) {
        this.LLILZIL.setValue(Boolean.TRUE);
        final String string = UUID.randomUUID().toString();
        InterfaceC1365250ldD interfaceC1365250ldD = this.LLILLJJLI;
        if (interfaceC1365250ldD != null) {
            interfaceC1365250ldD.LJFF(this.LL);
        }
        C1235930iGd.LIZ(this.LL, list);
        EQ2(C1231720i9q.LIZ(list), this.LL);
        if (Intrinsics.LJFF(map2.get("enter_method"), "forward")) {
            map2.put("source", "forward");
            if (map3 != null) {
                map3.put("source", "forward");
            }
        } else {
            map2.put("source", "share");
            if (map3 != null) {
                map3.put("source", "share");
            }
        }
        InterfaceC1361990lXx interfaceC1361990lXx = new InterfaceC1361990lXx() { // from class: X.0lcy
            @Override // X.InterfaceC1361990lXx
            public final void LIZ() {
                this.LIZ.xQ2(str, string, list);
            }

            @Override // X.InterfaceC1361990lXx
            public final void LIZIZ(HashMap<String, String> map4) {
                this.LIZ.wQ2(str, map4);
                InterfaceC1365250ldD interfaceC1365250ldD2 = this.LIZ.LLILLJJLI;
                if (interfaceC1365250ldD2 != null) {
                    interfaceC1365250ldD2.LIZIZ(map4);
                }
            }
        };
        yQ2(list);
        C1365330ldL.LIZ.LJI(list, str, this.LL, baseContent, map, map2, map3, string, !z, interfaceC1361990lXx, this.LLILLL, null);
        C0Z6T c0z6t = (C0Z6T) this.LLJJJJLIIL.getValue();
        if (c0z6t != null && c0z6t.LIZLLL(this.LL)) {
            IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) this.LLJJL.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            for (IMContact iMContact : list) {
                if (iMContact instanceof IMConversation) {
                    arrayList.add(iMContact);
                }
            }
            int size2 = arrayList.size();
            ArrayList arrayList2 = new ArrayList();
            for (IMContact iMContact2 : list) {
                if (iMContact2 instanceof IMUser) {
                    arrayList2.add(iMContact2);
                }
            }
            iIMChatDetailAnalytics.LJII(size, size2, arrayList2.size(), C0I0B.LJFF.LIZIZ());
        }
    }

    public ShareTextBoxViewModel(SharePackage sharePackage, InterfaceC1365250ldD interfaceC1365250ldD, InterfaceC1364650lcF interfaceC1364650lcF, MutableLiveData mutableLiveData, C1363060lZg c1363060lZg, boolean z, boolean z2, boolean z3, MutableLiveData mutableLiveData2) {
        boolean z4;
        this.LL = sharePackage;
        this.LLILLJJLI = interfaceC1365250ldD;
        this.LLILZ = interfaceC1364650lcF;
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = c1363060lZg;
        this.LLIZ = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this.LLJ = mutableLiveData3;
        this.LLJI = mutableLiveData3;
        MutableLiveData<C1210790hc5> mutableLiveData4 = new MutableLiveData<>();
        this.LLJIJIL = mutableLiveData4;
        this.LLJILJIL = mutableLiveData4;
        MutableLiveData<C1236590iHh> mutableLiveData5 = new MutableLiveData<>();
        this.LLJILJILJ = mutableLiveData5;
        this.LLJILLL = mutableLiveData5;
        MutableLiveData<Float> mutableLiveData6 = new MutableLiveData<>();
        this.LLJJ = mutableLiveData6;
        this.LLJJI = mutableLiveData6;
        MutableLiveData<Boolean> mutableLiveData7 = new MutableLiveData<>();
        this.LLJJIII = mutableLiveData7;
        this.LLJJIJI = mutableLiveData7;
        this.LLJJIJIIJIL = new MutableLiveData();
        NextLiveData<Boolean> nextLiveData = new NextLiveData<>();
        this.LLJJIJIL = nextLiveData;
        this.LLJJJ = nextLiveData;
        this.LLJJJIL = Intrinsics.LJFF(sharePackage.itemType, "search_image");
        if (!Intrinsics.LJFF(sharePackage.itemType, "tako_local_image") && !Intrinsics.LJFF(sharePackage.itemType, "tako_local_video")) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.LLJJJJ = z4;
        this.LLJJJJJIL = C13BV.INSTANCE;
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(698));
        this.LLJJL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(697));
        if (z2) {
            IInternalShareApi.LIZ.getClass();
            C1364640lcE c1364640lcELJJJJLL = C1370970lmR.LIZ().LIZIZ().LJJJJLL(c1363060lZg, sharePackage, this, z, z3);
            c1364640lcELJJJJLL.LIZLLL();
            this.LLIZLLLIL = c1364640lcELJJJJLL;
        } else {
            C786410Ut5.LJZL(8, c1363060lZg.LIZ);
        }
        this.LLJJLIIIJLLLLLLLZ = new MutableLiveData<>();
    }
}
