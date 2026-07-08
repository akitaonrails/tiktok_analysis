package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.viewmodel;

import X.C0I0B;
import X.C0Y8T;
import X.C0YSQ;
import X.C0YTZ;
import X.C13BV;
import X.C13DA;
import X.C1608506Rn;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C327350CsP;
import X.C455040Hss;
import X.C786410Ut5;
import X.C874730YTf;
import X.C874780YTk;
import X.C874810YTn;
import X.C874900YTw;
import X.C901060ZWm;
import X.C913380ZsO;
import X.EnumC1646906cd;
import X.InterfaceC1743406sC;
import X.InterfaceC876950Yaj;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.utils.ChatRoomEventTrackingStore;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareVideoPanelViewModel extends ViewModel {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final MutableLiveData<Boolean> LL = new MutableLiveData<>(Boolean.FALSE);
    public final C2252321DDq LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final MutableLiveData<Aweme> LLILZ;
    public Bundle LLILZIL;
    public String LLILZLL;
    public Function0<Unit> LLIZ;

    public ShareVideoPanelViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C13BV.INSTANCE);
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = c2252321DDqLIZ;
        this.LLILZ = new MutableLiveData<>(null);
    }

    public static String wQ2(int i) {
        if (i == EnumC1646906cd.YOURS.getType()) {
            return "quick_share_your";
        }
        if (i == EnumC1646906cd.LIKED.getType()) {
            return "quick_share_like";
        }
        if (i == EnumC1646906cd.FAVORITE.getType()) {
            return "quick_share_favorite";
        }
        if (i == EnumC1646906cd.REPOSTED.getType()) {
            return "quick_share_reposted";
        }
        return "";
    }

    public final void xQ2(Aweme aweme, Function0<Unit> function0) {
        String aid;
        Function0<Unit> function02;
        if (this.LLIZ != null) {
            String aid2 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            Aweme value = this.LLILZ.getValue();
            if (value != null) {
                aid2 = value.getAid();
            }
            if (!Intrinsics.LJFF(aid, aid2) && (function02 = this.LLIZ) != null) {
                function02.invoke();
            }
        }
        this.LLILZ.setValue(aweme);
        this.LLIZ = function0;
    }

    public final void vQ2(Aweme aweme, View view, int i, int i2, String str) {
        SharePackage sharePackageLJIILLIIL;
        String strLIZIZ;
        IMContact iMContactLJI;
        IMShareService iMShareServiceLIZ;
        int i3;
        String string;
        if (aweme == null) {
            return;
        }
        this.LL.setValue(Boolean.TRUE);
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ2 = C1608506Rn.LIZ();
        if (iMShareServiceLIZ2 != null && (sharePackageLJIILLIIL = iMShareServiceLIZ2.LJIILLIIL(view.getContext(), aweme, "quick_share")) != null) {
            Bundle bundle = sharePackageLJIILLIIL.extras;
            bundle.putInt("rank_index", i);
            int i4 = i + 1;
            bundle.putInt("rank_num", i4);
            bundle.putInt("rank", i4);
            C786410Ut5.LJJJI("enter_method", wQ2(i2), bundle);
            String str2 = "panel";
            C786410Ut5.LJJJI("position", "panel", bundle);
            IMAwemeService.LIZ.getClass();
            IMAwemeService iMAwemeServiceLIZ = C327350CsP.LIZ();
            if (iMAwemeServiceLIZ != null) {
                strLIZIZ = iMAwemeServiceLIZ.LIZIZ(aweme);
            } else {
                strLIZIZ = null;
            }
            C786410Ut5.LJJJI("prop_id", strLIZIZ, bundle);
            if (str != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                SendMessageTemplateTask sendMessageTemplateTask = sharePackageLJIILLIIL.sendMessageTemplateTask;
                if (sendMessageTemplateTask != null) {
                    BaseTemplate baseTemplate = sendMessageTemplateTask.template;
                    C13DA c13da = new C13DA();
                    c13da.putAll(ChatRoomEventTrackingStore.LIZIZ.LIZIZ(this.LLILZLL));
                    c13da.put("interaction_type", wQ2(i2));
                    c13da.put("interaction_name", "quick_share");
                    String string2 = sharePackageLJIILLIIL.extras.getString("video_sticker_status");
                    String str3 = "";
                    if (string2 == null) {
                        string2 = "";
                    }
                    c13da.put("video_sticker_status", string2);
                    String string3 = sharePackageLJIILLIIL.extras.getString("prop_id");
                    if (string3 != null) {
                        str3 = string3;
                    }
                    c13da.put("prop_id", str3);
                    String string4 = sharePackageLJIILLIIL.extras.getString("video_relation_tag");
                    if (string4 != null) {
                        c13da.put("video_relation_tag", string4);
                    }
                    Bundle bundle2 = this.LLILZIL;
                    if (bundle2 != null) {
                        i3 = bundle2.getInt("is_from_action_bar");
                    } else {
                        i3 = 0;
                    }
                    c13da.put("is_from_action_bar", String.valueOf(i3));
                    Bundle bundle3 = this.LLILZIL;
                    if (bundle3 != null && (string = bundle3.getString("share_post_panel_enter_method")) != null) {
                        c13da.put("enter_method", string);
                    }
                    String string5 = sharePackageLJIILLIIL.extras.getString("panel_source");
                    if (string5 == null) {
                        string5 = "share_post";
                    }
                    c13da.put("panel_source", string5);
                    String string6 = sharePackageLJIILLIIL.extras.getString("position");
                    if (string6 != null) {
                        str2 = string6;
                    }
                    c13da.put("position", str2);
                    SparseArray<Object> sparseArrayLJ = C901060ZWm.LJ(c13da.build());
                    if (C455040Hss.LIZ()) {
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C874900YTw(str, baseTemplate, sendMessageTemplateTask, linkedHashMap, sparseArrayLJ, null), 3);
                    } else {
                        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
                        C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
                        c874730YTfLIZ.LIZIZ.LJFF = str;
                        c874730YTfLIZ.LIZJ(baseTemplate);
                        C0YTZ c0ytz = c874730YTfLIZ.LIZIZ;
                        c0ytz.LJIILIIL = linkedHashMap;
                        c0ytz.LJIILL = sparseArrayLJ;
                        c0ytz.LJIIL = sendMessageTemplateTask.scene;
                        c0ytz.LJIIIIZZ = sendMessageTemplateTask.attachments;
                        c874730YTfLIZ.LJ();
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
            if (c0y8tLIZ == null) {
                return;
            }
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null && (iMContactLJI = iIMContactUtilServiceLIZ.LJI(c0y8tLIZ)) != null && (iMShareServiceLIZ = C1608506Rn.LIZ()) != null) {
                iMShareServiceLIZ.LJ(sharePackageLJIILLIIL, iMContactLJI, System.currentTimeMillis(), C0I0B.LJFF.LIZIZ(), -1);
            }
        }
    }
}
