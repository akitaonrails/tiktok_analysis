package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.other;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C08QP;
import X.C09RB;
import X.C0QSJ;
import X.C109100bB;
import X.C1196320hEk;
import X.C11JF;
import X.C1246100iX2;
import X.C1361330lWt;
import X.C1361350lWv;
import X.C13BV;
import X.C13DA;
import X.C13LE;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558420qem;
import X.C1587160rP8;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1939607ik;
import X.C19719912Dl;
import X.C2097908Jt;
import X.C2177241AIw;
import X.C2177251AIx;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C452080Ho6;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC1361290lWp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC448830Hir;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC704110Rjd;
import X.InterfaceC713360RyY;
import Y.AfS193S0100000_24;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ability.BottomSlideIndicatorAbility;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.ICommercePhotoSlideAbility;
import com.ss.android.ugc.aweme.ad.feed.translation.ability.ICarouselComponentTranslationAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.friendstab.model.ContentMetadata;
import com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.RepostUserNewContent;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseSimpleCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PageViewModel;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentMeta;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS703S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3RepostEntranceCell extends FriendsV3BaseSimpleCell<C1361330lWt> implements FriendsV3ViewStateProtocol, InterfaceC713360RyY, CommonCellAbility, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(171));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 477));
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public C11JF LLILZIL;
    public List<C1587160rP8> LLILZLL;
    public final AssemVMLazy LLIZ;
    public BottomSlideIndicatorAbility LLIZLLLIL;
    public IPhotoModeAbility LLJ;
    public IPhotoSlidesAbility LLJI;
    public IPhotoSlidesEventDispatchAbility LLJIJIL;
    public ISlideIndicatorAbility LLJILJIL;
    public ICommercePhotoSlideAbility LLJILJILJ;
    public ICarouselComponentTranslationAbility LLJILLL;
    public PauseTimeAbility LLJJ;
    public FeedBarSearchAbility LLJJI;
    public InterfaceC448830Hir LLJJIII;
    public InterfaceC704110Rjd LLJJIJI;
    public FcpMetaTagAbility LLJJIJIIJIL;
    public List<InterfaceC687730QyJ> LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3RepostEntranceCell.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
    public final InterfaceC713360RyY Fz2() {
        return this;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLIZLLLIL = (BottomSlideIndicatorAbility) obj;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJ = (IPhotoModeAbility) obj;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJI = (IPhotoSlidesAbility) obj;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJIJIL = (IPhotoSlidesEventDispatchAbility) obj;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJILJIL = (ISlideIndicatorAbility) obj;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJILJILJ = (ICommercePhotoSlideAbility) obj;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJILLL = (ICarouselComponentTranslationAbility) obj;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJJ = (PauseTimeAbility) obj;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJJI = (FeedBarSearchAbility) obj;
            C687700QyG.LJFF(this, this.LLJJIJIL, obj, cls);
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJJIII = (InterfaceC448830Hir) obj;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJJIJI = (InterfaceC704110Rjd) obj;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJJIJIIJIL = (FcpMetaTagAbility) obj;
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
            return this.LLIZLLLIL;
        }
        if (cls == IPhotoModeAbility.class) {
            return this.LLJ;
        }
        if (cls == IPhotoSlidesAbility.class) {
            return this.LLJI;
        }
        if (cls == IPhotoSlidesEventDispatchAbility.class) {
            return this.LLJIJIL;
        }
        if (cls == ISlideIndicatorAbility.class) {
            return this.LLJILJIL;
        }
        if (cls == ICommercePhotoSlideAbility.class) {
            return this.LLJILJILJ;
        }
        if (cls == ICarouselComponentTranslationAbility.class) {
            return this.LLJILLL;
        }
        if (cls == PauseTimeAbility.class) {
            return this.LLJJ;
        }
        if (cls == FeedBarSearchAbility.class) {
            return this.LLJJI;
        }
        if (cls == InterfaceC448830Hir.class) {
            return this.LLJJIII;
        }
        if (cls == InterfaceC704110Rjd.class) {
            return this.LLJJIJI;
        }
        if (cls == FcpMetaTagAbility.class) {
            return this.LLJJIJIIJIL;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cbg;
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
        return "cell_repost_entrance";
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == BottomSlideIndicatorAbility.class) {
            this.LLIZLLLIL = null;
        } else if (cls == IPhotoModeAbility.class) {
            this.LLJ = null;
        } else if (cls == IPhotoSlidesAbility.class) {
            this.LLJI = null;
        } else if (cls == IPhotoSlidesEventDispatchAbility.class) {
            this.LLJIJIL = null;
        } else if (cls == ISlideIndicatorAbility.class) {
            this.LLJILJIL = null;
        } else if (cls == ICommercePhotoSlideAbility.class) {
            this.LLJILJILJ = null;
        } else if (cls == ICarouselComponentTranslationAbility.class) {
            this.LLJILLL = null;
        } else if (cls == PauseTimeAbility.class) {
            this.LLJJ = null;
        } else if (cls == FeedBarSearchAbility.class) {
            this.LLJJI = null;
        } else if (cls == InterfaceC448830Hir.class) {
            this.LLJJIII = null;
        } else if (cls == InterfaceC704110Rjd.class) {
            this.LLJJIJI = null;
        } else if (cls == FcpMetaTagAbility.class) {
            this.LLJJIJIIJIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLJJIJIL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    public FriendsV3RepostEntranceCell() {
        AssemVMLazy assemVMLazy;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILLL = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 466));
        this.LLILZ = C452501pT.LIZ(enumC452301pR, new AwS568S0100000_24(this, 468));
        this.LLILZLL = C13BV.INSTANCE;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3PageViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 479);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(145);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 467), awS568S0100000_24, AFwS224S0000000_33.get$arr$(321), new AwS568S0100000_24((C03K6) this, 469), new AwS568S0100000_24((C03K6) this, 471), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 473), aFwS264S0000000_24, new AwS568S0100000_24((C03K6) this, 475), null, new AwS568S0100000_24((C03K6) this, 476));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24((C03K6) this, 470);
            AwS568S0100000_24 awS568S0100000_243 = new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 472);
            AwS568S0100000_24 awS568S0100000_244 = new AwS568S0100000_24(c19719912DlLIZ, 474);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS568S0100000_242, 83));
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c01gwLIZIZ, 2202);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33(c01gwLIZIZ, 2203);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(c01gwLIZIZ, 2204);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c01gwLIZIZ, 2205);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2206);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS568S0100000_244, awS568S0100000_24, new C452080Ho6(), awS577S0100000_33, awS577S0100000_332, awS568S0100000_243, aFwS264S0000000_24, awS577S0100000_333, awS577S0100000_334, awS577S0100000_335);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 478), awS568S0100000_24, AFwS224S0000000_33.get$arr$(322), new AwS568S0100000_24((C03K6) this, 480), new AwS568S0100000_24((C03K6) this, 481), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 482), aFwS264S0000000_24, new AwS568S0100000_24((C03K6) this, 483), null, new AwS568S0100000_24((C03K6) this, 484));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 485), awS568S0100000_24, AFwS224S0000000_33.get$arr$(323), new AwS568S0100000_24((C03K6) this, 486), new AwS568S0100000_24((C03K6) this, 487), new AwS568S0100000_24((C03K6) this, 488), aFwS264S0000000_24, null, null, new AwS568S0100000_24((C03K6) this, 465));
        }
        this.LLIZ = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final List<View> AG0() {
        return Collections.singletonList(this.itemView);
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int L5() {
        C1361350lWv c1361350lWv;
        NewContentResponse.RepostFeedRedDotResponse repostFeedRedDotResponse;
        C1361330lWt c1361330lWt = (C1361330lWt) getItem();
        if (c1361330lWt == null || (c1361350lWv = c1361330lWt.LLILLJJLI) == null || (repostFeedRedDotResponse = c1361350lWv.LIZIZ) == null) {
            return 0;
        }
        return repostFeedRedDotResponse.getRedDotCount();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseSimpleCell, X.InterfaceC1588310rQz
    public final InterfaceC1361290lWp LJIL() {
        return (InterfaceC1361290lWp) getItem();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        C11JF c11jf;
        super.onDestroy();
        C11JF c11jf2 = this.LLILZIL;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LLILZIL) != null) {
            c11jf.dispose();
        }
        C1554610qYd.LIZLLL(C1558420qem.LIZIZ(this), FriendsV3ViewStateProtocol.class, this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1554610qYd.LIZJ(C1558420qem.LIZIZ(this), FriendsV3ViewStateProtocol.class, C1697810uHb.LJIILJJIL(this));
        C786410Ut5.I7(new AbS703S0100000_24(this, 5), this.itemView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List<X.0rP8>] */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.13BV] */
    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.vh.FriendsV3BaseSimpleCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1361330lWt c1361330lWt) {
        ?? arrayList;
        ContentMetadata contentMetadata;
        C11JF c11jf;
        Resources resources;
        super.onBindItemView(c1361330lWt);
        ArrayList<RepostUserNewContent> avatarList = c1361330lWt.LLILLJJLI.LIZIZ.getAvatarList();
        String quantityString = null;
        if (avatarList == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            Iterable metaList = c1361330lWt.LLILLJJLI.LIZIZ.getMetaList();
            if (metaList == null) {
                metaList = C13BV.INSTANCE;
            }
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(metaList, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Object obj : metaList) {
                linkedHashMap.put(((ContentMetadata) obj).itemId, obj);
            }
            List<UserNewContent> listLJJII = C09RB.LJJII(C09RB.LJJI(new C08QP(C09RB.LJIJI(new C1939607ik(avatarList), AFwS264S0000000_24.get$arr$(581)), AFwS264S0000000_24.get$arr$(582)), 3));
            arrayList = new ArrayList();
            for (UserNewContent userNewContent : listLJJII) {
                FriendsRedDotUser user = userNewContent.getUser();
                if (user != null && (contentMetadata = (ContentMetadata) linkedHashMap.get(userNewContent.getItemId())) != null) {
                    String str = contentMetadata.itemId;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(new C1587160rP8(user, new RepostNewContentMeta(str, contentMetadata.shareRecallReason)));
                }
            }
        }
        this.LLILZLL = arrayList;
        if (L5() >= 1) {
            TextView textView = (TextView) this.LLILZ.getValue();
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                quantityString = resources.getQuantityString(2131755450, L5(), Integer.valueOf(L5()));
            }
            textView.setText(quantityString);
        }
        List<C1587160rP8> list = this.LLILZLL;
        ArrayList<FriendsRedDotUser> arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1587160rP8> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().LIZ);
        }
        Context context2 = this.itemView.getContext();
        C11JF c11jf2 = this.LLILZIL;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LLILZIL) != null) {
            c11jf.dispose();
        }
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        for (FriendsRedDotUser friendsRedDotUser : arrayList2) {
            arrayList3.add(new MutualUser("", friendsRedDotUser.nickname, null, friendsRedDotUser.avatarThumb, friendsRedDotUser.uid, null));
        }
        this.LLILZIL = (C11JF) new C2177241AIw(context2, C1246100iX2.LIZ(new MutualStruct(0, size, arrayList3, 0)), new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), null, 0, 3, 0.0f, 0.0f, 0, 0, Boolean.valueOf(C444960Hcc.LIZIZ()), null, true, false, false, null, 104380)).LIZLLL().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS193S0100000_24(this, 26));
    }

    public final void P5(boolean z) {
        String str;
        if (z) {
            str = "ttsocial_friend_tab_view_repost_btn_show";
        } else {
            str = "ttsocial_friend_tab_view_repost_btn_click";
        }
        C109100bB c109100bB = C109100bB.LIZ;
        C13DA c13da = new C13DA();
        c13da.put("friends_tab_version", "v3.0");
        c13da.put("enter_from", "homepage_friends");
        c13da.put("repost_cnt", Integer.valueOf(L5()));
        Map mapBuild = c13da.build();
        c109100bB.getClass();
        C109100bB.LIZ(str, mapBuild);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLJJIJIL == null) {
            this.LLJJIJIL = new ArrayList();
        }
        ((ArrayList) this.LLJJIJIL).add(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3ViewStateProtocol
    public final void EK2(View view, boolean z) {
        if (z) {
            P5(true);
        }
    }
}
