package kotlin.jvm.internal;

import X.C09AY;
import X.C118300cf;
import X.C11S5;
import X.C1227904rF;
import X.C12ES;
import X.C1342200l22;
import X.C1345080l6g;
import X.C1346420l8q;
import X.C1350920lG6;
import X.C1558520qew;
import X.C1701940uOG;
import X.C19EG;
import X.C2344009Gk;
import X.C693020RGi;
import X.EnumC1342450l2R;
import X.InterfaceC1343810l4d;
import X.InterfaceC19474811He;
import X.InterfaceC665370Q7z;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentBatchDeleteResponse;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentDeleteAbility;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.ICommentCareModeService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS138S0110000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS2S0602000_21 extends C09AY implements Function1 {
    public final int $t;
    public int i6;
    public int i7;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S0602000_21 awS2S0602000_21, Object obj) {
        final String aid;
        String strEnterFrom;
        Aweme aweme;
        Aweme aweme2;
        final CommentManagementAssemVM commentManagementAssemVM = (CommentManagementAssemVM) awS2S0602000_21.l0;
        final Set set = (Set) awS2S0602000_21.l1;
        final int i = ((C118300cf) awS2S0602000_21.l2).element;
        CommentContextSource commentContextSourceWQ2 = commentManagementAssemVM.wQ2();
        if (commentContextSourceWQ2 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceWQ2)) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        final C19EG c19eg = (C19EG) awS2S0602000_21.l3;
        InterfaceC1343810l4d.LIZ.getClass();
        ((InterfaceC1343810l4d) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(InterfaceC1343810l4d.class)).LIZIZ(TextUtils.join(",", set), aid).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<CommentBatchDeleteResponse>() { // from class: X.0l4W
            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                String[] strArr;
                Fragment fragment;
                if (!C086I.LIZIZ(set) && (th instanceof C0XIR)) {
                    C0XIR c0xir = (C0XIR) th;
                    if (c0xir.getErrorCode() == 3017005) {
                        String str = ((CommentBatchDeleteResponse) c0xir.getRawResponse()).failedCids;
                        if (TextUtils.isEmpty(str)) {
                            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                            c1389890mGx.LJIIIZ(2131829141);
                            c1389890mGx.LJIIJJI();
                            return;
                        }
                        Map<String, Comment> map = commentManagementAssemVM.LL;
                        int replyCommentTotal = i;
                        HashMap map2 = (HashMap) map;
                        if (map2.size() > 0 && replyCommentTotal > 0 && str != null) {
                            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
                            if (listLJJLIIIJILLIZJL != null && (strArr = (String[]) listLJJLIIIJILLIZJL.toArray(new String[0])) != null) {
                                if (map2.size() == strArr.length) {
                                    C1389890mGx c1389890mGx2 = new C1389890mGx(c19eg);
                                    c1389890mGx2.LJIIIZ(2131829141);
                                    c1389890mGx2.LJIIJJI();
                                    return;
                                }
                                for (String str2 : strArr) {
                                    set.remove(str2);
                                    replyCommentTotal--;
                                    Comment comment = (Comment) map2.get(str2);
                                    if (comment != null) {
                                        replyCommentTotal -= (int) comment.getReplyCommentTotal();
                                    }
                                }
                                if (set.size() > 0) {
                                    commentManagementAssemVM.zQ2(map2.size());
                                }
                                C1389890mGx c1389890mGx3 = new C1389890mGx(c19eg);
                                c1389890mGx3.LJIIIZ(2131829146);
                                c1389890mGx3.LJIIJJI();
                                commentManagementAssemVM.zQ2(i - replyCommentTotal);
                                CommentManagementAssemVM commentManagementAssemVM2 = commentManagementAssemVM;
                                InterfaceC665370Q7z interfaceC665370Q7z = commentManagementAssemVM2.LLILZ;
                                if (interfaceC665370Q7z != null) {
                                    WeakReference<Fragment> weakReference = commentManagementAssemVM2.LLILZIL;
                                    if (weakReference != null) {
                                        fragment = weakReference.get();
                                    } else {
                                        fragment = null;
                                    }
                                    ICommentDeleteAbility iCommentDeleteAbilityLIZ = C1345760l7m.LIZ(fragment, interfaceC665370Q7z);
                                    if (iCommentDeleteAbilityLIZ != null) {
                                        iCommentDeleteAbilityLIZ.wh0(set);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C0XTN.LIZJ(c19eg, (Exception) th, 2131829141, false, false);
                    return;
                }
                C1389890mGx c1389890mGx4 = new C1389890mGx(c19eg);
                c1389890mGx4.LJIIIZ(2131829141);
                c1389890mGx4.LJIIJJI();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v16, types: [X.09AY, kotlin.jvm.functions.Function0] */
            @Override // X.InterfaceC19474811He
            public final void onSuccess(CommentBatchDeleteResponse commentBatchDeleteResponse) {
                boolean z;
                String uid;
                User user;
                Map<String, Comment> map = commentManagementAssemVM.LL;
                Set<String> set2 = set;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                HashMap map2 = (HashMap) map;
                for (Map.Entry entry : map2.entrySet()) {
                    if (set2.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                Fragment fragment = null;
                if (!map2.isEmpty()) {
                    Iterator it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        Comment comment = (Comment) ((Map.Entry) it2.next()).getValue();
                        if (comment != null && (user = comment.getUser()) != null) {
                            uid = user.getUid();
                        } else {
                            uid = null;
                        }
                        if (!Intrinsics.LJFF(uid, curUserId)) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                C1440005kM.LIZ(new C1343770l4Z(0));
                C1440005kM.LIZ(new C1343760l4Y(C13LP.LLIIII(set), aid));
                CommentManagementAssemVM commentManagementAssemVM2 = commentManagementAssemVM;
                InterfaceC665370Q7z interfaceC665370Q7z = commentManagementAssemVM2.LLILZ;
                if (interfaceC665370Q7z != null) {
                    WeakReference<Fragment> weakReference = commentManagementAssemVM2.LLILZIL;
                    if (weakReference != null) {
                        fragment = weakReference.get();
                    }
                    ICommentDeleteAbility iCommentDeleteAbilityLIZ = C1345760l7m.LIZ(fragment, interfaceC665370Q7z);
                    if (iCommentDeleteAbilityLIZ != null) {
                        iCommentDeleteAbilityLIZ.Y21(new ArrayList(linkedHashMap.values()));
                    }
                }
                if ((!map2.isEmpty()) && i > 0 && !set.isEmpty()) {
                    commentManagementAssemVM.vQ2();
                    commentManagementAssemVM.zQ2(0);
                }
                commentManagementAssemVM.LLIZ = new AwS138S0110000_21(c19eg, z, 6);
                C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                c1389890mGx.LJIIIZ(2131829142);
                c1389890mGx.LIZJ(commentManagementAssemVM.LLIZ);
                c1389890mGx.LJIIJJI();
            }
        });
        int i2 = awS2S0602000_21.i6;
        int size = ((Set) awS2S0602000_21.l4).size();
        int i3 = awS2S0602000_21.i7;
        CommentContextSource commentContextSourceWQ22 = ((CommentManagementAssemVM) awS2S0602000_21.l0).wQ2();
        if (commentContextSourceWQ22 == null || (strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceWQ22)) == null) {
            strEnterFrom = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i2, "c_number");
        c2344009Gk.LIZJ(size, "u_number");
        c2344009Gk.LIZJ(i3, "video_reply_number");
        c2344009Gk.LJIIIIZZ("enter_from", strEnterFrom);
        C1350920lG6.LJJJ(c2344009Gk, "comment_batch_management_delete_confirm_ck");
        CommentContextSource commentContextSourceWQ23 = ((CommentManagementAssemVM) awS2S0602000_21.l0).wQ2();
        if (commentContextSourceWQ23 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceWQ23)) != null) {
            ComplianceServiceProvider.LJIJJ().LJJIIZI(aweme, ((Map) awS2S0602000_21.l5).values());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S0602000_21 awS2S0602000_21, Object obj) {
        Integer numValueOf;
        Aweme aweme;
        Aweme aweme2;
        String uid;
        String strEnterFrom;
        String aid;
        Aweme aweme3;
        FypExposedCommentMobParams fypExposedCommentMobParams;
        EnumC1342450l2R currSortType;
        CommentCommonModel commonModel;
        String strEnterFrom2;
        ICommentPageContainer iCommentPageContainer;
        InterfaceC665370Q7z interfaceC665370Q7z = ((CommentManagementAssemVM) awS2S0602000_21.l0).LLILZ;
        if (interfaceC665370Q7z != null && (iCommentPageContainer = (ICommentPageContainer) C1558520qew.LIZ(interfaceC665370Q7z, ICommentPageContainer.class, null)) != null) {
            numValueOf = Integer.valueOf(iCommentPageContainer.zF());
        } else {
            numValueOf = null;
        }
        int iLJ = C1346420l8q.LJ(numValueOf);
        if (iLJ == 0) {
            iLJ = (int) (((double) C12ES.LJIIIIZZ((C19EG) awS2S0602000_21.l1)) * 0.9d);
        }
        C19EG c19eg = (C19EG) awS2S0602000_21.l1;
        CommentContextSource commentContextSourceWQ2 = ((CommentManagementAssemVM) awS2S0602000_21.l0).wQ2();
        if (commentContextSourceWQ2 != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceWQ2);
        } else {
            aweme = null;
        }
        String strJoin = TextUtils.join(",", (List) awS2S0602000_21.l2);
        String strJoin2 = TextUtils.join(",", (List) awS2S0602000_21.l3);
        CommentContextSource commentContextSourceWQ22 = ((CommentManagementAssemVM) awS2S0602000_21.l0).wQ2();
        if (commentContextSourceWQ22 != null) {
            aweme2 = CommentContextSourceKt.aweme(commentContextSourceWQ22);
        } else {
            aweme2 = null;
        }
        User userLIZ = C693020RGi.LIZ(aweme2);
        if (userLIZ != null) {
            uid = userLIZ.getUid();
        } else {
            uid = null;
        }
        CommentContextSource commentContextSourceWQ23 = ((CommentManagementAssemVM) awS2S0602000_21.l0).wQ2();
        if (commentContextSourceWQ23 != null) {
            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceWQ23);
        } else {
            strEnterFrom = null;
        }
        String str = "";
        if (strEnterFrom == null) {
            strEnterFrom = "";
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("object_ids", strJoin).appendQueryParameter("owner_ids", strJoin2).appendQueryParameter("report_type", "comment").appendQueryParameter("is_batch", "1").appendQueryParameter("locale", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("related_object_ids", aid).appendQueryParameter("enter_from", strEnterFrom);
        if (uid != null) {
            builderAppendQueryParameter2.appendQueryParameter("video_owner_id", uid);
        }
        ICommentCareModeService.LIZ.getClass();
        if (C1342200l22.LIZ().LIZLLL(aweme)) {
            n nVar = new n();
            nVar.LJJIII(1, "care_mode");
            C1227904rF.LIZ.getClass();
            builderAppendQueryParameter2.appendQueryParameter("extra", C1227904rF.LJI(nVar));
        }
        C1345080l6g.LIZ(c19eg, builderAppendQueryParameter2);
        Bundle bundle = new Bundle();
        bundle.putInt("half_screen_height", iLJ);
        ComplianceServiceProvider.LJJ().report(c19eg, builderAppendQueryParameter2, bundle);
        int i = awS2S0602000_21.i6;
        int size = ((Set) awS2S0602000_21.l4).size();
        int i2 = awS2S0602000_21.i7;
        CommentContextSource commentContextSourceWQ24 = ((CommentManagementAssemVM) awS2S0602000_21.l0).wQ2();
        if (commentContextSourceWQ24 != null && (strEnterFrom2 = CommentContextSourceKt.enterFrom(commentContextSourceWQ24)) != null) {
            str = strEnterFrom2;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "c_number");
        c2344009Gk.LIZJ(size, "u_number");
        c2344009Gk.LIZJ(i2, "video_reply_number");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C1350920lG6.LJJJ(c2344009Gk, "comment_batch_management_report_confirm_ck");
        CommentManagementAssemVM commentManagementAssemVM = (CommentManagementAssemVM) awS2S0602000_21.l0;
        Map map = (Map) awS2S0602000_21.l5;
        commentManagementAssemVM.getClass();
        for (Comment comment : map.values()) {
            String strEnterFrom3 = CommentContextSourceKt.enterFrom(commentManagementAssemVM.wQ2());
            CommentContextSource commentContextSourceWQ25 = commentManagementAssemVM.wQ2();
            if (commentContextSourceWQ25 != null) {
                aweme3 = CommentContextSourceKt.aweme(commentContextSourceWQ25);
            } else {
                aweme3 = null;
            }
            String sessionId = CommentContextSourceKt.getSessionId(commentManagementAssemVM.wQ2());
            CommentContextSource commentContextSourceWQ26 = commentManagementAssemVM.wQ2();
            if (commentContextSourceWQ26 != null && (commonModel = commentContextSourceWQ26.getCommonModel()) != null) {
                fypExposedCommentMobParams = commonModel.fypExposedCommentMobParams;
            } else {
                fypExposedCommentMobParams = null;
            }
            CommentContextSource commentContextSourceWQ27 = commentManagementAssemVM.wQ2();
            if (commentContextSourceWQ27 != null) {
                currSortType = commentContextSourceWQ27.getCurrSortType();
            } else {
                currSortType = null;
            }
            C1350920lG6.LLFF(strEnterFrom3, aweme3, comment, "click_report_button", sessionId, fypExposedCommentMobParams, currSortType, false, AFwS259S0000000_21.get$arr$(466));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0602000_21(CommentManagementAssemVM commentManagementAssemVM, CommentManagementAssemVM commentManagementAssemVM2, C19EG c19eg, List<String> list, List<String> list2, int i, Set<String> set, int i2, Map<String, Comment> map) {
        super(1);
        this.$t = map;
        this.l0 = commentManagementAssemVM;
        this.l1 = commentManagementAssemVM2;
        this.l2 = c19eg;
        this.l3 = list;
        this.i6 = list2;
        this.l4 = i;
        this.i7 = set;
        this.l5 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0602000_21(CommentManagementAssemVM commentManagementAssemVM, CommentManagementAssemVM commentManagementAssemVM2, Set<String> set, C118300cf c118300cf, C19EG c19eg, int i, Set<String> set2, int i2, Map<String, ? extends Comment> map) {
        super(1);
        this.$t = map;
        this.l0 = commentManagementAssemVM;
        this.l1 = commentManagementAssemVM2;
        this.l2 = set;
        this.l3 = c118300cf;
        this.i6 = c19eg;
        this.l4 = i;
        this.i7 = set2;
        this.l5 = i2;
    }
}
