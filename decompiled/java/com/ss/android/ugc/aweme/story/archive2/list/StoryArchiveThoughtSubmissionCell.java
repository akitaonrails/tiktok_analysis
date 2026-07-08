package com.ss.android.ugc.aweme.story.archive2.list;

import X.C01GW;
import X.C0S1B;
import X.C1164050gOh;
import X.C1173900gea;
import X.C1220000hqw;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332060klg;
import X.C13LE;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1608750rxx;
import X.C20584815gk;
import X.C438710HIf;
import X.C452070Ho5;
import X.C452501pT;
import X.C555520LqY;
import X.C724750Sbp;
import X.C736950SvV;
import X.C737760Swo;
import X.C786410Ut5;
import X.EnumC1257160ios;
import X.EnumC1606080rte;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS91S0100000_24;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryArchiveThoughtSubmissionCell extends PowerCell<C1164050gOh> {
    public final C736950SvV LL = new C736950SvV(C13LE.LIZ(StoryArchiveV2ArchiveViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(397), null, null, null);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1157));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1158));

    public final void I5() {
        C1173900gea c1173900gea = C1173900gea.LIZ;
        boolean z = ((StoryArchiveV2ArchiveViewModel) this.LL.getValue()).LLILZ;
        c1173900gea.getClass();
        C1173900gea.LIZ(z, true);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "//story_thought_creation_activity");
        smartRouteBuildRoute.withParam("enter_from", ((StoryArchiveV2ArchiveViewModel) this.LL.getValue()).LLILLL);
        smartRouteBuildRoute.withParam("enter_method", "click_story_archive_entrance");
        smartRouteBuildRoute.withParam("story_archive_tab_name", "thought_tab");
        smartRouteBuildRoute.open();
    }

    public final AvatarComponentView L5() {
        return (AvatarComponentView) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C737760Swo c737760Swo = new C737760Swo(new C1606750ruj(EnumC1606080rte.ARCHIVE_V2, new C1606770rul(null, null, null, null, AFwS213S0000000_24.get$arr$(351), null, null, null, null, 495), 4));
        AvatarComponentView avatarComponentViewL5 = L5();
        C1608750rxx config = avatarComponentViewL5.getConfig();
        config.LIZ(AFwS264S0000000_24.get$arr$(396));
        config.LIZJ(c737760Swo);
        avatarComponentViewL5.LJFF(avatarComponentViewL5.getConfig());
        L5().setLayoutDirection(0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1164050gOh c1164050gOh = (C1164050gOh) interfaceC1891350zJl;
        super.onBindItemView(c1164050gOh);
        C20584815gk c20584815gk = (C20584815gk) this.LLILLL.getValue();
        c20584815gk.setBubbleStyle(EnumC1257160ios.ARCHIVE_POST_ENTRANCE);
        c20584815gk.setEnableDarkMode(false);
        ((C20584815gk) this.LLILLL.getValue()).setHintText(C555520LqY.LIZIZ(2131826623));
        User user = c1164050gOh.LL;
        C0S1B.LIZ(L5(), user.getUid(), user, this, false, null, 56);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.bwq);
        UrlModel avatarMedium = user.getAvatarMedium();
        if (avatarMedium == null && (avatarMedium = user.getAvatarThumb()) == null && (avatarMedium = user.getAvatarLarger()) == null) {
            smartImageView.setImageDrawable(null);
        } else {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarMedium));
            c1331670kl3LJIIIIZZ.LJJIFFI = new C1332060klg(25, 4, 0);
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        C786410Ut5.I7(new AkS91S0100000_24(this, 10), L5());
        L5().getClickListener().setOnNodeClickListener(new AwS638S0100000_24(this, 158));
        C786410Ut5.I7(new AkS91S0100000_24(this, 11), this.itemView);
        C786410Ut5.I7(new AkS91S0100000_24(this, 12), (View) this.LLILLL.getValue());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.fb4, false, 4, null);
    }
}
