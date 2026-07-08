package com.ss.android.ugc.aweme.story.archive2.list;

import X.C01GW;
import X.C0FNT;
import X.C0S1B;
import X.C1164040gOg;
import X.C1173900gea;
import X.C1220000hqw;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332060klg;
import X.C13LE;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1608750rxx;
import X.C438710HIf;
import X.C452070Ho5;
import X.C452501pT;
import X.C563770M9f;
import X.C724750Sbp;
import X.C736950SvV;
import X.C737760Swo;
import X.C786410Ut5;
import X.EnumC1606080rte;
import X.InterfaceC1891350zJl;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocMediaPickerService;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS91S0100000_24;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryArchiveV2ListSubmissionCell extends PowerCell<C1164040gOg> {
    public final C736950SvV LL = new C736950SvV(C13LE.LIZ(StoryArchiveV2ArchiveViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(399), null, null, null);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1159));

    public final void I5() {
        Activity activityLIZ;
        C563770M9f c563770M9fLIZLLL;
        C1173900gea c1173900gea = C1173900gea.LIZ;
        boolean z = ((StoryArchiveV2ArchiveViewModel) this.LL.getValue()).LLILZ;
        c1173900gea.getClass();
        C1173900gea.LIZ(z, false);
        Context context = this.itemView.getContext();
        if (context == null || (activityLIZ = C0FNT.LIZ(context)) == null) {
            return;
        }
        if (((StoryArchiveV2ArchiveViewModel) this.LL.getValue()).LLILZ) {
            activityLIZ.onBackPressed();
            return;
        }
        SocMediaPickerService socMediaPickerService = (SocMediaPickerService) PluggableExtentionKt.pluggableSpi$default(SocMediaPickerService.class, false, false, false, 14, null);
        if (socMediaPickerService == null || (c563770M9fLIZLLL = socMediaPickerService.LIZLLL()) == null) {
            return;
        }
        c563770M9fLIZLLL.startStoryPublish(activityLIZ, new EnterStoryParam(null, "story_archive", "personal_homepage", null, null, null, null, null, new ShootExtraData("personal_homepage", null, null, null, "story_archive", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777198, null), false, false, false, 0, 0.0f, 18, null, null, null, null, null, null, false, "story_tab", false, null, null, 62897913, null), c563770M9fLIZLLL.chooseBPEAToken("bpea-story_profile_photo_request_read_storage_permission_2_target34", "bpea-story_profile_photo_request_read_storage_permission_2_target33", "bpea-story_profile_photo_request_read_storage_permission_2"));
    }

    public final AvatarComponentView L5() {
        return (AvatarComponentView) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C737760Swo c737760Swo = new C737760Swo(new C1606750ruj(EnumC1606080rte.ARCHIVE_V2, new C1606770rul(null, null, null, null, AFwS213S0000000_24.get$arr$(352), null, null, null, null, 495), 4));
        AvatarComponentView avatarComponentViewL5 = L5();
        C1608750rxx config = avatarComponentViewL5.getConfig();
        config.LIZ(AFwS264S0000000_24.get$arr$(398));
        config.LIZJ(c737760Swo);
        avatarComponentViewL5.LJFF(avatarComponentViewL5.getConfig());
        L5().setLayoutDirection(0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1164040gOg c1164040gOg = (C1164040gOg) interfaceC1891350zJl;
        super.onBindItemView(c1164040gOg);
        User user = c1164040gOg.LL;
        C0S1B.LIZ(L5(), user.getUid(), user, this, false, null, 56);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.bwq);
        UrlModel avatarMedium = user.getAvatarMedium();
        if (avatarMedium == null && (avatarMedium = user.getAvatarThumb()) == null) {
            avatarMedium = user.getAvatarLarger();
        }
        if (avatarMedium == null) {
            smartImageView.setImageDrawable(null);
            smartImageView.setBackgroundColor(0);
        } else {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarMedium));
            c1331670kl3LJIIIIZZ.LJJIFFI = new C1332060klg(25, 4, 0);
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        C786410Ut5.I7(new AkS91S0100000_24(this, 13), L5());
        L5().getClickListener().setOnNodeClickListener(new AwS638S0100000_24(this, 159));
        C786410Ut5.I7(new AkS91S0100000_24(this, 14), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.fb3, false, 4, null);
    }
}
