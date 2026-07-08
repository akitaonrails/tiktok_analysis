package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interactive;

import X.C01GW;
import X.C0OB8;
import X.C1206504nn;
import X.C13DA;
import X.C13LE;
import X.C2217381BqS;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C704790Rkj;
import X.C705700RmC;
import X.C721230SQv;
import X.C723830SaL;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import X.InterfaceC1361990lXx;
import X.InterfaceC1365380ldQ;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interactive.FriendsRepostInteractiveAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3AnimationAbility;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import wh6.AbS693S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsRepostInteractiveAssem extends BaseFriendsV3CellUISlotAssem<FriendsRepostInteractiveAssem, InterfaceC1361270lWn> {
    public static final /* synthetic */ int LLJZ = 0;
    public AwS555S0100000_11 LLJLLIL;
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(116));
    public final C01GW LLJLIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS555S0100000_11(this, 457));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 455));
    public boolean LLJLL = true;
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(220));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cbh;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cbh, new AwS555S0100000_11(this, 456));
    }

    public final User sp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((InterfaceC1361270lWn) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new AbS693S0100000_11(this, 17, 42), (View) this.LLJLIL.getValue());
        Context context = getContext();
        if (context != null) {
            String string = context.getString(2131838841, "%1$s");
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_bitmap_sticker_heart;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            final TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
            ImageSpan imageSpan = new ImageSpan(tuxIconDrawableLIZ) { // from class: X.0GVT
                public final int LL;
                public final int LLILLJJLI;

                {
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                    this.LL = iLIZIZ;
                    this.LLILLJJLI = iLIZIZ2;
                }

                @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                    Rect bounds = getDrawable().getBounds();
                    if (fontMetricsInt != null) {
                        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                        int i3 = fontMetricsInt2.descent;
                        int i4 = fontMetricsInt2.ascent;
                        int i5 = i3 - i4;
                        int i6 = bounds.bottom - bounds.top;
                        if (i6 > i5) {
                            int i7 = (i6 - i5) / 2;
                            int i8 = i4 - i7;
                            fontMetricsInt.ascent = i8;
                            int i9 = i3 + i7;
                            fontMetricsInt.descent = i9;
                            fontMetricsInt.top = i8;
                            fontMetricsInt.bottom = i9;
                        } else {
                            fontMetricsInt.ascent = i4;
                            fontMetricsInt.descent = i3;
                            fontMetricsInt.top = fontMetricsInt2.top;
                            fontMetricsInt.bottom = fontMetricsInt2.bottom;
                        }
                    }
                    return (bounds.right - bounds.left) + this.LL + this.LLILLJJLI;
                }

                @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
                public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                    Drawable drawable = getDrawable();
                    canvas.save();
                    Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                    int i6 = fontMetricsInt.descent - fontMetricsInt.ascent;
                    canvas.translate(f + this.LL, ((i4 + fontMetricsInt.descent) - (drawable.getBounds().height() / 2)) - (i6 / 2));
                    drawable.draw(canvas);
                    canvas.restore();
                }
            };
            int iLJJJ = a0.LJJJ(string, "%1$s", 0, false, 6);
            SpannableString spannableString = new SpannableString(u.LJJIFFI(string, "%1$s", " ", false));
            if (iLJJJ != -1) {
                C786410Ut5.p2(spannableString, imageSpan, iLJJJ, iLJJJ + 1, 33);
            }
            ((TextView) this.LLJLIL.getValue()).setText(spannableString);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0STs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(86), 4);
        if (C1206504nn.LIZ()) {
            C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 376));
            View viewFindViewById = LJJIJL().findViewById(R.id.i7x);
            if (viewFindViewById != null) {
                C337180DJs.LIZJ(viewFindViewById);
            }
            View view2 = (View) this.LLJLIL.getValue();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                C786410Ut5.W5(view2, marginLayoutParams);
                Context context2 = getContext();
                if (context2 != null) {
                    TextView textView = (TextView) this.LLJLIL.getValue();
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                        C786410Ut5.W5(textView, marginLayoutParams2);
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
                        c384050F3z.LJFF = Integer.valueOf(R.attr.a01);
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
                        textView.setBackground(c384050F3z.LIZ(context2));
                        textView.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), 0);
                        textView.setGravity(16);
                        textView.setIncludeFontPadding(false);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(java.lang.Object r14) {
        /*
            r13 = this;
            X.0lWn r14 = (X.InterfaceC1361270lWn) r14
            boolean r0 = r14 instanceof X.InterfaceC1357880lRK
            if (r0 == 0) goto L24
            X.0lRK r14 = (X.InterfaceC1357880lRK) r14
            if (r14 == 0) goto L24
            android.view.View r1 = r13.LJJIJL()
            r0 = 2131398181(0x7f0a8e25, float:1.8417152E38)
            android.view.View r3 = r1.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r3 = (com.bytedance.tux.input.TuxTextView) r3
            if (r3 == 0) goto L24
            boolean r0 = X.C1206504nn.LIZ()
            r6 = 8
            if (r0 == 0) goto L3a
            X.C786410Ut5.LJLLLLLL(r6, r3)
        L24:
            X.01GW r0 = r13.LLJLIL
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            com.ss.android.ugc.aweme.profile.model.User r0 = r13.sp()
            boolean r0 = X.C10EU.LJIILLIIL(r0)
            r0 = r0 ^ 1
            X.C725890Sdf.LIZIZ(r1, r0)
            return
        L3a:
            com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel r0 = r14.LLD()
            java.lang.Long r0 = r0.repostTime
            r4 = 0
            if (r0 == 0) goto L83
            long r1 = r0.longValue()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L83
            r4 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r4
            boolean r0 = X.C718100SEu.LIZJ()
            if (r0 == 0) goto L7a
            java.lang.String r1 = X.C2215101Bmm.LJIILIIL(r1)
        L59:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L83
            if (r1 == 0) goto L83
            r4 = 0
            r5 = 450(0x1c2, float:6.3E-43)
            r8 = 0
            r10 = 0
            r12 = 253(0xfd, float:3.55E-43)
            r6 = r4
            r7 = r4
            r9 = r4
            r11 = r8
            android.graphics.Typeface r0 = X.C1697580uHE.LIZIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r3.setTypeface(r0)
            X.C786410Ut5.LJLLLLLL(r10, r3)
            r3.setText(r1)
            goto L24
        L7a:
            android.app.Application r0 = X.C1BWL.LIZ()
            java.lang.String r1 = X.C1356610lPH.LJI(r1, r0)
            goto L59
        L83:
            X.C786410Ut5.LJLLLLLL(r6, r3)
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interactive.FriendsRepostInteractiveAssem.up(java.lang.Object):void");
    }

    public final void tp(String str) {
        Object obj;
        StickerTemplate stickerTemplateLJIJJLI;
        Object obj2;
        String uid;
        String str2 = str;
        if (!this.LLJLL) {
            return;
        }
        this.LLJLL = false;
        Object obj3 = null;
        this.LLJLLIL = null;
        FriendsV3AnimationAbility friendsV3AnimationAbility = (FriendsV3AnimationAbility) this.LLJLILLLLZIIL.getValue();
        if (friendsV3AnimationAbility != null) {
            friendsV3AnimationAbility.Yu2(new AwS555S0100000_11(this, 458));
        }
        InterfaceC1365380ldQ interfaceC1365380ldQ = (InterfaceC1365380ldQ) this.LLJL.getValue();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        AttachmentComponent attachmentComponentLJJJJI = interfaceC1365380ldQ.LJJJJI(((C0OB8) obj).getAweme(), AttachmentTypeComponent.ATTACHMENT_TYPE_REPLY_REPOST, sp());
        if (attachmentComponentLJJJJI != null) {
            Context context = getContext();
            if (context != null) {
                stickerTemplateLJIJJLI = IMStickerApi.LIZ.LIZIZ().getImStickerMessageService().LJIJJLI(new SetSticker(44538807299L, null, null, null, null, 44142529795L, 7176841825176847366L, 2, null, null, null, null, null), context, attachmentComponentLJJJJI, null, null);
            } else {
                stickerTemplateLJIJJLI = null;
            }
            InterfaceC1365380ldQ interfaceC1365380ldQ2 = (InterfaceC1365380ldQ) this.LLJL.getValue();
            User userSp = sp();
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            Aweme aweme = ((C0OB8) obj2).getAweme();
            Boolean bool = Boolean.TRUE;
            C13DA c13da = new C13DA();
            User userSp2 = sp();
            if (userSp2 != null) {
                uid = userSp2.getUid();
            } else {
                uid = null;
            }
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            }
            if (Intrinsics.LJFF(uid, AwemeExtKt.getAuthorUid(((C0OB8) obj3).getAweme()))) {
                c13da.put("story_type", "post");
            }
            Boolean bool2 = Boolean.FALSE;
            c13da.put("is_detail_page", C721230SQv.LIZ(bool2));
            c13da.put("friends_tab_version", "v3.0");
            if (str2 == null) {
                str2 = "repost_quick_reply";
            }
            c13da.put("enter_method", str2);
            c13da.put("is_collapse_reposts", C721230SQv.LIZ(bool2));
            interfaceC1365380ldQ2.LJIJJ(null, stickerTemplateLJIJJLI, userSp, aweme, "homepage_friends", "recommend_panel", null, bool, true, null, null, null, c13da.build(), new InterfaceC1361990lXx() { // from class: X.0STr
                @Override // X.InterfaceC1361990lXx
                public final /* synthetic */ void LIZIZ(HashMap map) {
                }

                @Override // X.InterfaceC1361990lXx
                public final void LIZ() {
                    FriendsRepostInteractiveAssem friendsRepostInteractiveAssem = this.LIZ;
                    if (friendsRepostInteractiveAssem.LLJLL) {
                        C786410Ut5.LJLIIL(200L, C799570VYd.LIZJ(), new ARunnableS111S0100000_11(friendsRepostInteractiveAssem, 100));
                    } else {
                        friendsRepostInteractiveAssem.LLJLLIL = new AwS555S0100000_11(friendsRepostInteractiveAssem, 1346);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return obj instanceof InterfaceC1357880lRK;
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }
}
