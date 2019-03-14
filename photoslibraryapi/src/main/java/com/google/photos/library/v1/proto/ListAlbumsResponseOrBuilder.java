// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface ListAlbumsResponseOrBuilder
        extends
        // @@protoc_insertion_point(interface_extends:google.photos.library.v1.ListAlbumsResponse)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * [Output only] List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.Album albums = 1;</code>
     */
    java.util.List<com.google.photos.library.v1.proto.Album> getAlbumsList();

    /**
     * <pre>
     * [Output only] List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.Album albums = 1;</code>
     */
    com.google.photos.library.v1.proto.Album getAlbums(int index);

    /**
     * <pre>
     * [Output only] List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.Album albums = 1;</code>
     */
    int getAlbumsCount();

    /**
     * <pre>
     * [Output only] List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.Album albums = 1;</code>
     */
    java.util.List<? extends com.google.photos.library.v1.proto.AlbumOrBuilder>
    getAlbumsOrBuilderList();

    /**
     * <pre>
     * [Output only] List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.Album albums = 1;</code>
     */
    com.google.photos.library.v1.proto.AlbumOrBuilder getAlbumsOrBuilder(int index);

    /**
     * <pre>
     * [Output only] Token to use to get the next set of albums. Populated if
     * there are more albums to retrieve for this request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    java.lang.String getNextPageToken();

    /**
     * <pre>
     * [Output only] Token to use to get the next set of albums. Populated if
     * there are more albums to retrieve for this request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    com.google.protobuf.ByteString getNextPageTokenBytes();
}
