package com.ss.android.ugc.aweme.story.archive2.calendar;

import X.C1157000gDK;
import X.C1173560ge2;
import X.C1220000hqw;
import X.C12BX;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C418440Gaw;
import X.C438710HIf;
import X.C452070Ho5;
import X.C710930Rud;
import X.C724750Sbp;
import X.C726800Sf8;
import X.C729510SjV;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC427850Gq7;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class StoryArchiveV2DayCell extends PowerCell<C1157000gDK> {
    public final C736950SvV LL = new C736950SvV(C13LE.LIZ(StoryArchiveV2ArchiveViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(770), null, null, null);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int size;
        Aweme aweme;
        C1157000gDK c1157000gDK = (C1157000gDK) interfaceC1891350zJl;
        super.onBindItemView(c1157000gDK);
        L5(c1157000gDK, (TuxTextView) this.itemView.findViewById(R.id.h3j));
        L5(c1157000gDK, (TuxTextView) this.itemView.findViewById(R.id.vcw));
        L5(c1157000gDK, (TuxTextView) this.itemView.findViewById(R.id.orb));
        View viewFindViewById = this.itemView.findViewById(R.id.h27);
        View viewFindViewById2 = this.itemView.findViewById(R.id.vbw);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.vc5);
        View viewFindViewById3 = this.itemView.findViewById(R.id.vcc);
        C12BX c12bx = (C12BX) this.itemView.findViewById(R.id.vcq);
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.vc7);
        TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.vc6);
        View viewFindViewById4 = this.itemView.findViewById(R.id.or1);
        SmartImageView smartImageView2 = (SmartImageView) this.itemView.findViewById(R.id.or2);
        SmartImageView smartImageView3 = (SmartImageView) this.itemView.findViewById(R.id.or3);
        View viewFindViewById5 = this.itemView.findViewById(R.id.or6);
        View viewFindViewById6 = this.itemView.findViewById(R.id.or7);
        C12BX c12bx2 = (C12BX) this.itemView.findViewById(R.id.or9);
        C12BX c12bx3 = (C12BX) this.itemView.findViewById(R.id.or_);
        TuxIconView tuxIconView3 = (TuxIconView) this.itemView.findViewById(R.id.or5);
        TuxIconView tuxIconView4 = (TuxIconView) this.itemView.findViewById(R.id.or4);
        c12bx.setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        c12bx2.setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        c12bx3.setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
        C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        C786410Ut5.LJLLLLLL(8, viewFindViewById4);
        C786410Ut5.I7(null, this.itemView);
        List<String> list = ((C1173560ge2) ((AssemViewModel) this.LL.getValue()).getState()).LL.LIZIZ.get(c1157000gDK.LLILLJJLI);
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        String str = c1157000gDK.LLILLL;
        if (str != null && (aweme = ((C1173560ge2) ((AssemViewModel) this.LL.getValue()).getState()).LLILLL.get(str)) != null) {
            C786410Ut5.I7(new AkS57S0200000_18(c1157000gDK, this, 16), this.itemView);
            if (size != 0) {
                if (size != 1) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById);
                    C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                    C786410Ut5.LJLLLLLL(0, viewFindViewById4);
                    I5(aweme, smartImageView2, smartImageView3, viewFindViewById5, viewFindViewById6, c12bx2, c12bx3, tuxIconView3, tuxIconView4);
                    return;
                }
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                C786410Ut5.LJLLLLLL(8, viewFindViewById4);
                I5(aweme, smartImageView, null, viewFindViewById3, null, c12bx, null, tuxIconView, tuxIconView2);
                return;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            C786410Ut5.LJLLLLLL(8, viewFindViewById4);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.fav, false, 4, null);
    }

    public final void L5(C1157000gDK c1157000gDK, TuxTextView tuxTextView) {
        int iIntValue;
        Integer numLIZJ;
        float fLIZIZ = C418440Gaw.LIZIZ(1);
        float fLIZIZ2 = C418440Gaw.LIZIZ(1);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.za, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        tuxTextView.setShadowLayer(fLIZIZ, 0.0f, fLIZIZ2, iIntValue);
        long j = c1157000gDK.LL;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        tuxTextView.setText(String.valueOf(calendar.get(5)));
    }

    public static void I5(Aweme aweme, SmartImageView smartImageView, SmartImageView smartImageView2, final View view, final View view2, C12BX c12bx, C12BX c12bx2, TuxIconView tuxIconView, TuxIconView tuxIconView2) {
        BackgroundModel backgroundModel;
        if (!C726800Sf8.LIZ(aweme) && !C726800Sf8.LIZIZ(aweme)) {
            UrlModel cover = null;
            BackgroundModel backgroundModel2 = null;
            if (C729510SjV.LJJIIZI(aweme)) {
                C786410Ut5.LJLLLLLL(8, smartImageView);
                if (smartImageView2 != null) {
                    C786410Ut5.LJLLLLLL(8, smartImageView2);
                }
                C786410Ut5.LJLLLLLL(0, c12bx);
                if (c12bx2 != null) {
                    C786410Ut5.LJLLLLLL(0, c12bx2);
                }
                C786410Ut5.LJLLLLLL(8, view);
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                C786410Ut5.LJLLLLLL(0, tuxIconView);
                C786410Ut5.LJLLLLLL(8, tuxIconView2);
                User author = aweme.getAuthor();
                StoryNoteInfo storyNoteInfo = aweme.storyNoteInfo;
                if (storyNoteInfo != null) {
                    backgroundModel = storyNoteInfo.backGroundInfo;
                } else {
                    backgroundModel = null;
                }
                c12bx.LIZIZ(author, backgroundModel, new AwS562S0100000_18(view, 2277));
                if (c12bx2 != null) {
                    User author2 = aweme.getAuthor();
                    StoryNoteInfo storyNoteInfo2 = aweme.storyNoteInfo;
                    if (storyNoteInfo2 != null) {
                        backgroundModel2 = storyNoteInfo2.backGroundInfo;
                    }
                    c12bx2.LIZIZ(author2, backgroundModel2, new AwS562S0100000_18(view2, 2278));
                    return;
                }
                return;
            }
            C786410Ut5.LJLLLLLL(0, smartImageView);
            if (smartImageView2 != null) {
                C786410Ut5.LJLLLLLL(0, smartImageView2);
            }
            C786410Ut5.LJLLLLLL(8, c12bx);
            if (c12bx2 != null) {
                C786410Ut5.LJLLLLLL(8, c12bx2);
            }
            C786410Ut5.LJLLLLLL(8, view);
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            C786410Ut5.LJLLLLLL(8, tuxIconView);
            C786410Ut5.LJLLLLLL(8, tuxIconView2);
            if (C729510SjV.LJIJI(aweme)) {
                cover = C710930Rud.LJ(aweme);
            } else {
                Video video = aweme.getVideo();
                if (video != null) {
                    cover = video.getCover();
                }
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            final int i = 0;
            c1331670kl3LJIIIIZZ.LJIIJ(new InterfaceC427850Gq7(view, i) { // from class: X.0hZ9
                public final int $t;
                public Object l0;

                public static final void A3$0(C1208970hZ9 c1208970hZ9, Uri uri, C428600GrK c428600GrK) {
                }

                public static final void A3$1(C1208970hZ9 c1208970hZ9, Uri uri, C428600GrK c428600GrK) {
                }

                public static final void Bh$0(C1208970hZ9 c1208970hZ9, Uri uri, View view3) {
                }

                public static final void Bh$1(C1208970hZ9 c1208970hZ9, Uri uri, View view3) {
                }

                public static final void cm$0(C1208970hZ9 c1208970hZ9, Uri uri, View view3, Throwable th) {
                }

                public static final void cm$1(C1208970hZ9 c1208970hZ9, Uri uri, View view3, Throwable th) {
                }

                public static final void e1$0(C1208970hZ9 c1208970hZ9, Uri uri) {
                }

                public static final void e1$1(C1208970hZ9 c1208970hZ9, Uri uri) {
                }

                public static final void lg$0(C1208970hZ9 c1208970hZ9, Uri uri, Throwable th) {
                }

                public static final void lg$1(C1208970hZ9 c1208970hZ9, Uri uri, Throwable th) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void A3(Uri uri, C428600GrK c428600GrK) {
                    switch (this.$t) {
                        case 0:
                            A3$0(this, uri, c428600GrK);
                            break;
                        case 1:
                            A3$1(this, uri, c428600GrK);
                            break;
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view3, C428600GrK c428600GrK, Animatable animatable) {
                    switch (this.$t) {
                        case 0:
                            Ad$0(this, uri, view3, c428600GrK, animatable);
                            break;
                        case 1:
                            Ad$1(this, uri, view3, c428600GrK, animatable);
                            break;
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void Bh(Uri uri, View view3) {
                    switch (this.$t) {
                        case 0:
                            Bh$0(this, uri, view3);
                            break;
                        case 1:
                            Bh$1(this, uri, view3);
                            break;
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view3, Throwable th) {
                    switch (this.$t) {
                        case 0:
                            cm$0(this, uri, view3, th);
                            break;
                        case 1:
                            cm$1(this, uri, view3, th);
                            break;
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void e1(Uri uri) {
                    switch (this.$t) {
                        case 0:
                            e1$0(this, uri);
                            break;
                        case 1:
                            e1$1(this, uri);
                            break;
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void lg(Uri uri, Throwable th) {
                    switch (this.$t) {
                        case 0:
                            lg$0(this, uri, th);
                            break;
                        case 1:
                            lg$1(this, uri, th);
                            break;
                    }
                }

                {
                    this.$t = i;
                    this.l0 = view;
                }

                public static final void Ad$0(C1208970hZ9 c1208970hZ9, Uri uri, View view3, C428600GrK c428600GrK, Animatable animatable) {
                    C786410Ut5.LJLLLLLL(0, (View) c1208970hZ9.l0);
                }

                public static final void Ad$1(C1208970hZ9 c1208970hZ9, Uri uri, View view3, C428600GrK c428600GrK, Animatable animatable) {
                    View view4 = (View) c1208970hZ9.l0;
                    if (view4 != null) {
                        C786410Ut5.LJLLLLLL(0, view4);
                    }
                }
            });
            if (smartImageView2 == null) {
                return;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
            c1331670kl3LJIIIIZZ2.LJJ(smartImageView2);
            final int i2 = 1;
            c1331670kl3LJIIIIZZ2.LJIIJ(new InterfaceC427850Gq7(view2, i2) { // from class: X.0hZ9
                public final int $t;
                public Object l0;

                public static final void A3$0(C1208970hZ9 c1208970hZ9, Uri uri, C428600GrK c428600GrK) {
                }

                public static final void A3$1(C1208970hZ9 c1208970hZ9, Uri uri, C428600GrK c428600GrK) {
                }

                public static final void Bh$0(C1208970hZ9 c1208970hZ9, Uri uri, View view3) {
                }

                public static final void Bh$1(C1208970hZ9 c1208970hZ9, Uri uri, View view3) {
                }

                public static final void cm$0(C1208970hZ9 c1208970hZ9, Uri uri, View view3, Throwable th) {
                }

                public static final void cm$1(C1208970hZ9 c1208970hZ9, Uri uri, View view3, Throwable th) {
                }

                public static final void e1$0(C1208970hZ9 c1208970hZ9, Uri uri) {
                }

                public static final void e1$1(C1208970hZ9 c1208970hZ9, Uri uri) {
                }

                public static final void lg$0(C1208970hZ9 c1208970hZ9, Uri uri, Throwable th) {
                }

                public static final void lg$1(C1208970hZ9 c1208970hZ9, Uri uri, Throwable th) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void A3(Uri uri, C428600GrK c428600GrK) {
                    switch (this.$t) {
                        case 0:
                            A3$0(this, uri, c428600GrK);
                            break;
                        case 1:
                            A3$1(this, uri, c428600GrK);
                            break;
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view3, C428600GrK c428600GrK, Animatable animatable) {
                    switch (this.$t) {
                        case 0:
                            Ad$0(this, uri, view3, c428600GrK, animatable);
                            break;
                        case 1:
                            Ad$1(this, uri, view3, c428600GrK, animatable);
                            break;
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void Bh(Uri uri, View view3) {
                    switch (this.$t) {
                        case 0:
                            Bh$0(this, uri, view3);
                            break;
                        case 1:
                            Bh$1(this, uri, view3);
                            break;
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view3, Throwable th) {
                    switch (this.$t) {
                        case 0:
                            cm$0(this, uri, view3, th);
                            break;
                        case 1:
                            cm$1(this, uri, view3, th);
                            break;
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void e1(Uri uri) {
                    switch (this.$t) {
                        case 0:
                            e1$0(this, uri);
                            break;
                        case 1:
                            e1$1(this, uri);
                            break;
                    }
                }

                @Override // X.InterfaceC427850Gq7
                public final void lg(Uri uri, Throwable th) {
                    switch (this.$t) {
                        case 0:
                            lg$0(this, uri, th);
                            break;
                        case 1:
                            lg$1(this, uri, th);
                            break;
                    }
                }

                {
                    this.$t = i2;
                    this.l0 = view2;
                }

                public static final void Ad$0(C1208970hZ9 c1208970hZ9, Uri uri, View view3, C428600GrK c428600GrK, Animatable animatable) {
                    C786410Ut5.LJLLLLLL(0, (View) c1208970hZ9.l0);
                }

                public static final void Ad$1(C1208970hZ9 c1208970hZ9, Uri uri, View view3, C428600GrK c428600GrK, Animatable animatable) {
                    View view4 = (View) c1208970hZ9.l0;
                    if (view4 != null) {
                        C786410Ut5.LJLLLLLL(0, view4);
                    }
                }
            });
            return;
        }
        C786410Ut5.LJLLLLLL(0, smartImageView);
        if (smartImageView2 != null) {
            C786410Ut5.LJLLLLLL(0, smartImageView2);
        }
        C786410Ut5.LJLLLLLL(8, c12bx);
        if (c12bx2 != null) {
            C786410Ut5.LJLLLLLL(8, c12bx2);
        }
        C786410Ut5.LJLLLLLL(8, view);
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        C786410Ut5.LJLLLLLL(8, tuxIconView);
        C786410Ut5.LJLLLLLL(0, tuxIconView2);
        C1331670kl3 c1331670kl3LJIIIIZZ3 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(""));
        c1331670kl3LJIIIIZZ3.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ3);
        if (smartImageView2 == null) {
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ4 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(""));
        c1331670kl3LJIIIIZZ4.LJJ(smartImageView2);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ4);
    }
}
