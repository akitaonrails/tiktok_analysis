package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.C013C;
import X.C06LY;
import X.C09AY;
import X.C0CHQ;
import X.C0N5F;
import X.C1336205Ku;
import X.C1340200kyo;
import X.C1342730l2t;
import X.C1342740l2u;
import X.C1349350lDZ;
import X.C1365810le7;
import X.C1396180mR6;
import X.C1396190mR7;
import X.C1440005kM;
import X.C1624790sNp;
import X.C1906580ziK;
import X.C201955140j;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1349330lDX;
import X.InterfaceC324680Co6;
import X.ViewOnClickListenerC1349290lDT;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ShareMessageToastHelper;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentInlineBannerOverflowCell;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AwS136S1200000_21 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS136S1200000_21 awS136S1200000_21) {
        if (Intrinsics.LJFF(((ViewOnClickListenerC1349290lDT) awS136S1200000_21.l1).LLJL, awS136S1200000_21.s0)) {
            ((ViewOnClickListenerC1349290lDT) awS136S1200000_21.l1).LJIIJ((C1349350lDZ) awS136S1200000_21.l2, EnumC1349330lDX.VISIBLE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS136S1200000_21 awS136S1200000_21) {
        if (Intrinsics.LJFF(((ViewOnClickListenerC1349290lDT) awS136S1200000_21.l1).LLJL, awS136S1200000_21.s0)) {
            ((ViewOnClickListenerC1349290lDT) awS136S1200000_21.l1).LJIIJ((C1349350lDZ) awS136S1200000_21.l2, EnumC1349330lDX.GONE);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS136S1200000_21 awS136S1200000_21) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        FragmentManager fragmentManagerLJ;
        List<Fragment> listLJJLIIIJL;
        ((ShareMessageToastHelper) awS136S1200000_21.l1).getClass();
        Context contextLIZIZ = ShareMessageToastHelper.LIZIZ();
        if (contextLIZIZ != null) {
            String str = awS136S1200000_21.s0;
            C1365810le7 c1365810le7 = (C1365810le7) awS136S1200000_21.l2;
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", str, bundle);
            C786410Ut5.LJJJI("enter_method", str, bundle);
            if (Intrinsics.LJFF(c1365810le7.LIZIZ, "streak_invite")) {
                IStreakService.LJJIIZ.getClass();
                IStreakService iStreakServiceLIZ = C06LY.LIZ();
                String str2 = c1365810le7.LJIIIZ;
                if (str2 == null) {
                    str2 = "";
                }
                iStreakServiceLIZ.L(str2);
            }
            if (Intrinsics.LJFF(c1365810le7.LIZIZ, "web") && (abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (fragmentManagerLJ = abstractC1387200mCcLJ.LJ()) != null && (listLJJLIIIJL = fragmentManagerLJ.LJJLIIIJL()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Fragment fragment : listLJJLIIIJL) {
                    if (fragment instanceof AppCompatDialogFragment) {
                        arrayList.add(fragment);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((DialogFragment) it2.next()).dismiss();
                }
            }
            C1336205Ku.LIZ(false).getImChatService().LJIIL(contextLIZIZ, bundle, true, null);
            IIMChatService iIMChatService = (IIMChatService) PluggableExtentionKt.pluggableSpiForReal(IIMChatService.class);
            if (iIMChatService != null) {
                iIMChatService.LJJIFFI();
            }
        }
        C1365810le7 c1365810le72 = (C1365810le7) awS136S1200000_21.l2;
        C1440005kM.LIZ(new C0N5F(c1365810le72, c1365810le72.LJIIIIZZ));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS136S1200000_21 awS136S1200000_21) {
        ((UpvoteListViewModelNew) awS136S1200000_21.l1).getClass();
        ((UpvoteListViewModelNew) awS136S1200000_21.l1).LJFF((UpvoteList) awS136S1200000_21.l2, awS136S1200000_21.s0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS136S1200000_21 awS136S1200000_21) throws JSONException {
        JSONArray jSONArrayPut = new JSONArray().put(((User) awS136S1200000_21.l1).getUid());
        JSONObject jSONObject = new JSONObject();
        C1396190mR7 c1396190mR7 = (C1396190mR7) awS136S1200000_21.l2;
        String str = awS136S1200000_21.s0;
        c1396190mR7.getClass();
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("aweme").authority("openShoot").appendQueryParameter("type", "use_sticker");
        Effect effect = ((C1624790sNp) c1396190mR7.LLILZIL.getValue(c1396190mR7, C1396190mR7.LLIZ[1])).LJIIIIZZ;
        if (effect == null) {
            effect = null;
        }
        String string = builderAppendQueryParameter.appendQueryParameter("sticker_id", effect.getEffect_id()).appendQueryParameter("session", str).appendQueryParameter("host_uid", C0CHQ.LIZ().getAccountService().getCurrentUserID()).build().toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("schema: ");
        sbLIZ.append(string);
        C201955140j.LIZIZ("SharedAR", C2188811AlT.LIZIZ(sbLIZ));
        jSONObject.put("schema", string);
        jSONObject.put("notice_type", "shared_ar_effect");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("receiver_ids", jSONArrayPut.toString());
        linkedHashMap.put("notice_content", u.LJJIFFI(C786410Ut5.J3(jSONObject), "\\", "", false));
        C013C c013c = new C013C();
        try {
            BaseResponse baseResponse = ((InterfaceC324680Co6) C1396180mR6.LIZ.getValue()).LIZ(linkedHashMap).execute().LIZIZ;
            if (baseResponse.status_code == 0) {
                c013c.element = true;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("invite friend response: ");
            sbLIZ2.append(baseResponse);
            C201955140j.LIZIZ("SharedAR", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("SharedAR", e);
        }
        C1396190mR7 c1396190mR72 = (C1396190mR7) awS136S1200000_21.l2;
        c1396190mR72.LIZJ(new AwS265S0300000_21(c1396190mR72, c013c, (User) awS136S1200000_21.l1, 13));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS136S1200000_21 awS136S1200000_21) {
        ((Function0) awS136S1200000_21.l1).invoke();
        ((C1340200kyo) awS136S1200000_21.l2).LJ(true);
        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        if (iTextToImageService != null) {
            iTextToImageService.LJIILJJIL(awS136S1200000_21.s0);
        }
        C1342740l2u c1342740l2u = C1342740l2u.LIZ;
        String str = awS136S1200000_21.s0;
        c1342740l2u.getClass();
        C1342740l2u.LIZ(str);
        ((C1340200kyo) awS136S1200000_21.l2).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS136S1200000_21 awS136S1200000_21) {
        CommentInlineBannerOverflowCell commentInlineBannerOverflowCell = (CommentInlineBannerOverflowCell) awS136S1200000_21.l1;
        String str = awS136S1200000_21.s0;
        Comment comment = ((C1342730l2t) awS136S1200000_21.l2).LL;
        commentInlineBannerOverflowCell.getClass();
        CommentInlineBannerOverflowCell.L5(comment, str);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS136S1200000_21 awS136S1200000_21) {
        CommentInlineBannerOverflowCell commentInlineBannerOverflowCell = (CommentInlineBannerOverflowCell) awS136S1200000_21.l1;
        String str = awS136S1200000_21.s0;
        Comment comment = ((C1342730l2t) awS136S1200000_21.l2).LL;
        commentInlineBannerOverflowCell.getClass();
        CommentInlineBannerOverflowCell.L5(comment, str);
        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        if (iTextToImageService != null) {
            iTextToImageService.LJIILJJIL(awS136S1200000_21.s0);
        }
        C1342740l2u c1342740l2u = C1342740l2u.LIZ;
        String str2 = awS136S1200000_21.s0;
        c1342740l2u.getClass();
        C1342740l2u.LIZ(str2);
        C1342740l2u.LIZLLL(awS136S1200000_21.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1200000_21(C1340200kyo c1340200kyo, String str, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l1 = function0;
        this.l2 = c1340200kyo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1200000_21(ViewOnClickListenerC1349290lDT viewOnClickListenerC1349290lDT, String str, C1349350lDZ c1349350lDZ, int i) {
        super(0);
        this.$t = i;
        this.l1 = viewOnClickListenerC1349290lDT;
        this.s0 = str;
        this.l2 = c1349350lDZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1200000_21(ShareMessageToastHelper shareMessageToastHelper, C1365810le7 c1365810le7, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = shareMessageToastHelper;
        this.l2 = c1365810le7;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1200000_21(CommentInlineBannerOverflowCell commentInlineBannerOverflowCell, String str, C1342730l2t c1342730l2t, int i) {
        super(0);
        this.$t = i;
        this.l1 = commentInlineBannerOverflowCell;
        this.s0 = str;
        this.l2 = c1342730l2t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1200000_21(User user, C1396190mR7 c1396190mR7, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = user;
        this.l2 = c1396190mR7;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1200000_21(UpvoteListViewModelNew upvoteListViewModelNew, boolean z, UpvoteList upvoteList, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = upvoteListViewModelNew;
        this.l2 = upvoteList;
        this.s0 = str;
    }
}
