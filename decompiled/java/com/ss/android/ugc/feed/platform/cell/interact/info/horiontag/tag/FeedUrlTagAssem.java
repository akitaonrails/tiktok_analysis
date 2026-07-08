package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C0RF0;
import X.C11VU;
import X.C1324840ka2;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1AF0;
import X.C20642515q3;
import X.C2188811AlT;
import X.C299590Boj;
import X.C341940Daq;
import X.C418440Gaw;
import X.C690430R6j;
import X.C690870R8b;
import X.C704010RjT;
import X.C708440Rqc;
import X.C723580SZw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1320650kTH;
import X.InterfaceC1330440kj4;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedUrlTagAssem extends DynamicComponent<FeedUrlTagAssem> {
    public TagLayout LLJZIJLIL;
    public TuxTextView LLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.baf;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        boolean z;
        String strLIZIZ;
        float f;
        C690870R8b c690870R8b;
        String str;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null) {
            List<AwemeLabelModel> list = aweme.videoLabels;
            TagLayout tagLayout = null;
            float f2 = 0.0f;
            if (list != null && (!list.isEmpty())) {
                TagLayout tagLayout2 = this.LLJZIJLIL;
                if (tagLayout2 == null) {
                    tagLayout2 = null;
                }
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(tagLayout2, null);
                tagLayout2.removeAllViews();
                int i = 0;
                for (AwemeLabelModel awemeLabelModel : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        AwemeLabelModel awemeLabelModel2 = awemeLabelModel;
                        if (awemeLabelModel2 != null) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C11VU.LIZ(22.0f));
                            if (i == 0) {
                                layoutParams.leftMargin = (int) C11VU.LIZ(0.0f);
                            } else {
                                layoutParams.leftMargin = (int) C11VU.LIZ(7.0f);
                            }
                            final RemoteImageView remoteImageView = new RemoteImageView(LJJIJL().getContext());
                            C786410Ut5.l(remoteImageView, 0);
                            C786410Ut5.I5(remoteImageView, 1.0f);
                            TagLayout tagLayout3 = this.LLJZIJLIL;
                            if (tagLayout3 == null) {
                                tagLayout3 = null;
                            }
                            tagLayout3.addView(remoteImageView, i, layoutParams);
                            UrlModel urlModels = awemeLabelModel2.getUrlModels();
                            Integer numValueOf = Integer.valueOf(awemeLabelModel2.getLabelType());
                            remoteImageView.setTag(numValueOf);
                            remoteImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                            if (numValueOf != null && numValueOf.intValue() == 3) {
                                C786410Ut5.l(remoteImageView, 8);
                                TagLayout tagLayout4 = this.LLJZIJLIL;
                                if (tagLayout4 == null) {
                                    tagLayout4 = null;
                                }
                                RemoveViewCausedNPEChecker.recordViewRemovedPoint(tagLayout4, remoteImageView);
                                tagLayout4.removeView(remoteImageView);
                            } else if (urlModels != null) {
                                LJJIJL().getContext();
                                C1324840ka2.LJIIIIZZ(remoteImageView, urlModels, new InterfaceC1320650kTH<InterfaceC1330440kj4>(remoteImageView) { // from class: X.0HbT
                                    public final View LIZ;

                                    @Override // X.InterfaceC1320650kTH
                                    public final void LIZ(String str2, Throwable th) {
                                    }

                                    @Override // X.InterfaceC1320650kTH
                                    public final void LIZIZ(String str2) {
                                    }

                                    @Override // X.InterfaceC1320650kTH
                                    public final void LIZLLL(String str2, Throwable th) {
                                    }

                                    @Override // X.InterfaceC1320650kTH
                                    public final void LJFF(Object obj, String str2) {
                                    }

                                    {
                                        this.LIZ = remoteImageView;
                                    }

                                    @Override // X.InterfaceC1320650kTH
                                    public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str2) {
                                    }

                                    @Override // X.InterfaceC1320650kTH
                                    public final void LJ(String str2, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
                                        if (interfaceC1330440kj4 != null) {
                                            ViewGroup.LayoutParams layoutParams2 = this.LIZ.getLayoutParams();
                                            int width = (int) (r5.getWidth() * (layoutParams2.height / r5.getHeight()));
                                            if (width != layoutParams2.width) {
                                                layoutParams2.width = width;
                                                C786410Ut5.W5(this.LIZ, layoutParams2);
                                            }
                                        }
                                    }
                                });
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            RelationDynamicLabel relationLabel = aweme.getRelationLabel();
            if (relationLabel != null && relationLabel.isValid()) {
                int i3 = 16;
                if (this.LLL == null) {
                    Context context = getContext();
                    if (context != null) {
                        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                        tuxTextView.setTuxFont(61);
                        tuxTextView.setTextColor(C20642515q3.LIZJ(R.color.mq));
                        tuxTextView.setGravity(16);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setColor(C20642515q3.LIZJ(R.color.ao));
                        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(4));
                        tuxTextView.setBackgroundDrawable(gradientDrawable);
                        tuxTextView.setPadding(C341940Daq.LIZ(5.0d), 0, C341940Daq.LIZ(5.0d), 0);
                        tuxTextView.setSingleLine();
                        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
                        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
                            c690870R8b = new C690870R8b();
                            if (C299590Boj.LIZ()) {
                                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                                c690870R8b.LIZIZ = "cell_unknown";
                            }
                        }
                        C0RF0 c0rf0 = c690870R8b.LIZLLL;
                        if (c0rf0 != null) {
                            str = c0rf0.LJIIIZ;
                        } else {
                            str = null;
                        }
                        if (C704010RjT.LJ(str)) {
                            C704010RjT.LIZLLL(tuxTextView);
                        }
                        this.LLL = tuxTextView;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                String nickname = relationLabel.getNickname();
                String labelInfo = relationLabel.getLabelInfo();
                TagLayout tagLayout5 = this.LLJZIJLIL;
                if (tagLayout5 == null) {
                    tagLayout5 = null;
                }
                if (tagLayout5.getChildCount() > 0) {
                    i3 = 15;
                }
                if (nickname != null && nickname.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    strLIZIZ = C708440Rqc.LIZ(i3, labelInfo, "");
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    sbLIZ.append(nickname);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                    float f3 = i3;
                    String str2 = C708440Rqc.LIZ;
                    if (labelInfo != null) {
                        int i4 = -1;
                        while (true) {
                            int i5 = i4 + 1;
                            if (i5 >= labelInfo.length()) {
                                break;
                            }
                            int i6 = 2;
                            if (C708440Rqc.LIZIZ(i5, labelInfo) == 2) {
                                f = 1.0f;
                            } else {
                                if (C708440Rqc.LIZJ(i5, labelInfo)) {
                                    f = 0.5f;
                                } else {
                                    f = 1.0f;
                                }
                                i6 = 1;
                            }
                            i4 += i6;
                            f2 += f;
                        }
                    }
                    String strLIZ = C708440Rqc.LIZ(C814420VxA.LIZ(Math.ceil(f3 - f2)), strLIZIZ2, C708440Rqc.LIZ);
                    if (strLIZ != null && strLIZ.length() != 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZ);
                        sbLIZ2.append(' ');
                        strLIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZ);
                    sbLIZ3.append(labelInfo);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
                TuxTextView tuxTextView2 = this.LLL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(strLIZIZ);
                }
                TagLayout tagLayout6 = this.LLJZIJLIL;
                if (tagLayout6 != null) {
                    tagLayout = tagLayout6;
                }
                tagLayout.addView(this.LLL, new LinearLayout.LayoutParams(-2, -1));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJZIJLIL = (TagLayout) view.findViewById(R.id.hv4);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
