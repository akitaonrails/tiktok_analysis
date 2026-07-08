package kotlin.jvm.internal;

import X.AbstractC498550Jgr;
import X.AbstractC511100K2q;
import X.C08XD;
import X.C09AY;
import X.C0HZQ;
import X.C0K0R;
import X.C0K1I;
import X.C0K34;
import X.C0K3G;
import X.C0K3J;
import X.C0KC0;
import X.C0KC4;
import X.C0KCH;
import X.C0KCP;
import X.C0KDP;
import X.C0KDZ;
import X.C0KFM;
import X.C0KMY;
import X.C0KNJ;
import X.C0KOK;
import X.C0KVL;
import X.C0KVN;
import X.C1250250idj;
import X.C13LP;
import X.C1542210qEd;
import X.C19348710mr;
import X.C19374310qz;
import X.C197039127h;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C259800zU;
import X.C291001Au;
import X.C470150Ic9;
import X.C470180IcC;
import X.C498120JgA;
import X.C510480K0g;
import X.C511120K2s;
import X.C511130K2t;
import X.C511150K2v;
import X.C511370K3r;
import X.C511520K4g;
import X.C511970K5z;
import X.C513840KDe;
import X.C520710KbV;
import X.C520950Kbt;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC19356310o5;
import X.EnumC507460JvE;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS111S0200000_7;
import Y.ACListenerS74S0300000_7;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.memberlist.BulletinMemberNavBarAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.assem.BottomSubscribeComponent;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.assem.SubPackageErrorAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.DetailEmptyAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.DetailTitleAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem.FeedEmptyAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem.SpaceFeedTitleAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.setting.view.assem.SpacePostPreviewAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.sub.HomePageInfo;

/* JADX INFO: loaded from: classes8.dex */
public class AwS443S0200000_7 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS443S0200000_7(android.view.View r3, com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem.FeedEmptyAssem r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 12: goto Lf;
                case 13: goto L5;
                case 14: goto L5;
                case 15: goto L5;
                case 16: goto Lf;
                case 17: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS443S0200000_7.<init>(android.view.View, com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem.FeedEmptyAssem, int):void");
    }

    public static final Object invoke$0(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        View viewLJJIJL;
        TuxNavBar tuxNavBar;
        UIAssem uIAssem = (UIAssem) obj;
        Long l = (Long) obj2;
        if (l != null) {
            l.longValue();
            if (l.longValue() > 0 && (viewLJJIJL = uIAssem.LJJIJL()) != null && (tuxNavBar = (TuxNavBar) viewLJJIJL.findViewById(R.id.d1p)) != null) {
                C1250250idj c1250250idj = new C1250250idj();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((Context) awS443S0200000_7.l0).getString(2131828117));
                sbLIZ.append(" (");
                sbLIZ.append((Object) C19374310qz.LIZ(l, new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28));
                sbLIZ.append(')');
                c1250250idj.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
                tuxNavBar.LJIJJ(c1250250idj);
            }
            ((BulletinProfileViewModel) ((BulletinMemberNavBarAssem) awS443S0200000_7.l1).LLJIJIL.getValue()).cR2(l.longValue());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$1(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        SpacePost spacePost;
        final ArrayList arrayList;
        List<SpacePollOption> list;
        String strValueOf;
        UIAssem uIAssem = (UIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (spacePost = (SpacePost) c291001Au.LIZ) != null) {
            View view = (View) awS443S0200000_7.l0;
            SpacePostPreviewAssem spacePostPreviewAssem = (SpacePostPreviewAssem) awS443S0200000_7.l1;
            C786410Ut5.LJLLLLLL(8, view);
            RecyclerView recyclerView = (RecyclerView) uIAssem.LJJIJL().findViewById(R.id.hui);
            recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: X.06LS
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
            AssemVMLazy assemVMLazy = spacePostPreviewAssem.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SpacePostPreviewAssem.LLJJIII;
            assemVMLazy.getValue();
            int i = spacePost.postType;
            if (i == EnumC507460JvE.TEXT.getValue()) {
                arrayList = new ArrayList();
                arrayList.add(new C511130K2t(spacePost));
                Iterator it2 = C13LP.LL(spacePost.commentList, 3).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C0K3J((SpaceCommentItem) it2.next(), spacePost));
                }
                arrayList.add(new C511120K2s(spacePost));
            } else if (i == EnumC507460JvE.POLL.getValue()) {
                arrayList = new ArrayList();
                arrayList.add(new C511150K2v(spacePost));
                SpacePoll spacePoll = spacePost.pollInfo;
                if (spacePoll != null && (list = spacePoll.optionList) != null) {
                    int i2 = 1;
                    for (SpacePollOption spacePollOption : list) {
                        if (1 <= i2 && i2 < 27) {
                            strValueOf = String.valueOf((char) (i2 + 64));
                        } else {
                            strValueOf = "?";
                        }
                        arrayList.add(new C0K34(spacePost, spacePollOption, strValueOf));
                        i2++;
                    }
                }
                arrayList.add(new C511120K2s(spacePost));
            }
            AbstractC511100K2q abstractC511100K2q = new AbstractC511100K2q(arrayList) { // from class: X.0K2h
                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size();
                }

                @Override // X.AbstractC21673619ry
                public final int getItemViewType(int i3) {
                    return ((AbstractC511160K2w) ListProtector.get(this.LL, i3)).LIZJ().getValue();
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i3) {
                    C0K3V c0k3v;
                    if ((viewHolder instanceof C0K3V) && (c0k3v = (C0K3V) viewHolder) != null) {
                        c0k3v.I5((AbstractC511160K2w) ListProtector.get(this.LL, i3), null);
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i3) {
                    C0K3V c0k3v;
                    LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                    if (i3 == C0K2L.TEXT.getValue()) {
                        c0k3v = new C0K3V(C786410Ut5.Td(layoutInflaterNe, R.layout.fi0, viewGroup, false)) { // from class: X.0K2g
                            public final View LL;
                            public final TextView LLILLJJLI;
                            public final TextView LLILLL;

                            {
                                super(view);
                                this.LL = view;
                                this.LLILLJJLI = (TextView) view.findViewById(R.id.rj9);
                                this.LLILLL = (TextView) view.findViewById(R.id.rm0);
                            }

                            @Override // X.C0K3V
                            public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
                                C511130K2t c511130K2t;
                                String str;
                                if ((abstractC511160K2w instanceof C511130K2t) && (c511130K2t = (C511130K2t) abstractC511160K2w) != null) {
                                    C786410Ut5.LLIL(this.LLILLL, 8);
                                    SpacePost spacePost2 = c511130K2t.LIZ;
                                    TextView textView = this.LLILLJJLI;
                                    SpaceTopicCategory spaceTopicCategory = spacePost2.category;
                                    if (spaceTopicCategory == null || (str = spaceTopicCategory.topicCategoryText) == null) {
                                        str = "";
                                    }
                                    C0K3V.R5(textView, "ttlive_sub_space_ic_chat.png", str, spacePost2.text, 101, 103);
                                }
                            }
                        };
                    } else if (i3 == C0K2L.COMMENT.getValue()) {
                        final View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.fhq, viewGroup, false);
                        c0k3v = new C0K3V(viewTd) { // from class: X.0K2n
                            public final View LL;
                            public final TextView LLILLJJLI;
                            public final TextView LLILLL;
                            public final C417410GYh LLILZ;
                            public final TextView LLILZIL;
                            public final TextView LLILZLL;
                            public final C0K3W LLIZ;
                            public final View LLIZLLLIL;

                            {
                                super(viewTd);
                                this.LL = viewTd;
                                this.LLILLJJLI = (TextView) viewTd.findViewById(R.id.eaf);
                                this.LLILLL = (TextView) viewTd.findViewById(R.id.ecd);
                                C417410GYh c417410GYh = (C417410GYh) viewTd.findViewById(R.id.e_j);
                                this.LLILZ = c417410GYh;
                                this.LLILZIL = (TextView) viewTd.findViewById(R.id.ea_);
                                this.LLILZLL = (TextView) viewTd.findViewById(R.id.eaa);
                                this.LLIZ = (C0K3W) viewTd.findViewById(R.id.bqd);
                                this.LLIZLLLIL = viewTd.findViewById(R.id.m4j);
                                c417410GYh.getHierarchy().LJIJI(0);
                            }

                            @Override // X.C0K3V
                            public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
                                C0K3J c0k3j;
                                int i4;
                                if ((abstractC511160K2w instanceof C0K3J) && (c0k3j = (C0K3J) abstractC511160K2w) != null) {
                                    SpaceCommentItem spaceCommentItem = c0k3j.LIZ;
                                    C0K3V.T5(spaceCommentItem, this.LLILLJJLI);
                                    this.LLILLL.setText(C0K7S.LIZ(spaceCommentItem.userInfo));
                                    C511410K3v.LIZ(this.LLILZ, spaceCommentItem.userInfo, (int) C511520K4g.LIZ(32.0f));
                                    this.LLILLL.requestLayout();
                                    View view2 = this.LLIZLLLIL;
                                    if (spaceCommentItem.anchorLiked) {
                                        i4 = 0;
                                    } else {
                                        i4 = 8;
                                    }
                                    C786410Ut5.LJLLLLLL(i4, view2);
                                    if (spaceCommentItem.anchorCommented) {
                                        this.LLILZIL.setText("·");
                                        C786410Ut5.LLIL(this.LLILZIL, 0);
                                        C786410Ut5.LLIL(this.LLILZLL, 0);
                                    } else {
                                        C786410Ut5.LLIL(this.LLILZIL, 8);
                                        C786410Ut5.LLIL(this.LLILZLL, 8);
                                    }
                                    if (!spaceCommentItem.anchorCommented) {
                                        C0K3V.S5(this.LLIZ, spaceCommentItem.badgeList, spaceCommentItem.userInfo);
                                    } else {
                                        C786410Ut5.R0(this.LLIZ, 8);
                                    }
                                }
                            }
                        };
                    } else if (i3 == C0K2L.POST_BTM_ACTION.getValue()) {
                        final View viewTd2 = C786410Ut5.Td(layoutInflaterNe, R.layout.fho, viewGroup, false);
                        c0k3v = new C0K3V(viewTd2) { // from class: X.0K2i
                            public final View LL;
                            public final TuxIconView LLILLJJLI;
                            public final C417410GYh LLILLL;
                            public final TextView LLILZ;
                            public final TextView LLILZIL;
                            public final TextView LLILZLL;

                            {
                                super(viewTd2);
                                this.LL = viewTd2;
                                this.LLILLJJLI = (TuxIconView) viewTd2.findViewById(R.id.f755mn3);
                                this.LLILLL = (C417410GYh) viewTd2.findViewById(R.id.a14);
                                this.LLILZ = (TextView) viewTd2.findViewById(R.id.a12);
                                this.LLILZIL = (TextView) viewTd2.findViewById(R.id.mnz);
                                this.LLILZLL = (TextView) viewTd2.findViewById(R.id.ebw);
                            }

                            @Override // X.C0K3V
                            public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
                                C511120K2s c511120K2s;
                                int i4;
                                int i5;
                                String strLJII;
                                String strLJII2;
                                if ((abstractC511160K2w instanceof C511120K2s) && (c511120K2s = (C511120K2s) abstractC511160K2w) != null) {
                                    SpacePost spacePost2 = c511120K2s.LIZ;
                                    boolean z = spacePost2.userLiked;
                                    TuxIconView tuxIconView = this.LLILLJJLI;
                                    C419910GdJ c419910GdJ = new C419910GdJ();
                                    Context context = this.LL.getContext();
                                    if (z) {
                                        i4 = R.attr.f9d;
                                    } else {
                                        i4 = R.attr.f9c;
                                    }
                                    c419910GdJ.LIZ = C426930God.LIZLLL(i4, context);
                                    if (z) {
                                        i5 = R.attr.f_9;
                                    } else {
                                        i5 = R.attr.a1k;
                                    }
                                    c419910GdJ.LJ = Integer.valueOf(i5);
                                    tuxIconView.setTuxIcon(c419910GdJ);
                                    C786410Ut5.S0(this.LLILLL, 8);
                                    C786410Ut5.LLIL(this.LLILZ, 8);
                                    TextView textView = this.LLILZLL;
                                    long j = spacePost2.commentCount;
                                    if (j > 0) {
                                        strLJII = C511410K3v.LIZIZ(j);
                                    } else {
                                        strLJII = C511520K4g.LJII(2131839614);
                                    }
                                    textView.setText(strLJII);
                                    TextView textView2 = this.LLILZIL;
                                    long j2 = spacePost2.likeCount;
                                    if (j2 > 0) {
                                        strLJII2 = C511410K3v.LIZIZ(j2);
                                    } else {
                                        strLJII2 = C511520K4g.LJII(2131839617);
                                    }
                                    textView2.setText(strLJII2);
                                }
                            }
                        };
                    } else {
                        c0k3v = new C0K3V(new FrameLayout(viewGroup.getContext()));
                    }
                    try {
                        View view2 = c0k3v.itemView;
                        if (view2 != null) {
                            view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    c0k3v.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (c0k3v.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(c0k3v.getClass().getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i3);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) c0k3v.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(c0k3v.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = c0k3v.getClass().getName();
                    return c0k3v;
                }
            };
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(abstractC511100K2q);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        boolean zLJIIJ = C513840KDe.LJIIJ((C0KDZ) obj2);
        C0HZQ c0hzq = ((BottomSubscribeComponent) awS443S0200000_7.l0).LLJJIJIL;
        if (c0hzq != null) {
            c0hzq.setClickable(!zLJIIJ);
        }
        BottomSubscribeComponent bottomSubscribeComponent = (BottomSubscribeComponent) awS443S0200000_7.l0;
        C197039127h c197039127h = bottomSubscribeComponent.LLJJIJIIJIL;
        if (c197039127h != null) {
            c197039127h.setClickable(!zLJIIJ);
            if (zLJIIJ) {
                C197039127h c197039127h2 = bottomSubscribeComponent.LLJJIJIIJIL;
                if (c197039127h2 != null) {
                    c197039127h2.setLoading(true);
                }
                C736680Sv4.LJIIIIZZ(uIAssem, ((BottomSubscribeComponent) awS443S0200000_7.l0).ip(), new C2217381BqS() { // from class: X.0KF8
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj3) {
                        return ((C513800KDa) obj3).LLIZLLLIL;
                    }
                }, null, new AwS621S0100000_7((C259800zU) awS443S0200000_7.l1, (C259800zU<Function1<C0KDP, Unit>>) 90), 6);
            } else {
                C197039127h c197039127h3 = bottomSubscribeComponent.LLJJIJIIJIL;
                if (c197039127h3 != null) {
                    c197039127h3.setLoading(false);
                }
            }
        } else if (zLJIIJ) {
            C736680Sv4.LJIIIIZZ(uIAssem, ((BottomSubscribeComponent) awS443S0200000_7.l0).ip(), new C2217381BqS() { // from class: X.0KF8
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj3) {
                    return ((C513800KDa) obj3).LLIZLLLIL;
                }
            }, null, new AwS621S0100000_7((C259800zU) awS443S0200000_7.l1, (C259800zU<Function1<C0KDP, Unit>>) 90), 6);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        if (obj2 != null && ((SpaceFeedTitleAssem) awS443S0200000_7.l0).Ho().zQ2()) {
            C786410Ut5.LJZI(0, (ImageView) awS443S0200000_7.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$12(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            ((Number) c291001Au.LIZ).intValue();
            ((FeedEmptyAssem) awS443S0200000_7.l0).kp((View) awS443S0200000_7.l1);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        if (!((SpaceFeedTitleAssem) awS443S0200000_7.l0).Ho().zQ2()) {
            C786410Ut5.LJZI(8, (ImageView) awS443S0200000_7.l1);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        if (obj2 != null) {
            C786410Ut5.LJLLLLLL(8, (View) awS443S0200000_7.l0);
            ((FeedEmptyAssem) awS443S0200000_7.l1).ip().DQ2();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$15(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        C511370K3r c511370K3rGo;
        String str;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            int iIntValue = ((Number) c291001Au.LIZ).intValue();
            TextView textView = (TextView) awS443S0200000_7.l0;
            SpaceFeedTitleAssem spaceFeedTitleAssem = (SpaceFeedTitleAssem) awS443S0200000_7.l1;
            if (iIntValue != 0) {
                C786410Ut5.LLIL(textView, 0);
            } else {
                C511370K3r c511370K3rGo2 = spaceFeedTitleAssem.Go();
                if (c511370K3rGo2 != null && !c511370K3rGo2.LLJILLL && (c511370K3rGo = spaceFeedTitleAssem.Go()) != null && (str = c511370K3rGo.LLJJJJLIIL) != null && str.length() == 0) {
                    C786410Ut5.LLIL(textView, 8);
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        HomePageInfo homePageInfo;
        List<SpacePost> list;
        C511370K3r c511370K3rHp = ((FeedEmptyAssem) awS443S0200000_7.l0).hp();
        if (c511370K3rHp != null && (homePageInfo = c511370K3rHp.LLILZLL) != null && (list = homePageInfo.postList) != null && (!list.isEmpty())) {
            C786410Ut5.LJLLLLLL(8, (View) awS443S0200000_7.l1);
            ((FeedEmptyAssem) awS443S0200000_7.l0).ip().DQ2();
        } else {
            ((FeedEmptyAssem) awS443S0200000_7.l0).kp((View) awS443S0200000_7.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        if (!((FeedEmptyAssem) awS443S0200000_7.l0).ip().yQ2()) {
            ((FeedEmptyAssem) awS443S0200000_7.l0).kp((View) awS443S0200000_7.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        C498120JgA c498120JgA = (C498120JgA) awS443S0200000_7.l0;
        Function0 function0 = (Function0) awS443S0200000_7.l1;
        c498120JgA.LJFF.remove(obj);
        if (obj != null && !((ArrayList) c498120JgA.LJ).contains(obj)) {
            ArrayList arrayList = (ArrayList) c498120JgA.LJ;
            arrayList.add(obj);
            C08XD.LJJ(arrayList, new Comparator() { // from class: X.0JgD
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    AbstractC498530Jgp abstractC498530Jgp = (AbstractC498530Jgp) obj3;
                    AbstractC498530Jgp abstractC498530Jgp2 = (AbstractC498530Jgp) obj4;
                    if (abstractC498530Jgp.LIZLLL() < abstractC498530Jgp2.LIZLLL()) {
                        return -1;
                    }
                    if (abstractC498530Jgp.LIZLLL() > abstractC498530Jgp2.LIZLLL()) {
                        return 1;
                    }
                    return 0;
                }
            });
        }
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((C520950Kbt) awS443S0200000_7.l0).LJIIL((AbstractC498550Jgr) obj, (Function0) awS443S0200000_7.l1, zBooleanValue, true);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0KMm] */
    public static final Object invoke$2(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        Exception exc;
        int iIntValue = ((Number) obj).intValue();
        final Throwable th = (Throwable) obj2;
        C0KMY c0kmy = (C0KMY) awS443S0200000_7.l0;
        if (!(th instanceof Exception) || (exc = (Exception) th) == null) {
            exc = new Exception("Unknown error");
        }
        final C0KMY c0kmy2 = (C0KMY) awS443S0200000_7.l0;
        final C0KFM c0kfm = (C0KFM) awS443S0200000_7.l1;
        C0KMY.LJFF(c0kmy, 0, 71, iIntValue, exc, new C0KOK() { // from class: X.0KMm
            /* JADX WARN: Type inference failed for: r1v4, types: [T, java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v2, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r2v3, types: [T, java.util.List] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
            @Override // X.C0KOK
            public final void LIZ() {
                ?? arrayList;
                List listLJLJJLL;
                List listLL;
                C0KMY c0kmy3 = c0kmy2;
                C0KFM c0kfm2 = c0kfm;
                AwS408S0200000_7 awS408S0200000_7 = new AwS408S0200000_7(c0kmy3, th, 32);
                c0kmy3.getClass();
                C259800zU c259800zU = new C259800zU();
                Object value = c0kmy3.LJIIIIZZ.getValue();
                String str = c0kfm2.LJIIIZ;
                Map<String, List<C0KM2>> map = C516050KLr.LIZIZ;
                value.getClass();
                String str2 = CardStruct.IStatusCode.DEFAULT;
                if (str != null) {
                    if (a0.LJJJIL(str)) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    str2 = str;
                }
                Iterable iterable = (Iterable) ((LinkedHashMap) map).get(str2);
                if (iterable == null || (listLJLJJLL = C13LP.LJLJJLL(iterable)) == null || (listLL = C13LP.LL(listLJLJJLL, C0K7G.LJI("sub_check_order_id_list_size", 5))) == null) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                    Iterator it2 = listLL.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C0KM2) it2.next()).LIZ);
                    }
                }
                c259800zU.element = arrayList;
                if (arrayList.isEmpty()) {
                    ?? arrayList2 = new ArrayList((Collection) c259800zU.element);
                    arrayList2.add("");
                    c259800zU.element = arrayList2;
                }
                C118300cf c118300cf = new C118300cf();
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C516270KMn(c259800zU, c118300cf, c0kmy3, c0kfm2, awS408S0200000_7, null), 3);
            }
        }, null, 32);
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        C510480K0g c510480K0g = (C510480K0g) awS443S0200000_7.l0;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = c510480K0g.LJ;
        if (subscriptionPrivilegeDetailFragment != null) {
            String strLIZIZ = c510480K0g.LIZIZ();
            Map<String, String> mapN5 = ((C0K1I) awS443S0200000_7.l1).N5((C510480K0g) awS443S0200000_7.l0);
            C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_privilege_intro_item_show");
            subscriptionPrivilegeDetailFragment.mS(c511970K5z);
            c511970K5z.LIZIZ(strLIZIZ, "privilege_page");
            c511970K5z.LIZJ(mapN5);
            c511970K5z.LIZLLL();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) throws JSONException {
        SparkContext sparkContext = (SparkContext) obj;
        if (C1542210qEd.LIZ(Integer.valueOf(((Number) obj2).intValue()))) {
            C520710KbV.LIZIZ(sparkContext);
        }
        ((C470150Ic9) awS443S0200000_7.l0).LJJIII(sparkContext);
        C470150Ic9 c470150Ic9 = (C470150Ic9) awS443S0200000_7.l0;
        c470150Ic9.getClass();
        sparkContext.LJJJJZI(new C470180IcC(c470150Ic9, false));
        JSONObject jSONObjectLJJIIJ = ((C470150Ic9) awS443S0200000_7.l0).LJJIIJ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("extra", ((EncourageGoLiveCard) awS443S0200000_7.l1).extra);
        jSONObject.put("log_params", C786410Ut5.J3(jSONObjectLJJIIJ));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadSparkView: withInitData log_params=");
        sbLIZ.append(jSONObjectLJJIIJ);
        C20441214yg.LIZIZ("PromoteLynxVariantCard", C2188811AlT.LIZIZ(sbLIZ));
        sparkContext.initData = C786410Ut5.J3(jSONObject);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C0KVL) awS443S0200000_7.l0).LIZ.userName);
        sbLIZ.append(": ");
        spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
        spannableStringBuilder.append((CharSequence) obj);
        ((C0KVN) awS443S0200000_7.l1).LLIZ.setText(spannableStringBuilder);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            ((Number) c291001Au.LIZ).intValue();
            ((DetailEmptyAssem) awS443S0200000_7.l0).ip((View) awS443S0200000_7.l1);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        if (obj2 != null) {
            C786410Ut5.LJLLLLLL(8, (View) awS443S0200000_7.l0);
            C0K3G c0k3g = ((DetailEmptyAssem) awS443S0200000_7.l1).hp().LLILLL;
            if (c0k3g != null) {
                c0k3g.LJII();
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        if (((DetailEmptyAssem) awS443S0200000_7.l0).hp().zQ2()) {
            C786410Ut5.LJLLLLLL(8, (View) awS443S0200000_7.l1);
            C0K3G c0k3g = ((DetailEmptyAssem) awS443S0200000_7.l0).hp().LLILLL;
            if (c0k3g != null) {
                c0k3g.LJII();
            }
        } else {
            ((DetailEmptyAssem) awS443S0200000_7.l0).ip((View) awS443S0200000_7.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        if (!((DetailEmptyAssem) awS443S0200000_7.l0).hp().zQ2()) {
            ((DetailEmptyAssem) awS443S0200000_7.l0).ip((View) awS443S0200000_7.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        SpacePost spacePost;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (spacePost = (SpacePost) c291001Au.LIZ) != null) {
            ((DetailTitleAssem) awS443S0200000_7.l0).Jo(spacePost, (TextView) awS443S0200000_7.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS443S0200000_7 awS443S0200000_7, Object obj, Object obj2) {
        boolean z;
        int i;
        C197039127h c197039127h;
        String strLJII;
        Function2<? super String, ? super Boolean, Unit> function2;
        C0KCP c0kcp;
        C0KCH c0kch = (C0KCH) obj2;
        if (c0kch != null && (c0kcp = c0kch.LIZJ) != null && c0kcp.LIZIZ != 4025009 && !c0kch.LIZ() && !c0kch.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        C0KC4 c0kc4Hp = ((SubPackageErrorAssem) awS443S0200000_7.l0).hp();
        if (c0kc4Hp != null && (function2 = c0kc4Hp.LLJILLL) != null) {
            function2.invoke(C0KC0.ERROR.getKey(), Boolean.valueOf(z));
        }
        if (z) {
            ViewGroup viewGroup = ((SubPackageErrorAssem) awS443S0200000_7.l0).LLJJJ;
            if (viewGroup != null) {
                C0K0R.LIZJ(viewGroup);
            }
            SubPackageErrorAssem subPackageErrorAssem = (SubPackageErrorAssem) awS443S0200000_7.l0;
            C0KCP c0kcp2 = null;
            if (c0kch != null) {
                c0kcp2 = c0kch.LIZJ;
            }
            TuxTextView tuxTextView = subPackageErrorAssem.LLJJI;
            if (tuxTextView != null) {
                if (c0kcp2 == null || (strLJII = c0kcp2.LIZJ) == null) {
                    strLJII = C511520K4g.LJII(2131839396);
                }
                tuxTextView.setText(strLJII);
            }
            if (c0kcp2 != null) {
                Integer numValueOf = Integer.valueOf(c0kcp2.LIZ);
                Integer numValueOf2 = Integer.valueOf(c0kcp2.LIZIZ);
                if (numValueOf != null && numValueOf.intValue() == 301 && numValueOf2 != null && numValueOf2.intValue() == 3) {
                    C197039127h c197039127h2 = subPackageErrorAssem.LLJJIII;
                    if (c197039127h2 != null) {
                        if (C0KNJ.LIZJ()) {
                            C0K0R.LIZJ(c197039127h2);
                            C197039127h c197039127h3 = subPackageErrorAssem.LLJJIJI;
                            if (c197039127h3 != null) {
                                C0K0R.LIZ(c197039127h3);
                            }
                            c197039127h2.setText(C511520K4g.LJII(2131836588));
                            C786410Ut5.U8(c197039127h2, new ACListenerS74S0300000_7(c197039127h2, subPackageErrorAssem, c0kcp2, 10));
                        } else {
                            C0K0R.LIZ(c197039127h2);
                            C197039127h c197039127h4 = subPackageErrorAssem.LLJJIJI;
                            if (c197039127h4 != null) {
                                C0K0R.LIZJ(c197039127h4);
                            }
                        }
                    }
                    C197039127h c197039127h5 = subPackageErrorAssem.LLJJIII;
                    if (c197039127h5 != null) {
                        C0K0R.LIZ(c197039127h5);
                    }
                    C197039127h c197039127h6 = subPackageErrorAssem.LLJJIJI;
                    if (c197039127h6 != null) {
                        C0K0R.LIZJ(c197039127h6);
                    }
                }
            }
            C197039127h c197039127h7 = subPackageErrorAssem.LLJJIJI;
            if (c197039127h7 != null) {
                C786410Ut5.U8(c197039127h7, new ACListenerS111S0200000_7(subPackageErrorAssem, c0kcp2, 36));
            }
            ViewGroup viewGroup2 = subPackageErrorAssem.LLJJJ;
            if (viewGroup2 != null) {
                HandlerHook.viewPost(viewGroup2, new ARunnableS106S0100000_6(subPackageErrorAssem, 206));
            }
            if (c0kcp2 != null && (((i = c0kcp2.LIZIZ) == -1006 || i == -1007 || i == -1004) && (c197039127h = subPackageErrorAssem.LLJJIJI) != null)) {
                C0K0R.LIZ(c197039127h);
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS443S0200000_7(android.view.View r3, com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.DetailEmptyAssem r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 4: goto Lf;
                case 5: goto L5;
                case 6: goto Lf;
                case 7: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS443S0200000_7.<init>(android.view.View, com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem.DetailEmptyAssem, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS443S0200000_7(C470150Ic9 c470150Ic9, EncourageGoLiveCard encourageGoLiveCard, int i) {
        super(2);
        this.$t = i;
        this.l0 = c470150Ic9;
        this.l1 = encourageGoLiveCard;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS443S0200000_7(C498120JgA c498120JgA, AwS551S0100000_7 awS551S0100000_7, int i) {
        super(2);
        this.$t = i;
        this.l0 = c498120JgA;
        this.l1 = awS551S0100000_7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS443S0200000_7(C510480K0g c510480K0g, ITEM item, C0K1I<ITEM> c0k1i) {
        super(2);
        this.$t = c0k1i;
        this.l0 = c510480K0g;
        this.l1 = item;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS443S0200000_7(C0KMY c0kmy, C0KFM c0kfm, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0kmy;
        this.l1 = c0kfm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS443S0200000_7(C0KVL c0kvl, C0KVN c0kvn, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0kvl;
        this.l1 = c0kvn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS443S0200000_7(C520950Kbt c520950Kbt, C520950Kbt c520950Kbt2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c520950Kbt;
        this.l1 = c520950Kbt2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS443S0200000_7(Context context, BulletinMemberNavBarAssem bulletinMemberNavBarAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = context;
        this.l1 = bulletinMemberNavBarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS443S0200000_7(View view, SpacePostPreviewAssem spacePostPreviewAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = spacePostPreviewAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS443S0200000_7(TextView textView, SpaceFeedTitleAssem spaceFeedTitleAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = textView;
        this.l1 = spaceFeedTitleAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS443S0200000_7(BottomSubscribeComponent bottomSubscribeComponent, BottomSubscribeComponent bottomSubscribeComponent2, C259800zU<Function1<C0KDP, Unit>> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.l0 = bottomSubscribeComponent;
        this.l1 = bottomSubscribeComponent2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS443S0200000_7(SubPackageErrorAssem subPackageErrorAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = subPackageErrorAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS443S0200000_7(DetailTitleAssem detailTitleAssem, TextView textView, int i) {
        super(2);
        this.$t = i;
        this.l0 = detailTitleAssem;
        this.l1 = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS443S0200000_7(SpaceFeedTitleAssem spaceFeedTitleAssem, ImageView imageView, int i) {
        super(2);
        this.$t = i;
        this.l0 = spaceFeedTitleAssem;
        this.l1 = imageView;
    }
}
