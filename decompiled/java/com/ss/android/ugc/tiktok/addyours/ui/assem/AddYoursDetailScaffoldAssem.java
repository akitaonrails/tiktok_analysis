package com.ss.android.ugc.tiktok.addyours.ui.assem;

import X.C01D1;
import X.C01GW;
import X.C0NKE;
import X.C0OB2;
import X.C0ODC;
import X.C1255920ims;
import X.C1390410mHn;
import X.C1391190mJ3;
import X.C13LE;
import X.C13LQ;
import X.C1445970njP;
import X.C14EU;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C1935107i1;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C339190DRl;
import X.C343950De5;
import X.C418440Gaw;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C730000SkI;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursInfoStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursDetailScaffoldAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public TuxIconView LLIZLLLIL;
    public TuxIconView LLJ;
    public LinearLayout LLJI;
    public LinearLayout LLJIJIL;
    public TuxTextView LLJILJIL;
    public C1390410mHn LLJILJILJ;
    public FrameLayout LLJILLL;
    public Space LLJJ;
    public ConstraintLayout LLJJI;
    public C1749280vcc LLJJIII;
    public TuxIconView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final C1559260qg8 LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddYoursDetailScaffoldAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/tiktok/addyours/ui/vm/AddYoursDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddYoursDetailScaffoldAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursDetailViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1644), AFwS240S0000000_9.get$arr$(695), null, true);
        this.LLJJJ = new C1559260qg8(new C723590SZx(this, C0OB2.class, "AddYoursDetailPageHierarchyData"), checkSupervisorPrepared());
        this.LLJJJIL = C1935107i1.LIZ(new AwS553S0100000_9(this, 1645));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1749280vcc Ho() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.hby) : null;
            this.LLJJIII = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C1390410mHn Jo() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.nml) : null;
            this.LLJILJILJ = (C1390410mHn) viewFindViewById;
        }
        return (C1390410mHn) viewFindViewById;
    }

    public final C0OB2 Lo() {
        return (C0OB2) this.LLJJJ.getValue();
    }

    public final AddYoursDetailViewModel No() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (AddYoursDetailViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
    }

    public final AddYourRecordParam Go(boolean z) {
        AddYoursStickerStruct addYoursStickerStructCopy;
        String str;
        String string;
        String groupId;
        Aweme aweme;
        AddYoursInfoStruct addYoursInfoStruct;
        Aweme aweme2;
        AddYoursTopic addYoursTopic;
        Integer videoSource = null;
        if (!z && (addYoursTopic = No().getState().LL) != null) {
            List<AddYoursAvatar> listLJJLL = null;
            AddYoursStickerStruct addYoursStickerStruct = new AddYoursStickerStruct(addYoursTopic.getTopicId(), null, addYoursTopic.getText(), 0, null, addYoursTopic.getVideoCount(), addYoursTopic.getFromQuestion(), null, addYoursTopic.getViewerInvited(), System.currentTimeMillis(), 14.0f, addYoursTopic.getEoyCampaign(), addYoursTopic.getEoyCampaignSchema(), addYoursTopic.getTopicType());
            AddYoursAvatar[] addYoursAvatarArr = Lo().LLILZ;
            if (addYoursAvatarArr != null) {
                listLJJLL = C13LQ.LJJLL(addYoursAvatarArr);
            }
            addYoursStickerStructCopy = addYoursStickerStruct.copy(addYoursStickerStruct.topicId, addYoursStickerStruct.fromItemId, addYoursStickerStruct.text, addYoursStickerStruct.shootFrom, listLJJLL, addYoursStickerStruct.videoCount, addYoursStickerStruct.fromQuestion, addYoursStickerStruct.addYoursInvitees, addYoursStickerStruct.viewerInvited, addYoursStickerStruct.timeStamp, addYoursStickerStruct.fontSize, addYoursStickerStruct.eoyCampaign, addYoursStickerStruct.eoyCampaignSchema, addYoursStickerStruct.topicType);
        } else {
            addYoursStickerStructCopy = null;
        }
        String str2 = Lo().LLILLJJLI;
        if (str2 == null) {
            str2 = Lo().LL;
        }
        if (z) {
            str = "detail_page_new_prompt";
        } else {
            str = "detail_page_shoot";
        }
        Integer num = Lo().LLILLL;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        boolean z2 = !z;
        if (!z && (aweme2 = Lo().LLILZIL) != null) {
            groupId = aweme2.getGroupId();
        } else {
            groupId = null;
        }
        boolean z3 = Lo().LLILZLL;
        if (!z && (aweme = Lo().LLILZIL) != null && (addYoursInfoStruct = aweme.getAddYoursInfoStruct()) != null) {
            videoSource = addYoursInfoStruct.getVideoSource();
        }
        return new AddYourRecordParam(addYoursStickerStructCopy, z, false, str2, "add_yours", str, string, z2, z3, groupId, null, null, 0, null, null, null, null, null, false, false, null, videoSource, null, null, null, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oo(boolean r6) {
        /*
            r5 = this;
            X.19EG r4 = X.C724240Sb0.LIZ(r5)
            if (r4 != 0) goto L7
            return
        L7:
            if (r6 != 0) goto L3b
            X.0OB2 r0 = r5.Lo()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.LLILZIL
            if (r3 != 0) goto L23
            com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel r0 = r5.No()
            X.002o r0 = r0.getState()
            X.0OAr r0 = (X.C615110OAr) r0
            com.ss.android.ugc.aweme.addyours.model.AddYoursTopic r0 = r0.LL
            if (r0 == 0) goto L3b
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.getVideo()
        L23:
            com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam r2 = r5.Go(r6)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService> r0 = com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService r0 = (com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService) r0
            X.0OvL r0 = r0.LIZ(r4, r3, r2)
            r0.LJFF()
            return
        L3b:
            r3 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursDetailScaffoldAssem.Oo(boolean):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLoadEvent(C0ODC c0odc) {
        Long topicId;
        String string;
        Resources resources;
        String string2;
        Resources resources2;
        boolean z = c0odc.LIZ;
        C1255920ims<?> c1255920ims = c0odc.LIZIZ;
        Long l = c0odc.LIZJ;
        AddYoursTopic addYoursTopic = No().getState().LL;
        View viewFindViewById = null;
        if (addYoursTopic != null) {
            topicId = addYoursTopic.getTopicId();
        } else {
            topicId = null;
        }
        if (!Intrinsics.LJFF(l, topicId)) {
            return;
        }
        Jo().LIZLLL();
        if (z) {
            View view = this.LLJJI;
            if (view == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.pwk);
                }
                this.LLJJI = (ConstraintLayout) viewFindViewById;
                view = viewFindViewById;
            }
            C339190DRl.LIZIZ(view);
            return;
        }
        C730000SkI.LIZIZ.LIZLLL(249372161, false);
        C339190DRl.LIZIZ(Jo());
        C339190DRl.LIZLLL(Ho());
        C1749280vcc c1749280vccHo = Ho();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        Context context = getContext();
        String str = "";
        if (context == null || (resources2 = context.getResources()) == null || (string = resources2.getString(2131829437)) == null) {
            string = "";
        }
        Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null && (string2 = resources.getString(R.string.jb4)) != null) {
            str = string2;
        }
        AwS410S0200000_9 awS410S0200000_9 = new AwS410S0200000_9(this, (AddYoursDetailScaffoldAssem) c1255920ims, (C1255920ims<?>) 70);
        Double dValueOf = Double.valueOf(72.0d);
        C1893080zMY.LIZJ(c1722300uv6, string, str, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), R.raw.icon_large_refresh, awS410S0200000_9);
        c1749280vccHo.setStatus(c1722300uv6);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPublishStatus(C1445970njP c1445970njP) {
        Fragment fragmentLJI;
        if (c1445970njP.LIZ == 2 && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragmentLJI, new C343950De5() { // from class: X.0ODE
            });
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onTopicUpdated(C0NKE c0nke) {
        Long topicId;
        Long topicId2 = c0nke.LIZ.getTopicId();
        AddYoursTopic addYoursTopic = No().getState().LL;
        if (addYoursTopic != null) {
            topicId = addYoursTopic.getTopicId();
        } else {
            topicId = null;
        }
        if (Intrinsics.LJFF(topicId2, topicId)) {
            AddYoursDetailViewModel addYoursDetailViewModelNo = No();
            addYoursDetailViewModelNo.withState(new AwS375S0200000_9(addYoursDetailViewModelNo, c0nke.LIZ, 114));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[PHI: r3
      0x0074: PHI (r3v48 android.view.View) = (r3v47 android.view.View), (r3v51 android.view.View) binds: [B:22:0x005e, B:27:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[PHI: r5
      0x008c: PHI (r5v13 android.view.View) = (r5v12 android.view.View), (r5v15 android.view.View) binds: [B:30:0x0079, B:35:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursDetailScaffoldAssem.onViewCreated(android.view.View):void");
    }
}
