package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.storyreveal;

import X.C03IT;
import X.C0QSJ;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1361180lWe;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C197039127h;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C427760Gpy;
import X.C673150Qan;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC428930Grr;
import X.EnumC429060Gs4;
import X.InterfaceC1146704e9;
import X.InterfaceC448830Hir;
import X.InterfaceC658750Psf;
import X.InterfaceC687730QyJ;
import X.InterfaceC704110Rjd;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.storyreveal.FriendsV3StoryRevealPromoCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseSimpleCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.aweme.story.model.RevealStoryPromoCardInfo;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS264S0000000_24;
import org.json.JSONObject;
import wh6.AbS700S0100000_19;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3StoryRevealPromoCell extends FriendsV3BaseSimpleCell<C1361180lWe> implements C0QSJ, InterfaceC1146704e9 {
    public final int LL = 3;
    public BottomSlideIndicatorAbility LLILLJJLI;
    public IPhotoModeAbility LLILLL;
    public IPhotoSlidesAbility LLILZ;
    public IPhotoSlidesEventDispatchAbility LLILZIL;
    public ISlideIndicatorAbility LLILZLL;
    public ICommercePhotoSlideAbility LLIZ;
    public ICarouselComponentTranslationAbility LLIZLLLIL;
    public PauseTimeAbility LLJ;
    public FeedBarSearchAbility LLJI;
    public InterfaceC448830Hir LLJIJIL;
    public InterfaceC704110Rjd LLJILJIL;
    public FcpMetaTagAbility LLJILJILJ;
    public List<InterfaceC687730QyJ> LLJILLL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLILLJJLI = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLILLL = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLILZ = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLILZIL = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLILZLL = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLIZ = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLIZLLLIL = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJ = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJI = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.LLJILLL, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJIJIL = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJILJIL = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJILJILJ = (FcpMetaTagAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            return this.LLILLJJLI;
        }
        if (cls == IPhotoModeAbility.class) {
            return this.LLILLL;
        }
        if (cls == IPhotoSlidesAbility.class) {
            return this.LLILZ;
        }
        if (cls == IPhotoSlidesEventDispatchAbility.class) {
            return this.LLILZIL;
        }
        if (cls == ISlideIndicatorAbility.class) {
            return this.LLILZLL;
        }
        if (cls == ICommercePhotoSlideAbility.class) {
            return this.LLIZ;
        }
        if (cls == ICarouselComponentTranslationAbility.class) {
            return this.LLIZLLLIL;
        }
        if (cls == PauseTimeAbility.class) {
            return this.LLJ;
        }
        if (cls == FeedBarSearchAbility.class) {
            return this.LLJI;
        }
        if (cls == InterfaceC448830Hir.class) {
            return this.LLJIJIL;
        }
        if (cls == InterfaceC704110Rjd.class) {
            return this.LLJILJIL;
        }
        if (cls == FcpMetaTagAbility.class) {
            return this.LLJILJILJ;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cbt;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1588310rQz
    public final String gq() {
        return "cell_story_reveal_promo";
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLILLJJLI = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLILLL = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLILZ = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLILZIL = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLILZLL = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLIZ = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLIZLLLIL = null;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJ = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJI = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJIJIL = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJILJIL = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJILJILJ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLJILLL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        RadiusLayout radiusLayout;
        ImageView imageView;
        super.onItemViewCreated();
        View view = this.itemView;
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.imj)) != null) {
            imageView.setAdjustViewBounds(true);
        }
        View view2 = this.itemView;
        if (view2 != null && (radiusLayout = (RadiusLayout) view2.findViewById(R.id.imk)) != null) {
            radiusLayout.setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, radiusLayout.getContext());
            radiusLayout.LIZIZ(numLIZJ != null ? numLIZJ.intValue() : 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), 0, 0);
        }
        C2211631BhB.LJ(this.itemView, AFwS257S0000000_19.get$arr$(163));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseSimpleCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1361180lWe c1361180lWe) {
        RevealStoryPromoCardInfo revealStoryPromoCardInfo;
        View viewFindViewById;
        TuxTextView tuxTextView;
        C197039127h c197039127h;
        C427760Gpy c427760Gpy;
        View view;
        TuxTextView tuxTextView2;
        List listLJJJJLI;
        int size;
        List<String> urlList;
        final ImageView imageView;
        File fileZu;
        View viewFindViewById2;
        Context context;
        Resources resources;
        String packageName;
        View view2;
        AvatarComponentView avatarComponentView;
        C427660Gpo avatar;
        Context context2;
        AvatarComponentView avatarComponentView2;
        super.onBindItemView(c1361180lWe);
        final Aweme aweme = c1361180lWe.LL;
        if (aweme == null || (revealStoryPromoCardInfo = aweme.getRevealStoryPromoCardInfo()) == null) {
            return;
        }
        View view3 = this.itemView;
        if (view3 != null && (avatarComponentView2 = (AvatarComponentView) view3.findViewById(R.id.imf)) != null) {
            avatarComponentView2.getConfig().LIZ(AFwS264S0000000_24.get$arr$(708));
            avatarComponentView2.LJFF(avatarComponentView2.getConfig());
        }
        View view4 = this.itemView;
        if (view4 != null && (context = view4.getContext()) != null && (resources = context.getResources()) != null) {
            View view5 = this.itemView;
            if (view5 != null && (context2 = view5.getContext()) != null) {
                packageName = context2.getPackageName();
            } else {
                packageName = null;
            }
            int iN3 = C786410Ut5.n3(resources, "icon_bitmap_story_reveal", "raw", packageName);
            if (iN3 != 0 && (view2 = this.itemView) != null && (avatarComponentView = (AvatarComponentView) view2.findViewById(R.id.imf)) != null && (avatar = avatarComponentView.getAvatar()) != null) {
                C427660Gpo.LJIIJJI(avatar, Integer.valueOf(iN3), false, null, null, false, false, null, null, false, null, 1022);
            }
        }
        View view6 = this.itemView;
        if (view6 != null && (viewFindViewById2 = view6.findViewById(R.id.imf)) != null) {
            C786410Ut5.I7(new AbS700S0100000_19(this, 14), viewFindViewById2);
        }
        View view7 = this.itemView;
        if (view7 != null && (imageView = (ImageView) view7.findViewById(R.id.imj)) != null) {
            IFriendsTabV3Service iFriendsTabV3Service = (IFriendsTabV3Service) PluggableExtentionKt.pluggableSpi$default(IFriendsTabV3Service.class, false, false, false, 14, null);
            if (iFriendsTabV3Service != null && (fileZu = iFriendsTabV3Service.Zu("story_reveal/story_reveal_friends3_promotion.png")) != null && fileZu.exists()) {
                C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(fileZu);
                c1331670kl3LJII.LJJI(imageView);
                c1331670kl3LJII.LJJJIL = new InterfaceC658750Psf() { // from class: X.0rZl
                    @Override // X.InterfaceC658750Psf
                    public final /* synthetic */ void Ck(JSONObject jSONObject) {
                    }

                    @Override // X.InterfaceC658750Psf
                    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
                        if (!z) {
                            FriendsV3StoryRevealPromoCell friendsV3StoryRevealPromoCell = this.LL;
                            Aweme aweme2 = aweme;
                            ImageView imageView2 = imageView;
                            friendsV3StoryRevealPromoCell.getClass();
                            FriendsV3StoryRevealPromoCell.L5(aweme2, imageView2);
                        }
                    }
                };
                c1331670kl3LJII.LJIIJJI();
            } else {
                L5(aweme, imageView);
            }
        }
        View view8 = this.itemView;
        if (view8 != null && (c427760Gpy = (C427760Gpy) view8.findViewById(R.id.img)) != null && (view = this.itemView) != null && (tuxTextView2 = (TuxTextView) view.findViewById(R.id.imi)) != null) {
            List<User> list = revealStoryPromoCardInfo.revealFriendUsers;
            if (list == null || (listLJJJJLI = C13LP.LJJJJLI(list)) == null) {
                listLJJJJLI = C13BV.INSTANCE;
            }
            Integer num = revealStoryPromoCardInfo.totalFriendCount;
            if (num != null) {
                size = num.intValue();
            } else {
                size = listLJJJJLI.size();
            }
            c427760Gpy.setMaxImageNum(this.LL);
            c427760Gpy.setStacking(EnumC429060Gs4.LAST_ON_TOP);
            c427760Gpy.setSize(EnumC428930Grr.X_SMALL);
            if (listLJJJJLI.isEmpty()) {
                C786410Ut5.LLLLLL(c427760Gpy, 8);
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            } else {
                C786410Ut5.LLLLLL(c427760Gpy, 0);
                int i = 0;
                for (Object obj : C13LP.LL(listLJJJJLI, this.LL)) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        UrlModel avatarThumb = ((User) obj).getAvatarThumb();
                        if (avatarThumb != null && (urlList = avatarThumb.getUrlList()) != null && !urlList.isEmpty()) {
                            C03IT c03it = new C03IT(urlList);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("avatar_");
                            sbLIZ.append(i);
                            C427760Gpy.LIZ(c427760Gpy, i, c03it, C2188811AlT.LIZIZ(sbLIZ), null, null, false, null, 2040);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                c427760Gpy.setTotalCount(Math.min(listLJJJJLI.size(), Math.min(size, this.LL)));
                tuxTextView2.setText(C20642515q3.LJ(2131755726, size, String.valueOf(size)));
            }
        }
        View view9 = this.itemView;
        if (view9 != null && (c197039127h = (C197039127h) view9.findViewById(R.id.imh)) != null) {
            c197039127h.LJJJJL(AFwS234S0000000_5.get$arr$(497));
        }
        View view10 = this.itemView;
        if (view10 != null && (tuxTextView = (TuxTextView) view10.findViewById(R.id.imh)) != null) {
            tuxTextView.setTextColorRes(R.attr.a0o);
        }
        View view11 = this.itemView;
        if (view11 != null && (viewFindViewById = view11.findViewById(R.id.imh)) != null) {
            C786410Ut5.I7(new AbS700S0100000_19(this, 15), viewFindViewById);
        }
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLJILLL == null) {
            this.LLJILLL = new ArrayList();
        }
        ((ArrayList) this.LLJILLL).add(interfaceC687730QyJ);
    }

    public static void L5(Aweme aweme, ImageView imageView) {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        List<String> urlList;
        String str;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && !imageList.isEmpty() && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(0, imageList)) != null && (urlModel = photoModeImageUrlModel.displayImageNoWatermark) != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLZIJ(0, urlList)) != null && str.length() != 0) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJI(imageView);
            c1331670kl3LJIIIZ.LJIIJJI();
        }
    }
}
