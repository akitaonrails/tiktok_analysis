package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class SchemaData_OptTypeAdapter extends TypeAdapter<SchemaData> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final SchemaData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SchemaData schemaData = new SchemaData();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2099134262:
                        if (strLJJJJ.equals("user_guessing_join")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.userGuessingJoin = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1989277917:
                        if (strLJJJJ.equals("creator_ranking")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.creatorRanking = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1879084673:
                        if (strLJJJJ.equals("creator_guide_pin")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.creatorGuidePin = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1824948610:
                        if (strLJJJJ.equals("user_guessing_room_records")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.userGuessingRoomRecords = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1363582817:
                        if (strLJJJJ.equals("user_guessing")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.userGuessing = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -901529159:
                        if (strLJJJJ.equals("user_points_detail")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.userPointsDetail = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -121982879:
                        if (strLJJJJ.equals("creator_guessing_records")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.creatorGuessingRecords = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -67708427:
                        if (strLJJJJ.equals("user_guessing_pin")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.guessingPinCard = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 247280084:
                        if (strLJJJJ.equals("user_points_claim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.userPointsClaim = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 264119836:
                        if (strLJJJJ.equals("user_points_using")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.userPointsUsing = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 964153085:
                        if (strLJJJJ.equals("creator_guessing_create")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.creatorGuessingCreate = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1054438274:
                        if (strLJJJJ.equals("guessing_faq")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.guessingFaq = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1308271995:
                        if (strLJJJJ.equals("guessing_indicator")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.guessingIndicator = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1457075752:
                        if (strLJJJJ.equals("guessing_short_touch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.guessingShortTouch = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1744784681:
                        if (strLJJJJ.equals("creator_guide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.creatorGuide = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1923761544:
                        if (strLJJJJ.equals("user_guide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.userGuide = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1928402594:
                        if (strLJJJJ.equals("user_guessing_records")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                schemaData.userGuessingRecords = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return schemaData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SchemaData schemaData) {
        SchemaData schemaData2 = schemaData;
        if (schemaData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("guessing_faq");
        c09dl.LJJJJJ(schemaData2.guessingFaq);
        c09dl.LJIILLIIL("creator_guide");
        c09dl.LJJJJJ(schemaData2.creatorGuide);
        c09dl.LJIILLIIL("creator_guide_pin");
        c09dl.LJJJJJ(schemaData2.creatorGuidePin);
        c09dl.LJIILLIIL("creator_guessing_create");
        c09dl.LJJJJJ(schemaData2.creatorGuessingCreate);
        c09dl.LJIILLIIL("creator_guessing_records");
        c09dl.LJJJJJ(schemaData2.creatorGuessingRecords);
        c09dl.LJIILLIIL("creator_ranking");
        c09dl.LJJJJJ(schemaData2.creatorRanking);
        c09dl.LJIILLIIL("user_guide");
        c09dl.LJJJJJ(schemaData2.userGuide);
        c09dl.LJIILLIIL("user_points_claim");
        c09dl.LJJJJJ(schemaData2.userPointsClaim);
        c09dl.LJIILLIIL("user_points_using");
        c09dl.LJJJJJ(schemaData2.userPointsUsing);
        c09dl.LJIILLIIL("user_points_detail");
        c09dl.LJJJJJ(schemaData2.userPointsDetail);
        c09dl.LJIILLIIL("user_guessing_records");
        c09dl.LJJJJJ(schemaData2.userGuessingRecords);
        c09dl.LJIILLIIL("user_guessing_join");
        c09dl.LJJJJJ(schemaData2.userGuessingJoin);
        c09dl.LJIILLIIL("user_guessing");
        c09dl.LJJJJJ(schemaData2.userGuessing);
        c09dl.LJIILLIIL("user_guessing_room_records");
        c09dl.LJJJJJ(schemaData2.userGuessingRoomRecords);
        c09dl.LJIILLIIL("guessing_short_touch");
        c09dl.LJJJJJ(schemaData2.guessingShortTouch);
        c09dl.LJIILLIIL("guessing_indicator");
        c09dl.LJJJJJ(schemaData2.guessingIndicator);
        c09dl.LJIILLIIL("user_guessing_pin");
        c09dl.LJJJJJ(schemaData2.guessingPinCard);
        c09dl.LJII();
    }
}
