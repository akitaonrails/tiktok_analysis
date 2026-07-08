package com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost;

import X.AbstractC1255880imo;
import X.C06VF;
import X.C0HIA;
import X.C0I0B;
import X.C0Y8T;
import X.C0YSQ;
import X.C0YTZ;
import X.C0ZEJ;
import X.C0ZEM;
import X.C0ZEO;
import X.C0ZEQ;
import X.C0ZES;
import X.C13BV;
import X.C13DA;
import X.C15438062q;
import X.C1559260qg8;
import X.C1608506Rn;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23250099c;
import X.C327350CsP;
import X.C455040Hss;
import X.C786410Ut5;
import X.C874730YTf;
import X.C874780YTk;
import X.C874810YTn;
import X.C874910YTx;
import X.C896290ZEd;
import X.C901060ZWm;
import X.C913380ZsO;
import X.InterfaceC0148002o;
import X.InterfaceC1743406sC;
import X.InterfaceC876950Yaj;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS66S0210000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class BotSharePostPickerViewModel extends AssemViewModel<C0ZES> {
    public C0ZEQ LLILLJJLI;
    public AbstractC1255880imo<Aweme, ?> LLILLL;
    public final C1559260qg8<C06VF> LL = new C1559260qg8<>(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C06VF.class, (Class<Object>) null, (String) 13), true);
    public List<? extends Aweme> LLILZ = C13BV.INSTANCE;
    public final LinkedHashSet<String> LLILZIL = new LinkedHashSet<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0ZES(this.LL.getValue().LLILLJJLI, 1015);
    }

    public final void refresh() {
        setState(AFwS248S0000000_14.get$arr$(60));
        C0ZEQ c0zeq = this.LLILLJJLI;
        if (c0zeq != null) {
            Object[] objArr = new Object[6];
            objArr[0] = 1;
            objArr[1] = Boolean.TRUE;
            C0I0B c0i0b = C0I0B.LJFF;
            String curUserId = c0i0b.LIZ().getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            objArr[2] = curUserId;
            objArr[3] = 0;
            objArr[4] = 7000;
            User currentUser = c0i0b.LIZ().getCurrentUser();
            objArr[5] = currentUser != null ? currentUser.getSecUid() : null;
            c0zeq.LIZJ(objArr);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0ZEQ c0zeq = this.LLILLJJLI;
        if (c0zeq != null) {
            c0zeq.LJIILJJIL();
        }
        this.LLILLJJLI = null;
    }

    public final List<Aweme> vQ2(List<? extends Aweme> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                Aweme aweme2 = aweme;
                if (aweme2.getAwemeType() != 43 && aweme2.getAwemeType() != 41 && AwemeExtKt.isPublic(aweme2) && !AwemeExtKt.isDelete(aweme2)) {
                    arrayList.add(aweme);
                }
            }
            return arrayList;
        }
        return null;
    }

    public final List<C0HIA> yQ2(List<? extends Aweme> list) {
        boolean z;
        boolean z2;
        if (this.LLILZIL.size() >= getState().LLILZ) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Aweme aweme : list) {
            LinkedHashSet<String> linkedHashSet = this.LLILZIL;
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            boolean zContains = linkedHashSet.contains(aid);
            if (!zContains && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList.add(new C0HIA(aweme, zContains, z2, new C0ZEJ(this)));
        }
        return arrayList;
    }

    public final void wQ2(List<? extends Aweme> list, boolean z) {
        C0ZEM c0zem;
        int size;
        List<Aweme> listVQ2 = vQ2(list);
        if (listVQ2 == null) {
            listVQ2 = C13BV.INSTANCE;
        }
        this.LLILZ = listVQ2;
        this.LLILZIL.clear();
        if (this.LLILZ.isEmpty()) {
            c0zem = C0ZEO.LIZ;
        } else {
            c0zem = C896290ZEd.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleRefreshFinish, rawCount=");
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        sbLIZ.append(", filteredCount=");
        sbLIZ.append(this.LLILZ.size());
        sbLIZ.append(", hasMore=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        setState(new AwS66S0210000_14(this, z, c0zem, 1));
    }

    public final void xQ2(Context context, Aweme aweme, String str, int i) {
        SharePackage sharePackageLJIILLIIL;
        String strLIZIZ;
        IMContact iMContactLJI;
        IMShareService iMShareServiceLIZ;
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ2 = C1608506Rn.LIZ();
        if (iMShareServiceLIZ2 != null && (sharePackageLJIILLIIL = iMShareServiceLIZ2.LJIILLIIL(context, aweme, "share_panel_bot")) != null) {
            Bundle bundle = sharePackageLJIILLIIL.extras;
            bundle.putInt("rank_index", i);
            int i2 = i + 1;
            bundle.putInt("rank_num", i2);
            bundle.putInt("rank", i2);
            C786410Ut5.LJJJI("enter_method", "ai_share_post_panel", bundle);
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
            SendMessageTemplateTask sendMessageTemplateTask = sharePackageLJIILLIIL.sendMessageTemplateTask;
            if (sendMessageTemplateTask != null) {
                BaseTemplate baseTemplate = sendMessageTemplateTask.template;
                Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("a:im_session_id", str));
                C13DA c13da = new C13DA();
                c13da.put("interaction_type", "ai_share_post_panel");
                c13da.put("interaction_name", "quick_share");
                String string = sharePackageLJIILLIIL.extras.getString("video_sticker_status");
                String str3 = "";
                if (string == null) {
                    string = "";
                }
                c13da.put("video_sticker_status", string);
                String string2 = sharePackageLJIILLIIL.extras.getString("prop_id");
                if (string2 != null) {
                    str3 = string2;
                }
                c13da.put("prop_id", str3);
                String string3 = sharePackageLJIILLIIL.extras.getString("panel_source");
                if (string3 == null) {
                    string3 = "share_post";
                }
                c13da.put("panel_source", string3);
                String string4 = sharePackageLJIILLIIL.extras.getString("position");
                if (string4 != null) {
                    str2 = string4;
                }
                c13da.put("position", str2);
                SparseArray<Object> sparseArrayLJ = C901060ZWm.LJ(c13da.build());
                if (C455040Hss.LIZ()) {
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C874910YTx(this, baseTemplate, sendMessageTemplateTask, mapLJIIJ, sparseArrayLJ, null), 3);
                } else {
                    CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
                    C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
                    c874730YTfLIZ.LIZIZ.LJFF = this.LL.getValue().LL;
                    c874730YTfLIZ.LIZJ(baseTemplate);
                    C0YTZ c0ytz = c874730YTfLIZ.LIZIZ;
                    c0ytz.LJIILIIL = mapLJIIJ;
                    c0ytz.LJIILL = sparseArrayLJ;
                    c0ytz.LJIIIZ = mapLJIIJ;
                    c0ytz.LJIIL = sendMessageTemplateTask.scene;
                    c0ytz.LJIIIIZZ = sendMessageTemplateTask.attachments;
                    c874730YTfLIZ.LJ();
                }
                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LL.getValue().LL);
                if (c0y8tLIZ == null) {
                    return;
                }
                IIMContactUtilService.LIZ.getClass();
                IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                if (iIMContactUtilServiceLIZ != null && (iMContactLJI = iIMContactUtilServiceLIZ.LJI(c0y8tLIZ)) != null && (iMShareServiceLIZ = C1608506Rn.LIZ()) != null) {
                    iMShareServiceLIZ.LJ(sharePackageLJIILLIIL, iMContactLJI, System.currentTimeMillis(), C0I0B.LJFF.LIZIZ(), -1);
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseAweme failed for awemeId=");
        sbLIZ.append(aweme.getAid());
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ2.toString();
        throw new IllegalStateException(strLIZIZ2);
    }
}
