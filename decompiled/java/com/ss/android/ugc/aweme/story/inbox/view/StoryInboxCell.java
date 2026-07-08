package com.ss.android.ugc.aweme.story.inbox.view;

import X.AbstractC1597860rgO;
import X.AbstractC2211791BhR;
import X.AnonymousClass0956;
import X.C01GW;
import X.C054G;
import X.C05S0;
import X.C098200Yq;
import X.C09A1;
import X.C0AWK;
import X.C0M9T;
import X.C0PEM;
import X.C0ZE7;
import X.C1076010e6h;
import X.C10EU;
import X.C1203704nL;
import X.C1243240iSQ;
import X.C1253000iiA;
import X.C1256360ina;
import X.C1256470inl;
import X.C1256560inu;
import X.C135600fS;
import X.C1387040mCM;
import X.C13LP;
import X.C1439480nYw;
import X.C1439490nYx;
import X.C1439905kL;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1595350rcL;
import X.C1597880rgQ;
import X.C1597910rgT;
import X.C1598120rgo;
import X.C1601110rld;
import X.C1605390rsX;
import X.C1605400rsY;
import X.C1606250rtv;
import X.C1606280rty;
import X.C1606290rtz;
import X.C1606320ru2;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1607400rvm;
import X.C1608320rxG;
import X.C1608680rxq;
import X.C1608750rxx;
import X.C1609930rzr;
import X.C1618440sDa;
import X.C189200o6;
import X.C1BNE;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2252321DDq;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C2344009Gk;
import X.C278330AvX;
import X.C294120Bfu;
import X.C295190Bhd;
import X.C296550Bjp;
import X.C330620Cxg;
import X.C330700Cxo;
import X.C339190DRl;
import X.C418440Gaw;
import X.C443000HYs;
import X.C452501pT;
import X.C614770O9j;
import X.C628500Oky;
import X.C630740Ooa;
import X.C718010SEl;
import X.C728010Sh5;
import X.C728060ShA;
import X.C729510SjV;
import X.C735620StM;
import X.C737760Swo;
import X.C786410Ut5;
import X.C814420VxA;
import X.C897370ZIh;
import X.C897520ZIw;
import X.C946803n0;
import X.EnumC1256540ins;
import X.EnumC1256590inx;
import X.EnumC1605470rsf;
import X.EnumC1605560rso;
import X.EnumC1606080rte;
import X.EnumC1606090rtf;
import X.EnumC1607270rvZ;
import X.EnumC1608710rxt;
import X.EnumC1910450zoZ;
import X.InterfaceC1256280inS;
import X.InterfaceC1256490inn;
import X.InterfaceC1595080rbu;
import X.InterfaceC1595200rc6;
import X.InterfaceC1597970rgZ;
import X.InterfaceC1600130rk3;
import X.InterfaceC1605410rsZ;
import X.InterfaceC1605510rsj;
import X.InterfaceC1606260rtw;
import X.InterfaceC1891350zJl;
import X.InterfaceC897380ZIi;
import X.ViewOnLongClickListenerC1620730sHH;
import Y.ACListenerS158S0100000_24;
import Y.AObserverS223S0100000_19;
import Y.ARunnableS124S0100000_24;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxSkylightWidgetAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISkylightMafService;
import com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell;
import com.ss.android.ugc.aweme.story.experiment.StoryInboxLegacyNoteBubbleShowEtFixExp;
import com.ss.android.ugc.aweme.story.experiment.thought.AvatarThoughtsConfigs;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager;
import com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback;
import com.zhiliaoapp.musically.R;
import irm.AkS88S0100000_19;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS125S1000000_19;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryInboxCell extends LongClickAbilitySkylightCell<StoryInboxItem> implements InterfaceC1595200rc6, InterfaceC1605510rsj, InterfaceC1256490inn {
    public static final C054G LLLFF = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public AnonymousClass0956 LLILLJJLI;
    public String LLILLL;
    public int LLILZ;
    public String LLILZIL;
    public Long LLILZLL;
    public Map<String, String> LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public Long LLJI;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJL;
    public StoryNoteDataCollection LLJZ;
    public boolean LLJZIJLIL;
    public StoryNoteDataCollection LLLF;
    public EnumC1605470rsf LLJIJIL = EnumC1605470rsf.DEFAULT;
    public final C1605400rsY LLJILJIL = new InterfaceC1606260rtw() { // from class: X.0rsY
        @Override // X.InterfaceC1606260rtw
        public final void LJ() {
        }

        @Override // X.InterfaceC1606260rtw
        public final void LIZ() {
            this.LIZ.getClass();
            if (StoryInboxCell.J6()) {
                StoryInboxCell storyInboxCell = this.LIZ;
                if (storyInboxCell.LLJJIJIL) {
                    storyInboxCell.U5();
                    storyInboxCell.w6();
                }
            }
        }
    };
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1187));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1186));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1189));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1192));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1191));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1190));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1188));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 833));
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(AFwS207S0000000_19.get$arr$(323));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1857));
    public final C01GW LLJLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(360));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(359));
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(361));
    public final C2252321DDq LLL = C1BNE.LIZ(null);

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", "notification_page"), new Pair("head_type", "story"));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fbv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        Aweme storyCollection;
        UserStory userStory;
        Aweme storyCollection2;
        User author;
        Aweme storyCollection3;
        User author2;
        super.onViewAttachedToWindow();
        if (J6()) {
            C330620Cxg.LIZ.LJI();
        }
        this.LLJJJJ = true;
        this.LLJJL = false;
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = true;
        String strB6 = b6();
        StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
        int followStatus = (storyInboxItem == null || (storyCollection3 = storyInboxItem.getStoryCollection()) == null || (author2 = storyCollection3.getAuthor()) == null) ? 0 : author2.getFollowStatus();
        StoryInboxItem storyInboxItem2 = (StoryInboxItem) getItem();
        String uid = (storyInboxItem2 == null || (storyCollection2 = storyInboxItem2.getStoryCollection()) == null || (author = storyCollection2.getAuthor()) == null) ? null : author.getUid();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StoryInboxItem storyInboxItem3 = (StoryInboxItem) getItem();
        linkedHashMap.put("is_read", String.valueOf((storyInboxItem3 == null || (storyCollection = storyInboxItem3.getStoryCollection()) == null || (userStory = storyCollection.getUserStory()) == null || !userStory.getAllViewed()) ? 0 : 1));
        C1595350rcL.LIZJ(this, strB6, uid, followStatus, null, linkedHashMap, 50);
        if (StoryInboxLegacyNoteBubbleShowEtFixExp.INSTANCE.fallback()) {
            StoryInboxItem storyInboxItem4 = (StoryInboxItem) getItem();
            if (storyInboxItem4 != null && r6().LJJZZI().getVisibility() == 0) {
                S6(storyInboxItem4.getLatestStoryNoteInfo(), storyInboxItem4.isMe() && storyInboxItem4.getLatestStoryNoteInfo() == null, storyInboxItem4.getStoryCollection().getAuthor());
            }
        } else {
            m7(false);
        }
        K6();
        StoryInboxItem storyInboxItem5 = (StoryInboxItem) getItem();
        if (storyInboxItem5 != null) {
            r7(storyInboxItem5);
        }
    }

    public final void w6() {
        this.LLILZLL = null;
        C339190DRl.LIZIZ(v6());
        W5();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final EnumC1605560rso I5() {
        return this.LLJJIJIL ? EnumC1605560rso.ADD_STORY : EnumC1605560rso.MUTE_STORIES;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        return (View) this.LLJJ.getValue();
    }

    public final void T6() {
        Long l;
        int i = this.LLIZLLLIL;
        if (i <= 0 || this.LLJ == i || !this.LLJJJJ || !this.LLJJJJJIL || !this.LLJJJJLIIL || (l = this.LLILZLL) == null) {
            return;
        }
        long jLongValue = l.longValue();
        if (v6().getVisibility() != 0 || jLongValue <= 0) {
            return;
        }
        long jLongValue2 = l.longValue();
        Map<String, String> mapLJ = this.LLIZ;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = mapLJ.get("enter_from");
        if (str == null) {
            str = "notification_page";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String str2 = mapLJ.get("enter_method");
        if (str2 == null) {
            str2 = "top_cell";
        }
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LIZLLL(jLongValue2, "view_cnt");
        C20684815ws.LJIILLIIL("ttsocial_top_cell_viewinfo_show", c2344009Gk.LIZ);
        this.LLJ = this.LLIZLLLIL;
    }

    public final void U5() {
        this.LLILZ++;
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0zJl] */
    public final boolean V5() {
        if (this.LLJJIJIL && C1601110rld.LIZ() && C1618440sDa.LIZIZ.LJJIFFI().LJIIIIZZ()) {
            return false;
        }
        StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
        if (storyInboxItem != null && storyInboxItem.isReveal()) {
            return false;
        }
        ?? item = getItem();
        if (item != 0) {
            d6().C02(item);
            d6().rN0(item);
        }
        return true;
    }

    public final AvatarComponentView X5() {
        return (AvatarComponentView) this.LLJILLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String b6() {
        if (this.LLJJIJIL) {
            return "create";
        }
        StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
        return (storyInboxItem == null || !storyInboxItem.isReveal()) ? "story" : "story_reveal";
    }

    public final boolean c6() {
        String str;
        if (!this.LLJJIJIL) {
            return false;
        }
        StoryNoteDataCollection storyNoteDataCollection = this.LLLF;
        return (storyNoteDataCollection == null || (str = storyNoteDataCollection.text) == null || str.length() == 0) && System.currentTimeMillis() < AvatarThoughtsConfigs.LIZ().newUserGuideExpireDate;
    }

    public final InterfaceC1600130rk3 d6() {
        return (InterfaceC1600130rk3) this.LLJILJILJ.getValue();
    }

    public final IStoryThoughtMyDataManager i6() {
        return (IStoryThoughtMyDataManager) this.LLJLIL.getValue();
    }

    public final boolean i7() {
        return C1606250rtv.LIZIZ || this.LLJIJIL == EnumC1605470rsf.PROGRESS;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        int iLIZIZ;
        ViewGroup viewGroup;
        super.onItemViewCreated();
        C1607400rvm c1607400rvm = C1607400rvm.LIZIZ;
        EnumC1606080rte enumC1606080rte = EnumC1606080rte.INBOX_TOP_LIST;
        C897520ZIw c897520ZIwLJI = null;
        c1607400rvm.LIZIZ(enumC1606080rte, new C1608320rxG(this.itemView, X5(), (View) null, (View) this.LLJJ.getValue(), (TuxIconView) null, 48), C295190Bhd.LIZIZ());
        C737760Swo c737760Swo = new C737760Swo(new C1606750ruj(enumC1606080rte, new C1606770rul(null, new AwS638S0100000_24(this, 203), new AwS603S0100000_24(this, 662), new AwS638S0100000_24(this, 204), new AwS563S0100000_19(this, 3304), AFwS213S0000000_24.get$arr$(622), null, null, null, 449), 4));
        EnumC1606090rtf enumC1606090rtf = EnumC1606090rtf.INBOX_TOP_LIST;
        C0ZE7 c0ze7 = (C0ZE7) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (C294120Bfu.LIZIZ()) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            c897520ZIwLJI = C897370ZIh.LIZ().LJI(EnumC1910450zoZ.INBOX_SKYLIGHT_STORY, false);
        }
        C1607280rva c1607280rva = new C1607280rva(new C1607310rvd(enumC1606090rtf, c0ze7, false, false, c897520ZIwLJI, 110));
        AvatarComponentView avatarComponentViewX5 = X5();
        C1608750rxx config = avatarComponentViewX5.getConfig();
        new AwS603S0100000_24(this, 664).invoke(config.LIZ);
        if (C294120Bfu.LIZIZ()) {
            config.LIZJ(c1607280rva);
        }
        config.LIZJ(new C1606290rtz(0));
        config.LIZJ(c737760Swo);
        C728010Sh5.LIZ.getClass();
        if (C728010Sh5.LIZIZ()) {
            config.LIZJ(new C1606320ru2(0));
        }
        if (z6()) {
            config.LIZJ(new C1606280rty(new C735620StM(EnumC1606080rte.INBOX)));
        }
        config.LIZIZ(AFwS264S0000000_24.get$arr$(736));
        avatarComponentViewX5.LJFF(avatarComponentViewX5.getConfig());
        this.itemView.setTag(R.id.kah, X5());
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 121), this.itemView);
        if (Y() || z6() || C728010Sh5.LIZIZ()) {
            AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1847);
            X5().LIZ(3, new ACListenerS158S0100000_24(awS568S0100000_24, 116));
            this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1620730sHH(awS568S0100000_24, 3));
        }
        X5().getClickListener().setOnNodeClickListener(new AwS638S0100000_24(this, 199));
        InterfaceC1605410rsZ avatarEventAbility = X5().getAvatarEventAbility();
        if (avatarEventAbility != null) {
            avatarEventAbility.LIZIZ(new AwS638S0100000_24(this, 201));
        }
        if (z6()) {
            C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0rsW
                public Function0<String> LJ;
                public final boolean LJFF = true;
                public final boolean LJI = true;
                public final int LJII = 100;
                public final C1620890sHX LJIIIIZZ;

                @Override // X.AbstractC2211791BhR
                public final int LIZJ() {
                    return this.LJII;
                }

                @Override // X.AbstractC2211791BhR
                public final Function0<String> LIZLLL() {
                    return this.LJ;
                }

                @Override // X.AbstractC2211791BhR
                public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                    return this.LJIIIIZZ;
                }

                @Override // X.AbstractC2211791BhR
                public final boolean LJIIIIZZ() {
                    return this.LJI;
                }

                @Override // X.AbstractC2211791BhR
                public final boolean LJIIIZ() {
                    return this.LJFF;
                }

                {
                    this.LJ = new AwS568S0100000_24(this, 1846);
                    this.LJIIIIZZ = new C1620890sHX(this, 7);
                }

                @Override // X.AbstractC2211791BhR
                public final void LJIILL(Function0<String> function0) {
                    this.LJ = function0;
                }
            });
        }
        if (C1439905kL.LIZ() || C1256360ina.LIZ()) {
            C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0inh
                public Function0<String> LJ;
                public final boolean LJFF = true;
                public final C1266070j3F LJI;

                @Override // X.AbstractC2211791BhR
                public final boolean LJIIIIZZ() {
                    return false;
                }

                @Override // X.AbstractC2211791BhR
                public final Function0<String> LIZLLL() {
                    return this.LJ;
                }

                @Override // X.AbstractC2211791BhR
                public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                    return this.LJI;
                }

                @Override // X.AbstractC2211791BhR
                public final boolean LJIIIZ() {
                    return this.LJFF;
                }

                {
                    this.LJ = new AwS563S0100000_19(this, 3303);
                    this.LJI = new C1266070j3F(this, 4);
                }

                @Override // X.AbstractC2211791BhR
                public final void LJIILL(Function0<String> function0) {
                    this.LJ = function0;
                }
            });
        }
        if (J6() && J6() && v6().getParent() != X5()) {
            ViewParent parent = v6().getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(v6(), viewGroup);
            }
            AvatarComponentView avatarComponentViewX52 = X5();
            View viewV6 = v6();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)));
            layoutParams.addRule(13);
            avatarComponentViewX52.addView(viewV6, layoutParams);
            j7();
            HandlerHook.viewPost(X5(), new ARunnableS124S0100000_24(this, 162));
        }
        if (C443000HYs.LIZ()) {
            r6().setContentMaxLines(2);
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(74));
        } else {
            r6().setContentMaxLines(3);
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
        }
        r6().LJIL(EnumC1256540ins.INBOX);
        r6().setContentMaxWidth(iLIZIZ);
        j7();
        C786410Ut5.I7(new AkS88S0100000_19(this, 11), r6().LJJZZI());
        C1595350rcL.LIZ.LIZLLL(this, new AwS603S0100000_24(this, 663));
        if (C1253000iiA.LIZ()) {
            C1076010e6h.LIZJ.LIZIZ().LIZ().observe(this, new AObserverS223S0100000_19(this, 77));
        }
        if (C1439905kL.LIZ()) {
            C05S0 c05s0 = C05S0.LIZ;
            C2252321DDq c2252321DDq = this.LLL;
            boolean z = ((Number) C0AWK.LIZ.getValue()).intValue() == 1;
            AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(this, 260);
            c05s0.getClass();
            C05S0.LIZ(this, c2252321DDq, z, awS598S0100000_19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p7() {
        String strLIZ;
        Aweme storyCollection;
        User author;
        if (this.LLJJIJIL) {
            strLIZ = this.itemView.getContext().getString((C278330AvX.LIZ("inbox") && ((Boolean) C278330AvX.LIZLLL.getValue()).booleanValue()) ? 2131856811 : C278330AvX.LIZ("inbox") ? 2131856810 : !this.LLJJJ ? 2131849136 : 2131849137);
        } else {
            StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
            if (storyInboxItem == null || !storyInboxItem.isReveal()) {
                StoryInboxItem storyInboxItem2 = (StoryInboxItem) getItem();
                if (storyInboxItem2 == null || (storyCollection = storyInboxItem2.getStoryCollection()) == null || (author = storyCollection.getAuthor()) == null) {
                    strLIZ = null;
                } else {
                    C1243240iSQ.LIZ.getClass();
                    strLIZ = C1243240iSQ.LIZ(author, true);
                }
            } else {
                strLIZ = this.itemView.getContext().getString(2131849103);
            }
        }
        ((TextView) this.LLJJ.getValue()).setText(strLIZ);
        C1387040mCM.LIZ(this.itemView, new AwS125S1000000_19(strLIZ, 3));
    }

    public final InterfaceC1256280inS r6() {
        return (InterfaceC1256280inS) this.LLJJIJIIJIL.getValue();
    }

    public final InterfaceC1597970rgZ u6() {
        return (InterfaceC1597970rgZ) this.LLJLLL.getValue();
    }

    public final View v6() {
        return (View) this.LLJJI.getValue();
    }

    public final boolean z6() {
        return ((Boolean) this.LLJLLIL.getValue()).booleanValue();
    }

    public static boolean J6() {
        return C0M9T.LIZ().enableViewerInsightOverlay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K6() {
        boolean zIsCacheData;
        StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
        if (storyInboxItem == null || !storyInboxItem.isMe()) {
            C1597880rgQ c1597880rgQ = C1597910rgT.LIZJ().LIZIZ;
            int i = 3;
            if (c1597880rgQ.LIZLLL || c1597880rgQ.LIZIZ >= 3) {
                return;
            }
            StoryInboxItem storyInboxItem2 = (StoryInboxItem) getItem();
            if (storyInboxItem2 != null) {
                zIsCacheData = storyInboxItem2.isCacheData(C1597910rgT.LIZJ().LIZJ);
                if (zIsCacheData) {
                    i = 0;
                }
            } else {
                zIsCacheData = false;
            }
            C1597910rgT.LIZJ().LIZLLL(i, zIsCacheData, false);
            if (this.LLJJJJJIL && this.LLJJJJLIIL) {
                AbstractC1597860rgO.LJI(C1597910rgT.LIZJ().LIZIZ, zIsCacheData);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1595200rc6
    public final C1605390rsX LLLLLLL() {
        String str;
        String strLJIJJLI;
        String str2;
        List<RichTextInfo> list;
        Aweme latestStoryNoteInfo;
        StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
        StoryNoteInfo storyNoteInfo = (storyInboxItem == null || (latestStoryNoteInfo = storyInboxItem.getLatestStoryNoteInfo()) == null) ? null : latestStoryNoteInfo.storyNoteInfo;
        String strValueOf = String.valueOf(q6());
        String strValueOf2 = String.valueOf(h6());
        String strValueOf3 = String.valueOf(f6());
        String strValueOf4 = String.valueOf(0);
        if (storyNoteInfo != null) {
            Integer numValueOf = Integer.valueOf(storyNoteInfo.subType);
            str = (numValueOf == null || numValueOf.intValue() == 0) ? "" : "1";
        } else {
            str = null;
        }
        String strValueOf5 = String.valueOf(str);
        if (storyNoteInfo != null) {
            strLJIJJLI = C1609930rzr.LJIJJLI(Integer.valueOf(storyNoteInfo.subType));
            str2 = storyNoteInfo.text;
            list = storyNoteInfo.richText;
        } else {
            strLJIJJLI = null;
            str2 = null;
            list = null;
        }
        String strLJJI = C1609930rzr.LJJI(str2, list);
        String str3 = c6() ? "1" : CardStruct.IStatusCode.DEFAULT;
        C1256560inu c1256560inu = C1256560inu.LIZ;
        StoryInboxItem storyInboxItem2 = (StoryInboxItem) getItem();
        Aweme latestStoryNoteInfo2 = storyInboxItem2 != null ? storyInboxItem2.getLatestStoryNoteInfo() : null;
        c1256560inu.getClass();
        String strValueOf6 = String.valueOf(!C1256560inu.LIZLLL(latestStoryNoteInfo2) ? 0 : 1);
        StoryInboxItem storyInboxItem3 = (StoryInboxItem) getItem();
        return new C1605390rsX(strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strLJJI, str3, strValueOf6, String.valueOf(storyInboxItem3 != null ? storyInboxItem3.getDataFrom() : 0), strLJIJJLI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final User N5() {
        StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
        if (storyInboxItem != null) {
            return storyInboxItem.getUser();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View R5() {
        return X5();
    }

    public final void W5() {
        v6().setOnTouchListener(null);
        C786410Ut5.I7(null, v6());
    }

    public final View a6() {
        return X5().findViewById(C1608680rxq.LIZIZ(EnumC1607270rvZ.STORY, EnumC1608710rxt.BADGE, "icon"));
    }

    public final void a7() {
        View viewA6;
        View viewA62;
        View viewE6;
        if (e6() == null || (viewE6 = e6()) == null || viewE6.getVisibility() != 0) {
            if (a6() != null && (viewA6 = a6()) != null && viewA6.getVisibility() == 0) {
                viewA62 = a6();
            }
            V6(false);
        }
        viewA62 = e6();
        if (viewA62 != null) {
            viewA62.performClick();
        }
        V6(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final StoryInboxItem b7() {
        StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
        if (storyInboxItem == null) {
            return null;
        }
        if (!this.LLJJIJIL) {
            return storyInboxItem;
        }
        StoryInboxItem storyInboxItemCopy = storyInboxItem.copy(C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIIZZ(), storyInboxItem.priority, storyInboxItem.isMe, storyInboxItem.latestStoryNoteInfo, storyInboxItem.thoughtInfo, storyInboxItem.concernUserAvatarChanged, storyInboxItem.reRankSequence, storyInboxItem.reRankType, storyInboxItem.revealInfo, storyInboxItem.dataFrom, storyInboxItem.receiveTime);
        setItem(storyInboxItemCopy);
        this.LLJJJ = !C729510SjV.LJJII(storyInboxItemCopy.getStoryCollection());
        return storyInboxItemCopy;
    }

    public final View e6() {
        return X5().findViewById(C1608680rxq.LIZIZ(EnumC1607270rvZ.STORY, EnumC1608710rxt.RING, null));
    }

    public final int f6() {
        CharSequence contentText = r6().getContentText();
        return ((contentText == null || contentText.length() == 0) ? 1 : 0) ^ 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int h6() {
        Aweme storyCollection;
        InterfaceC1600130rk3 interfaceC1600130rk3D6 = d6();
        StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
        return interfaceC1600130rk3D6.ht0((storyInboxItem == null || (storyCollection = storyInboxItem.getStoryCollection()) == null) ? null : C729510SjV.LJIIIZ(storyCollection));
    }

    public final void j7() {
        if (J6()) {
            X5().setTranslationZ(0.0f);
            v6().setTranslationZ(0.0f);
            r6().LJJZZI().setTranslationZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        }
    }

    public final void k7() {
        int iIntValue;
        View avatar = X5().getAvatarDisplayView().get(EnumC1608710rxt.AVATAR);
        if (avatar == null && (avatar = X5().getAvatar()) == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(avatar.getWidth());
        if (numValueOf.intValue() > 0 || 0 != 0) {
            iIntValue = numValueOf.intValue();
        } else {
            Integer numValueOf2 = Integer.valueOf(X5().getAvatarSizePx());
            iIntValue = numValueOf2.intValue() > 0 ? numValueOf2.intValue() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        }
        Rect rect = new Rect(0, 0, avatar.getWidth(), avatar.getHeight());
        X5().offsetDescendantRectToMyCoords(avatar, rect);
        View viewV6 = v6();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iIntValue, iIntValue);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        layoutParams.leftMargin = rect.left;
        layoutParams.topMargin = rect.top;
        C786410Ut5.W5(viewV6, layoutParams);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (!eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJIJJ(this);
        }
        if (J6()) {
            C1606250rtv.LIZ.put(this, this.LLJILJIL);
        }
        C1256470inl.LL.LIZ(getContext());
        ((ArrayList) C1256470inl.LLILZIL).add(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        if (J6()) {
            C1606250rtv.LIZ.remove(this);
        }
        C1256470inl.LL.getClass();
        ((ArrayList) C1256470inl.LLILZIL).remove(this);
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJJI(this);
        }
        if (z6()) {
            C1076010e6h.LIZJ.LIZIZ().getRelationObservable().removeObservers(this);
        }
        i6().zH1("SCENE_INBOX_SKYLIGHT");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        this.LLJJJJ = false;
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int q6() {
        Aweme storyCollection;
        InterfaceC1600130rk3 interfaceC1600130rk3D6 = d6();
        StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
        return interfaceC1600130rk3D6.gF1((storyInboxItem == null || (storyCollection = storyInboxItem.getStoryCollection()) == null) ? null : C729510SjV.LJIIIZ(storyCollection));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        if (C1439905kL.LIZ()) {
            this.LLL.setValue(null);
        }
        if (this.LLJJIJIL) {
            i6().WB0((StoryNoteStatusChangeCallback) this.LLJLILLLLZIIL.getValue());
            if (J6()) {
                this.LLJIJIL = EnumC1605470rsf.DEFAULT;
                U5();
                w6();
                this.LLIZ = null;
                this.LLIZLLLIL = 0;
                this.LLJ = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.Aweme l7(com.ss.android.ugc.aweme.story.inbox.StoryInboxItem r7) {
        /*
            r3 = 1
            if (r7 == 0) goto Le
            boolean r0 = r7.isMe()
            if (r0 != r3) goto Le
            r0 = 1
        La:
            r2 = 0
            if (r0 != 0) goto L10
            return r2
        Le:
            r0 = 0
            goto La
        L10:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.getStoryCollection()
            com.ss.android.ugc.aweme.feed.model.story.UserStory r7 = r0.getUserStory()
            if (r7 != 0) goto L1b
            return r2
        L1b:
            java.util.List r6 = r7.getStories()
            if (r6 == 0) goto L85
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L85
            java.util.Iterator r5 = r6.iterator()
            r4 = 0
        L2c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r1 = r5.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.isStoryFakeAweme(r1)
            if (r0 != 0) goto L54
            com.ss.android.ugc.aweme.feed.model.story.Story r0 = r1.getStory()
            if (r0 == 0) goto L54
            boolean r0 = r0.viewed
            if (r0 != 0) goto L54
            com.ss.android.ugc.aweme.feed.model.story.Story r0 = r1.getStory()
            if (r0 == 0) goto L57
            boolean r0 = com.ss.android.ugc.aweme.feed.model.story.StoryKt.isExpired(r0)
            if (r0 != r3) goto L57
        L54:
            int r4 = r4 + 1
            goto L2c
        L57:
            if (r4 < 0) goto L5a
            goto L64
        L5a:
            java.lang.Integer r0 = com.ss.android.ugc.aweme.feed.model.story.UserStoryKt.currentIndex(r7)
            if (r0 == 0) goto L71
            int r4 = r0.intValue()
        L64:
            kotlin.Pair r0 = X.C708880RrK.LIZIZ(r6, r4, r7, r2)
            java.lang.Object r1 = r0.getSecond()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            if (r1 != 0) goto L77
            return r2
        L71:
            long r0 = r7.getCurrentPosition()
            int r4 = (int) r0
            goto L64
        L77:
            com.ss.android.ugc.aweme.feed.model.story.Story r0 = r1.getStory()
            if (r0 == 0) goto L84
            boolean r0 = com.ss.android.ugc.aweme.feed.model.story.StoryKt.isExpired(r0)
            if (r0 != r3) goto L84
            return r2
        L84:
            return r1
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell.l7(com.ss.android.ugc.aweme.story.inbox.StoryInboxItem):com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    public final boolean C6(String str) {
        if (((Number) C0AWK.LIZ.getValue()).intValue() != 1) {
            return true;
        }
        if (str == null || !Intrinsics.LJFF(str, this.LLJJJIL)) {
            return false;
        }
        return true;
    }

    public final boolean D6(StoryInboxItem storyInboxItem) {
        boolean z;
        if (!C0M9T.LIZ().enableViewerInsightOverlay || !this.LLJJIJIL || C729510SjV.LJJII(storyInboxItem.getStoryCollection())) {
            return false;
        }
        C718010SEl.LIZ.getClass();
        C718010SEl.LIZ();
        if (C0M9T.LIZ().enableDebugNewUserFromStorage) {
            z = C718010SEl.LJI().getBoolean(C718010SEl.LJ(), false);
        } else {
            Keva kevaLJI = C718010SEl.LJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TTKStoryViewerInsightEligibleNewUser_");
            sbLIZ.append(C718010SEl.LIZLLL());
            z = kevaLJI.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        }
        if (!z || C718010SEl.LJI().getBoolean(C718010SEl.LJII(), false)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1605510rsj
    public final void LLLLLZL(boolean z) {
        this.LLJJJJLIIL = z;
        if (!z || !this.LLJJJJ) {
            return;
        }
        StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
        if (storyInboxItem != null) {
            r7(storyInboxItem);
        }
        K6();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(com.ss.android.ugc.aweme.story.inbox.StoryInboxItem r11) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell.U6(com.ss.android.ugc.aweme.story.inbox.StoryInboxItem):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V6(boolean z) {
        Unit unit;
        InboxAbilityCenter$IInboxSkylightWidgetAbility inboxAbilityCenter$IInboxSkylightWidgetAbility;
        String str;
        String uid;
        int followStatus;
        Aweme storyCollection;
        UserStory userStory;
        Aweme storyCollection2;
        User author;
        Aweme storyCollection3;
        User author2;
        Aweme storyCollection4;
        User author3;
        StoryInboxItem storyInboxItem;
        int dataFrom;
        Unit unit2;
        InboxAbilityCenter$IInboxSkylightWidgetAbility inboxAbilityCenter$IInboxSkylightWidgetAbility2;
        String str2 = this.LLILZIL;
        String uid2 = null;
        if (((Boolean) C1203704nL.LIZ.getValue()).booleanValue()) {
            try {
                Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
                if (fragmentLIZ != null && (inboxAbilityCenter$IInboxSkylightWidgetAbility = (InboxAbilityCenter$IInboxSkylightWidgetAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), InboxAbilityCenter$IInboxSkylightWidgetAbility.class, null)) != null) {
                    inboxAbilityCenter$IInboxSkylightWidgetAbility.Qo0();
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        int i = 1;
        boolean zIsCacheData = false;
        if (((Boolean) C135600fS.LIZ.getValue()).booleanValue() && (storyInboxItem = (StoryInboxItem) getItem()) != null && (((dataFrom = storyInboxItem.getDataFrom()) == 1 || dataFrom == 2) && !d6().WM0())) {
            try {
                Fragment fragmentLIZ2 = C946803n0.LIZ(this.itemView);
                if (fragmentLIZ2 != null && (inboxAbilityCenter$IInboxSkylightWidgetAbility2 = (InboxAbilityCenter$IInboxSkylightWidgetAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ2, null), InboxAbilityCenter$IInboxSkylightWidgetAbility.class, null)) != null) {
                    inboxAbilityCenter$IInboxSkylightWidgetAbility2.ZN2();
                    unit2 = Unit.LIZ;
                } else {
                    unit2 = null;
                }
                C189200o6.m2constructorimpl(unit2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        int iLIZ = C1595350rcL.LIZ(this);
        String strB6 = b6();
        if (z) {
            str = "plus";
        } else {
            str = "head";
        }
        InterfaceC1595080rbu interfaceC1595080rbuLIZJ = C614770O9j.LIZIZ.LIZJ();
        int i2 = iLIZ - 1;
        StoryInboxItem storyInboxItem2 = (StoryInboxItem) getItem();
        if (storyInboxItem2 == null || (storyCollection4 = storyInboxItem2.getStoryCollection()) == null || (author3 = storyCollection4.getAuthor()) == null || (uid = author3.getUid()) == null) {
            uid = "";
        }
        interfaceC1595080rbuLIZJ.LJI(i2, "notification_page", null, strB6, str, uid, null);
        StoryInboxItem storyInboxItem3 = (StoryInboxItem) getItem();
        if (storyInboxItem3 != null && (storyCollection3 = storyInboxItem3.getStoryCollection()) != null && (author2 = storyCollection3.getAuthor()) != null) {
            followStatus = author2.getFollowStatus();
        } else {
            followStatus = 0;
        }
        StoryInboxItem storyInboxItem4 = (StoryInboxItem) getItem();
        if (storyInboxItem4 != null && (storyCollection2 = storyInboxItem4.getStoryCollection()) != null && (author = storyCollection2.getAuthor()) != null) {
            uid2 = author.getUid();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StoryInboxItem storyInboxItem5 = (StoryInboxItem) getItem();
        if (storyInboxItem5 == null || (storyCollection = storyInboxItem5.getStoryCollection()) == null || (userStory = storyCollection.getUserStory()) == null || !userStory.getAllViewed()) {
            i = 0;
        }
        linkedHashMap.put("is_read", String.valueOf(i));
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        C1595350rcL.LIZIZ(this, strB6, uid2, Integer.valueOf(followStatus), iLIZ, null, linkedHashMap, 34);
        StoryInboxItem storyInboxItem6 = (StoryInboxItem) getItem();
        if (storyInboxItem6 != null) {
            zIsCacheData = storyInboxItem6.isCacheData(C1597910rgT.LIZJ().LIZJ);
        }
        AbstractC1597860rgO.LJ(C1597910rgT.LIZJ().LIZIZ, zIsCacheData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1605510rsj
    public final void Z1(boolean z) {
        this.LLJJJJJIL = z;
        if (C296550Bjp.LIZ()) {
            if (!z) {
                u6().LJII();
                return;
            }
        } else if (!z) {
            return;
        }
        if (!this.LLJJJJ) {
            return;
        }
        StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
        if (storyInboxItem != null) {
            r7(storyInboxItem);
        }
        K6();
    }

    public final void h7(Aweme aweme) {
        AnonymousClass0956 anonymousClass0956;
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        if (aid.length() == 0) {
            return;
        }
        if (Intrinsics.LJFF(this.LLILLL, aid) && (anonymousClass0956 = this.LLILLJJLI) != null && anonymousClass0956.isActive()) {
            return;
        }
        U5();
        this.LLILLL = aid;
        int i = this.LLILZ + 1;
        this.LLILZ = i;
        this.LLILLJJLI = C23250099c.LIZLLL(LLLFF, null, null, new C330700Cxo(aid, aweme, i, this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m7(boolean z) {
        StoryInboxItem storyInboxItem;
        if (C1439905kL.LIZ() || C1256360ina.LIZ() || this.LLJJL || !this.LLJJJJ || (storyInboxItem = (StoryInboxItem) getItem()) == null) {
            return;
        }
        View viewLJJZZI = r6().LJJZZI();
        if (z || (viewLJJZZI.getVisibility() == 0 && viewLJJZZI.getAlpha() > 0.5f)) {
            this.LLJJL = true;
            S6(storyInboxItem.getLatestStoryNoteInfo(), this.LLJL, storyInboxItem.getStoryCollection().getAuthor());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        c1618440sDa.LJJIFFI();
        if (z6()) {
            C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(this, new AObserverS223S0100000_19(this, 76));
        }
        return c1618440sDa.LJJ().LIZLLL(viewGroup.getContext(), null, R.layout.fbv, viewGroup, false);
    }

    @C14EU
    public final void onStoryPublishAnimFinishEvent(C1439480nYw c1439480nYw) {
        if (Intrinsics.LJFF(c1439480nYw.LIZ, "inbox_top_cell") && this.LLJJIJIL) {
            C1618440sDa.LIZIZ.LJJJLZIJ().LIZIZ(X5().getAvatar());
        }
    }

    @C14EU
    public final void onStoryPublishAnimStartEvent(C1439490nYx c1439490nYx) {
        if (J6() && this.LLJJIJIL) {
            U5();
            w6();
        }
    }

    public final void r7(StoryInboxItem storyInboxItem) {
        if (!J6()) {
            return;
        }
        if (!D6(storyInboxItem)) {
            U5();
            this.LLILZLL = null;
            C339190DRl.LIZIZ(v6());
            W5();
            return;
        }
        Aweme awemeL7 = l7(storyInboxItem);
        if (awemeL7 == null) {
            U5();
            this.LLILZLL = null;
            C339190DRl.LIZIZ(v6());
            W5();
            return;
        }
        if (i7()) {
            w6();
        } else {
            T5(storyInboxItem, awemeL7, null);
            h7(awemeL7);
        }
    }

    @Override // X.InterfaceC1256490inn
    public final void xf(boolean z) {
        boolean z2;
        this.LLJZIJLIL = z;
        r6().LJIILIIL();
        InterfaceC1256280inS interfaceC1256280inSR6 = r6();
        if (z && this.LLJJIJIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        interfaceC1256280inSR6.setEnableStarSticker(z2);
    }

    public final void L6(StoryInboxItem storyInboxItem, int i) {
        ISkylightMafService iSkylightMafService;
        if (storyInboxItem == null || !z6() || !C10EU.LJIILJJIL(storyInboxItem.getStoryCollection().getAuthor())) {
            return;
        }
        if (i == 101 && (iSkylightMafService = (ISkylightMafService) PluggableExtentionKt.pluggableSpi$default(ISkylightMafService.class, false, false, false, 14, null)) != null) {
            iSkylightMafService.LJ();
        }
        u6().LIZIZ(i, storyInboxItem.getStoryCollection().getAuthor(), "notification_page");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n7(User user, StoryNoteDataCollection storyNoteDataCollection) {
        User author;
        Aweme storyCollection;
        this.LLLF = storyNoteDataCollection;
        String str = this.LLJJJIL;
        C1256560inu c1256560inu = C1256560inu.LIZ;
        AvatarComponentView avatarComponentViewX5 = X5();
        InterfaceC1256280inS interfaceC1256280inSR6 = r6();
        boolean z = this.LLJJIJIL;
        EnumC1256590inx enumC1256590inx = EnumC1256590inx.INBOX_SKYLINE;
        C1256560inu.LIZ(c1256560inu, avatarComponentViewX5, interfaceC1256280inSR6, this, z, null, storyNoteDataCollection, false, user, enumC1256590inx, null, new AwS173S1100000_24(this, str, 18), new AwS668S0100000_19(this, 54), 2280);
        j7();
        if (this.LLJJIJIL) {
            C728060ShA.LIZ.getClass();
            if (C728060ShA.LIZ()) {
                i6().e11((StoryNoteStatusChangeCallback) this.LLJLILLLLZIIL.getValue(), "SCENE_INBOX_SKYLIGHT");
            }
        }
        r6().setEnableStarSticker(C1256560inu.LJFF(storyNoteDataCollection, enumC1256590inx, this.LLJJIJIL, this.LLJZIJLIL));
        if (z6()) {
            StoryInboxItem storyInboxItem = (StoryInboxItem) getItem();
            if (storyInboxItem != null && (storyCollection = storyInboxItem.getStoryCollection()) != null) {
                author = storyCollection.getAuthor();
            } else {
                author = null;
            }
            if (C10EU.LJIILJJIL(author)) {
                C339190DRl.LIZIZ(r6().LJJZZI());
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        Aweme awemeL7;
        StoryInboxItem storyInboxItem = (StoryInboxItem) interfaceC1891350zJl;
        super.onBindItemView(storyInboxItem, list);
        String strLJIIIZ = C729510SjV.LJIIIZ(storyInboxItem.getStoryCollection());
        boolean z = false;
        if (!Intrinsics.LJFF(this.LLJJJIL, strLJIIIZ)) {
            this.LLIZ = null;
            this.LLIZLLLIL = 0;
            this.LLJ = 0;
        }
        this.LLJJJIL = strLJIIIZ;
        if (list.isEmpty()) {
            U6(storyInboxItem);
            return;
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (!(objLJJJLZIJ instanceof C1598120rgo)) {
            return;
        }
        if (((C1598120rgo) objLJJJLZIJ).LIZ) {
            U6(storyInboxItem);
            return;
        }
        if (!J6() || !this.LLJJJJ) {
            return;
        }
        boolean zLJIILJJIL = C729510SjV.LJIILJJIL(AwemeExtKt.getAuthorUid(storyInboxItem.getStoryCollection()));
        this.LLJJIJIL = zLJIILJJIL;
        if (zLJIILJJIL && !C729510SjV.LJJII(storyInboxItem.getStoryCollection())) {
            z = true;
        }
        this.LLJJJ = z;
        if (!D6(storyInboxItem) || i7() || (awemeL7 = l7(storyInboxItem)) == null) {
            return;
        }
        h7(awemeL7);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S6(com.ss.android.ugc.aweme.feed.model.Aweme r23, boolean r24, com.ss.android.ugc.aweme.profile.model.User r25) {
        /*
            r22 = this;
            com.ss.android.ugc.aweme.story.experiment.StoryInboxLegacyNoteBubbleShowEtFixExp r0 = com.ss.android.ugc.aweme.story.experiment.StoryInboxLegacyNoteBubbleShowEtFixExp.INSTANCE
            boolean r0 = r0.fallback()
            r4 = r0 ^ 1
            r3 = r22
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection r2 = r3.LLLF
            r11 = r24
            if (r4 == 0) goto L50
            boolean r0 = r3.LLJJIJIL
            if (r0 == 0) goto L50
            if (r11 != 0) goto L50
            r1 = 1
        L17:
            r0 = 0
            if (r1 != 0) goto L1b
            r2 = r0
        L1b:
            if (r4 == 0) goto L4e
            if (r2 == 0) goto L23
            java.lang.String r1 = r2.text
            if (r1 != 0) goto L31
        L23:
            X.0inS r1 = r3.r6()
            java.lang.CharSequence r1 = r1.getContentText()
            if (r1 == 0) goto L4e
            java.lang.String r1 = r1.toString()
        L31:
            r13 = r23
            if (r13 != 0) goto L52
            if (r11 != 0) goto L52
            if (r4 == 0) goto L4d
            if (r1 == 0) goto L41
            boolean r4 = kotlin.text.a0.LJJJIL(r1)
            if (r4 == 0) goto L52
        L41:
            if (r2 == 0) goto L4d
            java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo> r4 = r2.richText
            if (r4 == 0) goto L4d
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L52
        L4d:
            return
        L4e:
            r1 = r0
            goto L31
        L50:
            r1 = 0
            goto L17
        L52:
            X.0Sti r5 = X.C735840Sti.LIZ
            java.lang.String r6 = "note_bubble_show"
            java.lang.String r7 = "notification_page"
            java.lang.String r8 = "top_cell_bubble"
            int r9 = r3.q6()
            int r10 = r3.q6()
            X.0inS r4 = r3.r6()
            boolean r14 = r4.LJIILL()
            X.0inS r4 = r3.r6()
            java.lang.String r15 = r4.getNotePromptText()
            boolean r4 = r3.c6()
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r4)
            if (r13 == 0) goto Lab
            X.0inu r4 = X.C1256560inu.LIZ
            r4.getClass()
            boolean r4 = X.C1256560inu.LIZLLL(r13)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r4)
        L89:
            X.0inS r4 = r3.r6()
            boolean r18 = r4.LJIJ()
            X.0inS r3 = r3.r6()
            java.lang.String r19 = r3.getMentionUidsString()
            if (r2 == 0) goto L9d
            java.util.List<com.ss.android.ugc.aweme.feed.model.story.RichTextInfo> r0 = r2.richText
        L9d:
            r5.getClass()
            r12 = 0
            r5 = r25
            r20 = r1
            r21 = r0
            X.C735840Sti.LJIILLIIL(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        Lab:
            r17 = r0
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell.S6(com.ss.android.ugc.aweme.feed.model.Aweme, boolean, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T5(com.ss.android.ugc.aweme.story.inbox.StoryInboxItem r11, com.ss.android.ugc.aweme.feed.model.Aweme r12, X.InterfaceC330550CxZ r13) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell.T5(com.ss.android.ugc.aweme.story.inbox.StoryInboxItem, com.ss.android.ugc.aweme.feed.model.Aweme, X.0CxZ):void");
    }
}
