package com.ss.android.ugc.aweme.story.feed.revealpromo;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C197039127h;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C628500Oky;
import X.C630740Ooa;
import X.C631450Opj;
import X.C706480RnS;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import X.InterfaceC691660RBc;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.anim.IStoryDetailMorphAnimationAvatarAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS88S0100000_19;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryRevealPromoCardLogicAssem extends BaseCellSlotComponent<StoryRevealPromoCardLogicAssem> implements IStoryDetailMorphAnimationAvatarAbility {
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public C197039127h LLJZ;
    public SmartImageView LLJZIJLIL;
    public View LLL;
    public final C630740Ooa LLLF = C628500Oky.LIZ(new AwS555S0100000_11(this, 904));
    public final C01GW LLLFF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(473));
    public boolean LLLFFI;

    @Override // com.ss.android.ugc.aweme.story.anim.IStoryDetailMorphAnimationAvatarAbility
    public final View Hy1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        this.LLLFFI = false;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).LJLLLL();
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fdy;
    }

    @Override // com.ss.android.ugc.aweme.story.anim.IStoryDetailMorphAnimationAvatarAbility
    public final String getCurrentUid() {
        return "reveal_story";
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 905);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_reveal_promo_card_content", true, awS555S0100000_11);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLF.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, IStoryDetailMorphAnimationAvatarAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLF.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, IStoryDetailMorphAnimationAvatarAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        view.findViewById(R.id.tfk);
        this.LLJZIJLIL = (SmartImageView) view.findViewById(R.id.tfg);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.tfj);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.tfh);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.tfi);
        this.LLJZ = c197039127h;
        if (c197039127h != null) {
            c197039127h.LJJJJL(AFwS243S0000000_11.get$arr$(472));
        }
        C197039127h c197039127h2 = this.LLJZ;
        if (c197039127h2 != null) {
            c197039127h2.setButtonStartIcon(Integer.valueOf(R.raw.icon_camera_fill));
        }
        C197039127h c197039127h3 = this.LLJZ;
        if (c197039127h3 != null) {
            c197039127h3.setTextColorRes(R.attr.zi);
        }
        C197039127h c197039127h4 = this.LLJZ;
        if (c197039127h4 != null) {
            c197039127h4.setIconTintColorRes(R.attr.zi);
        }
        C197039127h c197039127h5 = this.LLJZ;
        if (c197039127h5 != null) {
            C786410Ut5.I7(new AkS88S0100000_19(this, 2), c197039127h5);
        }
        View viewFindViewById = view.findViewById(R.id.w9v);
        this.LLL = viewFindViewById;
        if (viewFindViewById != null) {
            C631450Opj.LIZ(viewFindViewById, Float.valueOf(C418440Gaw.LIZIZ(12)), null, null, null, null, 30);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0ROi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(137), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        List<String> urlList;
        String str;
        List<Aweme> stories;
        Aweme aweme;
        PhotoModeImageInfo photoModeImageInfo;
        String string;
        String string2;
        VideoItemParams videoItemParams2 = videoItemParams;
        TuxTextView tuxTextView = this.LLJLLIL;
        String string3 = null;
        if (tuxTextView != null) {
            Context context = getContext();
            if (context != null) {
                string2 = context.getString(2131849099);
            } else {
                string2 = null;
            }
            tuxTextView.setText(string2);
        }
        TuxTextView tuxTextView2 = this.LLJLLL;
        if (tuxTextView2 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                string = context2.getString(2131849096);
            } else {
                string = null;
            }
            tuxTextView2.setText(string);
        }
        C197039127h c197039127h = this.LLJZ;
        if (c197039127h != null) {
            Context context3 = getContext();
            if (context3 != null) {
                string3 = context3.getString(2131849097);
            }
            c197039127h.setText(string3);
        }
        UserStory userStory = videoItemParams2.getAweme().getUserStory();
        if (userStory == null || (stories = userStory.getStories()) == null || (aweme = (Aweme) C13LP.LJJJLL(stories)) == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null) {
            PhotoModeImageInfo photoModeImageInfo2 = videoItemParams2.getAweme().getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null) {
                imageList = photoModeImageInfo2.getImageList();
            } else {
                return;
            }
        }
        if (imageList != null && !imageList.isEmpty() && this.LLJZIJLIL != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(0, imageList)) != null && (urlModel = photoModeImageUrlModel.displayImageNoWatermark) != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLZIJ(0, urlList)) != null && str.length() != 0) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJIJL(getContext());
            c1331670kl3LJIIIZ.LJJI(this.LLJZIJLIL);
            c1331670kl3LJIIIZ.LJIIJJI();
        }
    }
}
