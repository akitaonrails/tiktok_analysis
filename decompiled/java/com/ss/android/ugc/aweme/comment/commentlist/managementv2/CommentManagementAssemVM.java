package com.ss.android.ugc.aweme.comment.commentlist.managementv2;

import X.C086I;
import X.C09AY;
import X.C0BJS;
import X.C0XIR;
import X.C1159060gGe;
import X.C1220000hqw;
import X.C1342260l28;
import X.C1343770l4Z;
import X.C1345760l7m;
import X.C1389890mGx;
import X.C13LE;
import X.C13LQ;
import X.C1440005kM;
import X.C14EU;
import X.C19EG;
import X.C2214201BlK;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C484220Iyq;
import X.C622680Oba;
import X.C724750Sbp;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.commentlist.api.UserBatchBlockResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.CommentSyncSharedVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentDeleteAbility;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS32S0001000_18;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.text.a0;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentManagementAssemVM extends AssemViewModel<C1159060gGe> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public int LLILLL;
    public InterfaceC665370Q7z LLILZ;
    public WeakReference<Fragment> LLILZIL;
    public C09AY LLIZ;
    public final Map<String, Comment> LL = new HashMap();
    public final Map<String, Comment> LLILLJJLI = new HashMap();
    public final C1342260l28 LLILZLL = new C1342260l28(new AwS565S0100000_21(this, 107));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentManagementAssemVM.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void vQ2() {
        this.LLILLL = 0;
        ((HashMap) this.LL).clear();
        ((HashMap) this.LLILLJJLI).clear();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1159060gGe(0);
    }

    public final CommentContextSource wQ2() {
        C1342260l28 c1342260l28 = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return c1342260l28.LIZIZ();
    }

    public final boolean xQ2() {
        return ((C1159060gGe) this.vmDispatcher.getState()).LLILLJJLI.LIZ.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommentManagementAssemVM() {
        C13LE.LIZ(CommentSyncSharedVM.class);
        AFwS259S0000000_21.get$arr$(60);
        new C452070Ho5();
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null);
        this.LLIZ = AFwS209S0000000_21.get$arr$(98);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (C0BJS.LIZ()) {
            C622680Oba.LIZLLL(this);
            super.onCleared();
        } else {
            super.onCleared();
            C622680Oba.LIZLLL(this);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C622680Oba.LIZJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReportCommentEvent(C484220Iyq c484220Iyq) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        try {
            if (TextUtils.equals("commentBatchReportResult", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data"), "object_ids");
                if (jSONArray == null) {
                    Activity activityLJFF = C2214201BlK.LJFF();
                    if (activityLJFF != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                        c1389890mGx.LJIIIZ(2131829150);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                HashSet hashSet = new HashSet();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(JSONArrayProtectorUtils.getString(jSONArray, i));
                }
                Map<String, Comment> map = this.LLILLJJLI;
                int i2 = this.LLILLL;
                HashMap map2 = (HashMap) map;
                if (map2.size() > 0 && i2 > 0) {
                    int size = hashSet.size();
                    Fragment fragment = null;
                    if (map2.size() == size) {
                        InterfaceC665370Q7z interfaceC665370Q7z2 = this.LLILZ;
                        if (interfaceC665370Q7z2 != null) {
                            WeakReference<Fragment> weakReference = this.LLILZIL;
                            if (weakReference != null) {
                                fragment = weakReference.get();
                            }
                            ICommentDeleteAbility iCommentDeleteAbilityLIZ = C1345760l7m.LIZ(fragment, interfaceC665370Q7z2);
                            if (iCommentDeleteAbilityLIZ != null) {
                                iCommentDeleteAbilityLIZ.wh0(hashSet);
                            }
                        }
                        vQ2();
                        zQ2(0);
                        Activity activityLJFF2 = C2214201BlK.LJFF();
                        if (activityLJFF2 != null) {
                            C1389890mGx c1389890mGx2 = new C1389890mGx(activityLJFF2);
                            c1389890mGx2.LJIIIZ(2131829153);
                            c1389890mGx2.LJIIJJI();
                        }
                        C1440005kM.LIZ(new C1343770l4Z(2));
                        return;
                    }
                    for (Map.Entry entry : map2.entrySet()) {
                        if (!hashSet.contains(entry.getKey())) {
                            ((Comment) entry.getValue()).getReplyCommentTotal();
                        }
                    }
                    if ((!hashSet.isEmpty()) && (interfaceC665370Q7z = this.LLILZ) != null) {
                        WeakReference<Fragment> weakReference2 = this.LLILZIL;
                        if (weakReference2 != null) {
                            fragment = weakReference2.get();
                        }
                        ICommentDeleteAbility iCommentDeleteAbilityLIZ2 = C1345760l7m.LIZ(fragment, interfaceC665370Q7z);
                        if (iCommentDeleteAbilityLIZ2 != null) {
                            iCommentDeleteAbilityLIZ2.wh0(hashSet);
                        }
                    }
                    zQ2(map2.size() - size);
                    Activity activityLJFF3 = C2214201BlK.LJFF();
                    if (activityLJFF3 != null) {
                        C1389890mGx c1389890mGx3 = new C1389890mGx(activityLJFF3);
                        c1389890mGx3.LJIIIZ(2131829147);
                        c1389890mGx3.LJIIJJI();
                    }
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void zQ2(int i) {
        setState(new AwS32S0001000_18(i, 0));
    }

    public static void yQ2(Throwable th, Set set, C19EG c19eg) {
        String str;
        List listLJJLIIIJILLIZJL;
        String[] strArr;
        if (th instanceof C0XIR) {
            UserBatchBlockResponse userBatchBlockResponse = (UserBatchBlockResponse) ((C0XIR) th).getRawResponse();
            if (!TextUtils.isEmpty(userBatchBlockResponse.blockFailToUserIds) && !C086I.LIZIZ(set) && (str = userBatchBlockResponse.blockFailToUserIds) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null && (strArr = (String[]) listLJJLIIIJILLIZJL.toArray(new String[0])) != null && set.containsAll(C13LQ.LJJLL(strArr)) && strArr.length != 0) {
                set.removeAll(Arrays.asList(strArr));
            }
        }
        if (!C086I.LIZIZ(set)) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIIZ(2131829145);
            c1389890mGx.LJIIJJI();
        } else {
            C1389890mGx c1389890mGx2 = new C1389890mGx(c19eg);
            c1389890mGx2.LJIIIZ(2131829136);
            c1389890mGx2.LJIIJJI();
        }
    }
}
