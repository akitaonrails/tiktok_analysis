package kotlin.jvm.internal;

import X.C09AY;
import X.C0SY7;
import X.C291001Au;
import X.C712380Rwy;
import X.C712920Rxq;
import X.C718770SHj;
import X.C718790SHl;
import X.C718970SId;
import X.C721640SSk;
import X.C737560SwU;
import Y.ARunnableS30S0110000_11;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interactive.FriendsNormalInteractiveAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interactive.FriendsRepostCommentInteractAssem;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.services.IMainService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AwS99S0110000_11 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0110000_11(Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.z1 = true;
    }

    public static final Object invoke$0(AwS99S0110000_11 awS99S0110000_11, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.MQ2((FriendsNormalInteractiveAssem) awS99S0110000_11.l0, AFwS243S0000000_11.get$arr$(221));
        assembler.MQ2((FriendsNormalInteractiveAssem) awS99S0110000_11.l0, AFwS243S0000000_11.get$arr$(222));
        if (awS99S0110000_11.z1) {
            assembler.MQ2((FriendsNormalInteractiveAssem) awS99S0110000_11.l0, AFwS243S0000000_11.get$arr$(223));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS99S0110000_11 awS99S0110000_11, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.MQ2((FriendsRepostCommentInteractAssem) awS99S0110000_11.l0, AFwS243S0000000_11.get$arr$(224));
        assembler.MQ2((FriendsRepostCommentInteractAssem) awS99S0110000_11.l0, AFwS243S0000000_11.get$arr$(225));
        if (awS99S0110000_11.z1) {
            assembler.MQ2((FriendsRepostCommentInteractAssem) awS99S0110000_11.l0, AFwS243S0000000_11.get$arr$(226));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS99S0110000_11 awS99S0110000_11, Object obj) throws JSONException {
        String str;
        JSONObject jSONObject = (JSONObject) obj;
        if (awS99S0110000_11.z1) {
            str = "tag_people_page";
        } else {
            str = "video_post_page";
        }
        jSONObject.put("page_name", str);
        jSONObject.put("close_type", ((C737560SwU) awS99S0110000_11.l0).getCloseType());
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS99S0110000_11 awS99S0110000_11, Object obj) {
        IMainService iMainService = (IMainService) ServiceManager.get().getService(IMainService.class);
        boolean z = awS99S0110000_11.z1;
        CommentPublishViewModel commentPublishViewModel = (CommentPublishViewModel) awS99S0110000_11.l0;
        iMainService.tryShowIllegalUsernameDialog("comment", new ARunnableS30S0110000_11(commentPublishViewModel, z, 4), new ARunnableS30S0110000_11(commentPublishViewModel, z, 5));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS99S0110000_11 awS99S0110000_11, Object obj) {
        C718970SId c718970SId = (C718970SId) obj;
        VideoDescVM videoDescVM = ((C718790SHl) awS99S0110000_11.l0).LLILLL;
        if (awS99S0110000_11.z1) {
            videoDescVM.LLJLIL = c718970SId;
        } else {
            videoDescVM.LLJL = c718970SId;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS99S0110000_11 awS99S0110000_11, Object obj) {
        C718970SId c718970SId = (C718970SId) obj;
        VideoDescVM videoDescVM = ((C718770SHj) awS99S0110000_11.l0).LLILLJJLI;
        if (awS99S0110000_11.z1) {
            videoDescVM.LLJLIL = c718970SId;
        } else {
            videoDescVM.LLJL = c718970SId;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS99S0110000_11 awS99S0110000_11, Object obj) {
        C721640SSk c721640SSk = C721640SSk.LIZ;
        RelationButton relationButton = (RelationButton) awS99S0110000_11.l0;
        boolean z = awS99S0110000_11.z1;
        c721640SSk.getClass();
        C721640SSk.LJIJ(relationButton, z, (C0SY7) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS99S0110000_11 awS99S0110000_11, Object obj) {
        return C712920Rxq.LIZ((C712920Rxq) obj, null, null, new Pair(Boolean.valueOf(awS99S0110000_11.z1), ((Aweme) awS99S0110000_11.l0).getAid()), 3);
    }

    public static final Object invoke$8(AwS99S0110000_11 awS99S0110000_11, Object obj) {
        C291001Au c291001Au = new C291001Au((Aweme) awS99S0110000_11.l0);
        C291001Au c291001Au2 = new C291001Au(Boolean.valueOf(awS99S0110000_11.z1));
        obj.getClass();
        return new C712380Rwy(c291001Au, c291001Au2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0110000_11(FriendsNormalInteractiveAssem friendsNormalInteractiveAssem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = friendsNormalInteractiveAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0110000_11(FriendsRepostCommentInteractAssem friendsRepostCommentInteractAssem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = friendsRepostCommentInteractAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0110000_11(RelationButton relationButton, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = relationButton;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0110000_11(boolean z, C718770SHj c718770SHj, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c718770SHj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0110000_11(boolean z, C718790SHl c718790SHl, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c718790SHl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0110000_11(boolean z, C737560SwU c737560SwU, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c737560SwU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0110000_11(boolean z, CommentPublishViewModel commentPublishViewModel, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = commentPublishViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0110000_11(boolean z, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = aweme;
    }
}
